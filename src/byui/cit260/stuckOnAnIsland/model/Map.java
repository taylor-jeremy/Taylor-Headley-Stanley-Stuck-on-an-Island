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
