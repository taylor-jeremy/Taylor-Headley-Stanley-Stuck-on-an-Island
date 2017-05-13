/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuckonanisland;

import byui.cit260.stuckOnAnIsland.model.Game;
import byui.cit260.stuckOnAnIsland.model.Location;
import byui.cit260.stuckOnAnIsland.model.RaftScene;
import byui.cit260.stuckOnAnIsland.model.RegularSceneType;

/**
 *
 * @author taylo
 */
public class StuckOnAnIsland {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Game Class Test
        Game gameOne = new Game();
        
        gameOne.setTotalTime(7.00);
        gameOne.setScore(10.00);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        //Loctaion Class Test
        Location locationOne = new Location();
        
        locationOne.setRow(4);
        locationOne.setColumn(10);
        locationOne.setVisited("Yes");
        locationOne.setAvailable("No");
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
                
        //RegularSceneType Class Test
        RegularSceneType sceneOne = new RegularSceneType();
        
        sceneOne.setDescription("The Jungle");
        sceneOne.setTravelTime(13.50);
        sceneOne.setSymbol("$");
        
        String regularSceneTypeInfo = sceneOne.toString();
        System.out.println(regularSceneTypeInfo);
        
        //RaftScene Class Test
        RaftScene raftOne = new RaftScene();
        
        raftOne.setDescription("Oceanside");
        raftOne.setEnergy(10);
        raftOne.setBuildRaft("yes");
        raftOne.setRaftStatus("50% Complete");
        
        String raftSceneInfo = raftOne.toString();
        System.out.println(raftSceneInfo);
    }
    
}
