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
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "C": // get and continue existing game
                this.startExistingGame();
                break;
            case "R": // restart game (Might want to merge with startNewGame()?)
                this.restartGame();
                break;
            case "H": // get help on how to play the game
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
        // create game
        GameControl.createNewGame(StuckOnAnIsland.getActor());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        // creating existing game
        GameControl.startExistingGame(StuckOnAnIsland.getActor());
        
        // display existing game menu
        ExistingGameView existingGame = new ExistingGameView();
        existingGame.displayMenu();
    }

    private void restartGame() {
        // creating restart game
        GameControl.restartGame(StuckOnAnIsland.getActor());
        
        // display restart game menu
        RestartGameView restartMenu = new RestartGameView();
        restartMenu.displayMenu();
    }

    private void displayHelpMenu() {
         // create help menu
        GameControl.createHelpMenu(StuckOnAnIsland.getActor());
        
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }
        
}
