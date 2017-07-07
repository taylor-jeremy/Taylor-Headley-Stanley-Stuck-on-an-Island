/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.stuckOnAnIsland.view;

import byui.cit260.stuckOnAnIsland.model.Game;
import byui.cit260.stuckOnAnIsland.model.Location;
import byui.cit260.stuckOnAnIsland.model.Map;
import stuckonanisland.StuckOnAnIsland;

/**
 *
 * @author Ronnie-PC
 */
public class MapView extends View {
   
    
    public void displayMap(){
        Game game = StuckOnAnIsland.getCurrentGame();
        Map map = game.getMap();
        Location[] locations = map.getLocations();
        
        for (int i =0; i < locations.length; i++){
            this.console.println( 
                "Location " + locations[i].getName() + ": "
                + locations[i].getRegularSceneType().getDescription());
        }
    }
    
}
