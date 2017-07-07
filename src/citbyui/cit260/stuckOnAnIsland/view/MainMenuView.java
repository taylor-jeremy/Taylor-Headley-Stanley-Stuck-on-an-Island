/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.stuckOnAnIsland.view;

import byui.cit260.stuckOnAnIsland.control.GameControl;
import byui.cit260.stuckOnAnIsland.model.Actor;
import java.util.Scanner;
import stuckonanisland.StuckOnAnIsland;

/**
 *
 * @author taylo
 */
public class MainMenuView extends View{
    

    

                public MainMenuView() {
                    
                  super("\n"
                  + "\n-----------------------------------------"
                  + "\n| Main Menu                             |"
                  + "\n-----------------------------------------"
                  + "\nN - Start new game"
                  + "\nC - Continue saved game"
                  + "\nR - Restart game"
                  + "\nH - Get help on how to play the game"
                  + "\nS - Save game"
                  + "\nQ - Quit"
                  + "\n-----------------------------------------");
    }

    
    @Override            
    public boolean doAction(String value) {
        
        
        value = value.toUpperCase(); // convert to all upper case
       
        
        switch (value) {
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
            case "S": // save the current game
                this.saveGame();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
        // create game
        GameControl.createNewGame(StuckOnAnIsland.getActor());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        // prompt for and get the name of the file to save the game
        this.console.println("\n\nEnter the file path for the file where the game is to be saved.");
        
        String filePath = getInput();
        
        try {
            // start a saved game
            GameControl.getSavedGame(filePath);
            // display the game menu
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
        } catch (Exception ex) {
            
            ErrorView.display("MainMenuView", ex.getMessage());
        }
       
    }

    private void restartGame() {
        // creating restart game
        GameControl.restartGame(StuckOnAnIsland.getActor());
        
        // display restart game menu
        RestartGameView restartMenu = new RestartGameView();
        restartMenu.display();
    }

    private void displayHelpMenu() {
         // create help menu
        GameControl.createHelpMenu(StuckOnAnIsland.getActor());
        
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        
        /*// display save game menu
        SaveGameView saveMenu = new SaveGameView();
        saveMenu.display();*/
        
        this.console.println("\nEnter the file path for the file where the game is to be saved.");
        String filePath = this.getInput();
        
        try {
            // save the game to the file
            GameControl.saveGame(StuckOnAnIsland.getCurrentGame(), filePath);
            
        } catch (Exception ex) {
            ErrorView.display("MainMenuView",  ex.getMessage());
        }
    }
        
}
