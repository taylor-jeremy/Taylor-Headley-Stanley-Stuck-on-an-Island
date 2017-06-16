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
class ExistingGameView extends View {
                    

                 public ExistingGameView() {
                    
                  super("\n"
                  + "\n-----------------------------------------"
                  + "\n| Continue Game Menu                             |"
                  + "\n-----------------------------------------"
                  + "\nAre you sure you want to continue your saved game?"
                  + "\nC - Continue"
                  + "\nX - No. Return to previous menu"
                  + "\n-----------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
         value = value.toUpperCase(); // convert to all upper case
        
        switch (value) {
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
