/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.control;
import byui.cit260.stuckOnAnIsland.model.BuildCityScene;
import byui.cit260.stuckOnAnIsland.model.GatherCityScene;
import byui.cit260.stuckOnAnIsland.model.RaftCityScene;
import byui.cit260.stuckOnAnIsland.model.Location;
import byui.cit260.stuckOnAnIsland.model.Map;
import byui.cit260.stuckOnAnIsland.model.RegularCityScene;
import byui.cit260.stuckOnAnIsland.model.RegularSceneType;

/**
 *
 * @author Ronnie-PC
 */
public class MapControl {

    public static Map createMap() {
        
        // create the map
        Map map = new Map();
        Location[] locations = new Location[25];
        
        locations[0] = new Location("Shipwreck Beach");
        locations[1] = new Location("Home Camp");
        locations[2] = new Location("North Mountain Range");
        locations[3] = new Location("Tool Building Shop");
        locations[4] = new Location("North Vegetable Paradise Forest");
        locations[5] = new Location("North Fruit Haven Forest");
        locations[6] = new Location("Northeast Freshwater Creek");
        locations[7] = new Location("Central Mountain Range");
        locations[8] = new Location("Emerald Rain Forest");
        locations[9] = new Location("Fresh Water Creek");
        locations[10] = new Location("Ancient Cave");
        locations[11] = new Location("Central Vegetable Forest");
        locations[12] = new Location("Central Fruit Forest");
        locations[13] = new Location("West Central Beach");
        locations[14] = new Location("West Mountain Range");
        locations[15] = new Location("Cave of Darkness");
        locations[16] = new Location("Mystery Rain Forest");
        locations[17] = new Location("Southwest Vegetable Forest");
        locations[18] = new Location("Southwest Fruit Forest");
        locations[19] = new Location("South Mini Mountain Range");
        locations[20] = new Location("South Fresh Water Creek");
        locations[21] = new Location("Southeast Wind Cave");
        locations[22] = new Location("Southeast Vegetable Forest");
        locations[23] = new Location("Southeast Fruit Forest");
        locations[24] = new Location("Raft Location");
        
        map.setLocations(locations);
                
        assignScenesToLocations(locations);
        return map;
       
    }
    
    private static void assignScenesToLocations(Location[] locations) {
        locations[0].setRegularSceneType(new RegularCityScene());
        locations[1].setRegularSceneType(new RegularCityScene());
        locations[2].setRegularSceneType(new RegularCityScene()); 
        locations[3].setBuildSceneType(new BuildCityScene()); 
        locations[4].setGatherSceneType(new GatherCityScene());
        locations[5].setRegularSceneType(new RegularCityScene());
        locations[6].setRegularSceneType(new RegularCityScene());
        //locations[7].setRegularSceneType(new City3Scene()); 
        //locations[8].setRegularSceneType(new City4Scene()); 
        //locations[9].setRegularSceneType(new City5Scene());
        locations[10].setRegularSceneType(new RegularCityScene());
        locations[11].setRegularSceneType(new RegularCityScene());
        //locations[12].setRegularSceneType(new City3Scene()); 
        //locations[13].setRegularSceneType(new City4Scene()); 
        //locations[14].setRegularSceneType(new City5Scene());
        locations[15].setRegularSceneType(new RegularCityScene());
        //locations[16].setRegularSceneType(new RegularCityScene());
        //locations[17].setRegularSceneType(new City3Scene()); 
        //locations[18].setRegularSceneType(new City4Scene()); 
        //locations[19].setRegularSceneType(new City5Scene());
        locations[20].setRegularSceneType(new RegularCityScene());
        locations[21].setRegularSceneType(new RegularCityScene());
        //locations[22].setRegularSceneType(new City3Scene()); 
        //locations[23].setRegularSceneType(new City4Scene()); 
        //locations[24].setRegularSceneType(new City5Scene());
    }

    /*static void moveActorsToStartingLocation(Map map) {
        System.out.println("stub function called moveActorsToStartingLocation");
    }*/

 
    
    
}
