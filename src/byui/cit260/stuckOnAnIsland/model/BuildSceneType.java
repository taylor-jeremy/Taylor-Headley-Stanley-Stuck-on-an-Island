package byui.cit260.stuckOnAnIsland.model;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Robbie
 */
public abstract class BuildSceneType implements Serializable{

    // class instance variables
    private String description;
    private String availableTools;
    private String buildTools;
    private double energy;
    private double health;
   
    public BuildSceneType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getAvailableTools() {
        return availableTools;
    }

    public void setAvailableTools(String availableTools) {
        this.availableTools = availableTools;
    }

    public String getBuildTools() {
        return buildTools;
    }

    public void setBuildTools(String buildTools) {
        this.buildTools = buildTools;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    } 
    
}
