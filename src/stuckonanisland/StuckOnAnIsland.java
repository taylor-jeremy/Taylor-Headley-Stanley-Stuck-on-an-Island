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
        
        //GatherScene Class Test
        GatherScene gatherOne = new GatherScene();
        
        gatherOne.setDescription("Jungle");
        gatherOne.setAvailableResources("10");
        gatherOne.setGatherResources("yes");
        gatherOne.setEnergy(10);
        
        String gatherSceneInfo = gatherOne.toString();
        System.out.println(gatherSceneInfo);
        
        //BuildScene Class Test
        BuildScene buildOne = new BuildScene();
        
        buildOne.setDescription("Jungle");
        buildOne.setAvailableTools("hammer");
        buildOne.setBuildTools("yes");
        buildOne.setEnergy(10);
        buildOne.setHealth(10);
        
        String buildSceneInfo = buildOne.toString();
        System.out.println(buildSceneInfo);
        
        // Actor Class Test
        Actor actorOne = new Actor();
        
        actorOne.setName("John Doe");
        actorOne.setDescription("Example Description");
        actorOne.setEnergy(10);
        actorOne.setHealth(9);
        actorOne.setLocation("West Bay");
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        // Map Class Test
        Map mapOne = new Map();
        
        mapOne.setDescription("Jungle");
        mapOne.setRowCount(100);
        mapOne.setColumnCount(100);
        mapOne.setCurrentRow(56);
        mapOne.setCurrentColumn(59);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
    }
    
}
