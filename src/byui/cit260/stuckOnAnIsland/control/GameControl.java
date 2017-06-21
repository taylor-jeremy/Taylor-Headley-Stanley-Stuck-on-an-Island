/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.control;

import byui.cit260.stuckOnAnIsland.model.Actor;
import byui.cit260.stuckOnAnIsland.model.Game;
import byui.cit260.stuckOnAnIsland.model.Tool;
import byui.cit260.stuckOnAnIsland.model.ToolItem;
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
        
        game.setActor(actor); // save actor in game
        
        // create the inventory list and save in the game
        ToolItem[] toolList = GameControl.createToolList();
        game.setTool(toolList);
        
        Resource[] resourceList = GameControl.createResourceList();
        game.setResource(resourceList);
        
        RaftScene raftScene = new RaftScene(); // create new raft
        game.setRaftScene(raftScene); // save raft in game
        
        Map map = MapControl.createMap(); // create and initailize the new map
        game.setMap(map); // save map in game
        
        //move actors to starting poistion in the map
        MapControl.moveActorsToStartingLocation(map);
        
    }
    
    public static ToolItem[] createToolList() {
        
        ToolItem[] tool = new ToolItem[2];
        
        ToolItem Axe = new ToolItem();
        Axe.setDescription("Axe");
        Axe.setQuantityInStock(0);
        Axe.setRequiredAmount(0);
        tool[Tool.Axe.ordinal()] = Axe;
                
        
        
        
        
    
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
    

