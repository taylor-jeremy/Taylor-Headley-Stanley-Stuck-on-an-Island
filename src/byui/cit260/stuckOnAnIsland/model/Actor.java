package byui.cit260.stuckOnAnIsland.model;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Ronnie-PC
 */
public class Actor implements Serializable {
    // Class instance variables
    private String name;
    private String description;
    private int energy;
    private int health;
    private String location;

    public Actor() {
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
