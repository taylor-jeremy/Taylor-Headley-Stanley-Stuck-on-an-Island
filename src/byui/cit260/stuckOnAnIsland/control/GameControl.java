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
    }
    

