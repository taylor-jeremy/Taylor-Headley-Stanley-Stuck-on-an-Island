/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.control;

import byui.cit260.stuckOnAnIsland.model.Actor;
import stuckonanisland.StuckOnAnIsland;

/**
 *
 * @author Ronnie-PC
 */
public class GameControl {

    public static Actor createActor(String name) {
            
            if (name == null) {
                return null;
            }
            
            Actor actor = new Actor();
            actor.setName(name);
            
            StuckOnAnIsland.setActor(actor); //save the player
            
            return actor;
        }

    public static void createNewGame(Actor actor) {
        System.out.println("\n*** createNewGame stub function called ***");
    }

    public static void createHelpMenu(Actor actor) {
        System.out.println("\n*** createHelpMenu stub function called ***");
    }

    public static void startExistingGame(Actor actor) {
        System.out.println("\n*** startExistingGame stub function called. In the future, this will start the game. ***");
    }

    public static void restartGame(Actor actor) {
        System.out.println("\n*** restartGame stub function called ***");
    }
    }
    

