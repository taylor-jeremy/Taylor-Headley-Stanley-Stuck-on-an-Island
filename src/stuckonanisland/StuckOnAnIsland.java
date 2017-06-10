/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuckonanisland;

import byui.cit260.stuckOnAnIsland.model.Actor;
import byui.cit260.stuckOnAnIsland.model.Game;
import byui.cit260.stuckOnAnIsland.model.Location;
import byui.cit260.stuckOnAnIsland.model.RaftScene;
import byui.cit260.stuckOnAnIsland.model.RegularSceneType;
import byui.cit260.stuckOnAnIsland.model.GatherScene;
import byui.cit260.stuckOnAnIsland.model.BuildScene;
import byui.cit260.stuckOnAnIsland.model.Map;
import citbyui.cit260.stuckOnAnIsland.view.StartProgramView;

/**
 *
 * @author taylo
 */
public class StuckOnAnIsland {
    
    private static Game currentGame = null;
    private static Actor actor = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        StuckOnAnIsland.currentGame = currentGame;
    }

    public static Actor getActor() {
        return actor;
    }

    public static void setActor(Actor actor) {
        StuckOnAnIsland.actor = actor;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }
    
}
