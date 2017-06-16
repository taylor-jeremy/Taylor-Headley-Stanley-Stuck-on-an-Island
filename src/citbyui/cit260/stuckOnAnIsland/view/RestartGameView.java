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
public class RestartGameView extends View {
    
    
                  public RestartGameView() {
        
                  super("\n"
                  + "\n-----------------------------------------"
                  + "\n| Restart Game Menu                             |"
                  + "\n-----------------------------------------"
                  + "\nR - Restart Game Now"
                  + "\nC - Continue Game"
                  + "\nE - Exit and Save Game"
                  + "\nQ - Quit"
                  + "\n-----------------------------------------");
    }

   @Override
   public boolean doAction(String value) {
        value = value.toUpperCase(); // convert to all upper case
        
        switch (value) {
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

