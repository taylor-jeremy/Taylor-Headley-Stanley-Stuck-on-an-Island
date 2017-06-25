/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.control;

import byui.cit260.stuckOnAnIsland.model.Actor;
import byui.cit260.stuckOnAnIsland.model.Game;
import byui.cit260.stuckOnAnIsland.model.Location;
import byui.cit260.stuckOnAnIsland.model.Map;
import byui.cit260.stuckOnAnIsland.model.RegularSceneType;
import byui.cit260.stuckOnAnIsland.model.Resource;
import byui.cit260.stuckOnAnIsland.model.SceneType;
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
        
        Game game = new Game(); //create new game
        StuckOnAnIsland.setCurrentGame(game); // save in StuckOnAnIsland
        
        InventoryControl.addResource(Resource.Fruit);
        InventoryControl.addResource(Resource.Fruit);
        InventoryControl.addResource(Resource.Fruit);
        InventoryControl.addResource(Resource.Fruit);
        
        InventoryControl.addResource(Resource.Vegetables);
        InventoryControl.addResource(Resource.Vegetables);
        
        
        game.setActor(actor); // save actor in game
       
        // this how you add a tool
       // StuckOnAnIsland.getCurrentGame().getTool().add(ToolItem.Axe);
        
        
        createMap(game); // create and initailize the new map
         // save map in game
        
        //move actors to starting poistion in the map
        //MapControl.moveActorsToStartingLocation(map);
        
        
        
         
    }
    
    public static void createMap(Game game){
        Map map = MapControl.createMap();
        game.setMap(map);
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

    /*static void assignScenesToLocations(Map map, RegularSceneType[] regularScenes) {
        
        Location[] locations = map.getLocations();
        
        // start point
        locations[0].setScene(regularScenes[SceneType.homeCamp.ordinal()]);
        locations[1].setScene(regularScenes[SceneType.beach.ordinal()]);
        */
    }

    
    
    

