package byui.cit260.stuckOnAnIsland.model;
import java.io.Serializable;

/**
 *
 * @author taylo
 */
public enum Resource implements Serializable {
    Fruit("Helps increase energy"),
    Vegetables("Helps increase energy"),
    Water("Helps increase energy"),
    Wood("Helps build the raft"),
    Vines("Helps build the raft"),
    Rope("Helps build the raft");
    
    private final String description;
    
    Resource(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
}
