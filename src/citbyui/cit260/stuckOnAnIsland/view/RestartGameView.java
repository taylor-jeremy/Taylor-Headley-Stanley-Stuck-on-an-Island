/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.stuckOnAnIsland.view;

import java.util.Scanner;
/**
 *
 * @author taylo
 */
public class RestartGameView {
    
    private String menu;

    void displayMenu() {
        boolean done = false; // set flag to not done
        
        do {
            // prompt for and get actor's name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the request action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
    }
    
    public RestartGameView() {
        this.menu = "\n"
                  + "\n-----------------------------------------"
                  + "\n| Restart Game Menu                             |"
                  + "\n-----------------------------------------"
                  + "\nR - Restart Game Now"
                  + "\nC - Continue Game"
                  + "\nE - Exit and Save Game"
                  + "\nQ - Quit"
                  + "\n-----------------------------------------";
    }

    private String getMenuOption() {
         System.out.println(menu);
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) {
            System.out.println("Please enter a menu option");
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: please enter a menu option");
                continue;
            }
            valid = true;
                    
        }
        return value; // return the value entered
    }

   private boolean doAction(String menuOption) {
         menuOption = menuOption.toUpperCase(); // convert choice to upper case
        
        switch (menuOption) {
            case "R": // Restart the Game
                this.restartGame();
                break;
            case "C": // Continue and Return to the Game
                this.continueGame();
                break;
            case "E": // Exit and Save the Game
                this.exitSaveGame();
                break;      
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    
    }

    private void restartGame() {
         System.out.println("\n*** restartGame stub function called ***");
    }

    private void continueGame() {
        System.out.println("\n*** continueGame stub function called ***");
    }

    private void exitSaveGame() {
         System.out.println("\n*** exitSaveGame stub function called ***");
    }
    
}

