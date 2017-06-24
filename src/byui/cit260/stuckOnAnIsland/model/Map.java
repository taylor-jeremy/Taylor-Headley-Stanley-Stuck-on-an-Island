/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author taylo
 */
public class Map implements Serializable {
    
    // Class instance variables
    private String description;
    private Location[] locations;


    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

    
    

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
/*
                                + "\n-----------------------------------------"
                                + "\n| Map Locations                             |"
                                + "\n-----------------------------------------"
                                + "\n - Ship Wreckage"
                                + "\n - Home Camp"
                                + "\n - Beach"
                                + "\n - Raft Location"
                                + "\n - Tool Building Shop"
                                + "\n - Vegetable Forrest"
                                + "\n - Fruit Forrest"
                                + "\n - Mountain Range"
                                + "\n - Rain Forrest"
                                + "\n - Fresh Water Creek"
                                + "\n - Cave"
                                + "\n-----------------------------------------");
*/