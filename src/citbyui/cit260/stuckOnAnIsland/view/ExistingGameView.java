/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.stuckOnAnIsland.view;

import byui.cit260.stuckOnAnIsland.control.GameControl;
import java.util.Scanner;
import stuckonanisland.StuckOnAnIsland;

/**
 *
 * @author taylo
 */
class ExistingGameView {
    
    private String menu;

    void displayMenu() {
        boolean done = false; // set flag to not done
        
        do{
            // prompt for and get menu option choice
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("X")) // user wants to quit menu
                return; // exit to previous menu
            
            // do the request action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
    }
    
    public ExistingGameView() {
        this.menu = "\n"
                  + "\n-----------------------------------------"
                  + "\n| Continue Game Menu                             |"
                  + "\n-----------------------------------------"
                  + "\nAre you sure you want to continue your saved game?"
                  + "\nC - Continue"
                  + "\nX - No. Return to previous menu"
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
            case "C": // Load existing game
                this.createExistingGame();
                break;
            case "X": // Exit menu
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    
    }

    private void createExistingGame() {
        GameControl.startExistingGame(StuckOnAnIsland.getActor());
    }
    
}
