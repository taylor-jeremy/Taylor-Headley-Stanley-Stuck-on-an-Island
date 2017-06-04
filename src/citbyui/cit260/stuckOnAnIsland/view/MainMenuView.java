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
public class MainMenuView {
    
    private String menu;

    void displayMainMenuView() {
        
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

    public MainMenuView() {
        this.menu = "\n"
                  + "\n-----------------------------------------"
                  + "\n| Main Menu                             |"
                  + "\n-----------------------------------------"
                  + "\nN - Start new game"
                  + "\nC - Continue saved game"
                  + "\nR - Restart game"
                  + "\nH - Get help on how to play the game"
                  + "\nQ - Quit"
                  + "\n-----------------------------------------";
    }

    private String getMenuOption() {
        System.out.println(menu);
        
        Scanner menuChoice = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) {
            value = menuChoice.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: please enter a menu option");
                continue; 
            }
            
            break; // end the loop
                    
        }
        return value; // return the value entered
    }

    private boolean doAction(String menuOption) {
        
        menuOption = menuOption.toUpperCase(); // convert choice to upper case
        
        switch (menuOption) {
            case "N": // create and start a new game
                System.out.println("N");
                this.startNewGame();
                break;
            case "C": // get and continue existing game
                this.startExistingGame();
                break;
            case "R": // restart game (Might want to merge with startNewGame()?)
                this.restartGame();
            case "H": // get help on how to play the game
                this.displayHelpMenu();
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
        System.out.println("*** startNewGame function called ***");
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void restartGame() {
        System.out.println("*** restartGame function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }
        
}
