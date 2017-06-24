/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.control;

import byui.cit260.stuckOnAnIsland.model.Map;
import byui.cit260.stuckOnAnIsland.model.RegularSceneType;
import byui.cit260.stuckOnAnIsland.model.SceneType;

/**
 *
 * @author Ronnie-PC
 */
public class MapControl {

    public static Map createMap() {
        
        // create the map
        Map map = new Map();
        
        // create the scenes for the game
        RegularSceneType[] regularScenes = createScenes();
        
        // assign scenes to locations
        GameControl.assignScenesToLocations(map, regularScenes);
        
        return map;   
    }

    static void moveActorsToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static RegularSceneType[] createScenes() {
        
        RegularSceneType[] regularScenes = new RegularSceneType[SceneType.values().length];
        
        RegularSceneType startingScene = new RegularSceneType();
        startingScene.setDescription(
                "You have just lost your way in a intense and brutal ocean storm, you "
                + " have no idea where you have crashed your ship, all you see"
                + " is a beach in front of you, and that you are on some kind of"
                + " island. This is a shipwreck!");
        
        startingScene.setSymbol(" SW ");
        startingScene.setTravelTime(5);
        regularScenes[SceneType.homeCamp.ordinal()] = startingScene;
        
        RegularSceneType finishScene = new RegularSceneType();
        finishScene.setDescription(
                "Congratulation! You have successfuly completed the game and have "
                + "escapted the island on your excellent hand built raft!");
        finishScene.setSymbol(" FN ");
        finishScene.setTravelTime(5);
        regularScenes[SceneType.sailAway.ordinal()] = finishScene;
        
        
       
        
        return regularScenes;
    }
    
}
