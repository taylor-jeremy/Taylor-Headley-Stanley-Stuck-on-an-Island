/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.control;

import byui.cit260.stuckOnAnIsland.model.City1Scene;
import byui.cit260.stuckOnAnIsland.model.City2Scene;
import byui.cit260.stuckOnAnIsland.model.City3Scene;
import byui.cit260.stuckOnAnIsland.model.City4Scene;
import byui.cit260.stuckOnAnIsland.model.City5Scene;
import byui.cit260.stuckOnAnIsland.model.Location;
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
        Location[] locations = new Location[5];
        
        locations[0] = new Location("City1");
        locations[1] = new Location("City2");
        locations[2] = new Location("Ciyt3");
        locations[3] = new Location("City4");
        locations[4] = new Location("City5");
        
        map.setLocations(locations);
                
        assignScenesToLocations(locations);
        return map;
       
    }
    
    private static void assignScenesToLocations(Location[] locations) {
        locations[0].setRegularSceneType(new City1Scene());
        locations[1].setRegularSceneType(new City2Scene());
        locations[2].setRegularSceneType(new City3Scene()); 
        locations[3].setRegularSceneType(new City4Scene()); 
        locations[4].setRegularSceneType(new City5Scene()); 
    }

    /*static void moveActorsToStartingLocation(Map map) {
        System.out.println("stub function called moveActorsToStartingLocation");
    }*/

    
    /*
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
*/

    
    
}
