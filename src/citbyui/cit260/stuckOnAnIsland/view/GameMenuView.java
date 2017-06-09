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
public class GameMenuView {

     private String menu;

    void displayMenu() {
         boolean done = false; // set flag to not done
        
        do {
            // prompt for and get menu option choice
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the request action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
    }
    
    public GameMenuView() {
        this.menu = "\n"
                  + "\n-----------------------------------------"
                  + "\n| Game Menu                             |"
                  + "\n-----------------------------------------"
                  + "\nW - Calculate your Water Storage Capacity?"
                  + "\nH - Check your Health?"
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
            case "W": // Goal of Game
                this.calcWaterStorage();
                break;
            case "H": // Fast Travel
                this.calcHealth();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    
     //void displayMenu() {
       // WaterStorageView waterStorageView = new WaterStorageView();
       // waterStorageView.displayWaterStorageView();
    //}
    
    private void calcWaterStorage() {
        WaterStorageView waterStorageView = new WaterStorageView();
        waterStorageView.displayWaterStorageView();
    }

    private void calcHealth() {
        CheckHealthView checkHealthView = new CheckHealthView();
        checkHealthView.displayCheckHealthView();
    }
    
}