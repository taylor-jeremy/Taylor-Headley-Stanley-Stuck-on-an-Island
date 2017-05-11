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
 * @author Robbie
 */
public class BuildScene implements Serializable{

    // class instance variables
    private String description;
    private String availableTools;
    private String buildTools;
    private double energy;
    private double health;

    public BuildScene() {
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.description);
        hash = 83 * hash + Objects.hashCode(this.availableTools);
        hash = 83 * hash + Objects.hashCode(this.buildTools);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.energy) ^ (Double.doubleToLongBits(this.energy) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.health) ^ (Double.doubleToLongBits(this.health) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BuildScene other = (BuildScene) obj;
        if (Double.doubleToLongBits(this.energy) != Double.doubleToLongBits(other.energy)) {
            return false;
        }
        if (Double.doubleToLongBits(this.health) != Double.doubleToLongBits(other.health)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.availableTools, other.availableTools)) {
            return false;
        }
        if (!Objects.equals(this.buildTools, other.buildTools)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BuildScene{" + "description=" + description + ", availableTools=" + availableTools + ", buildTools=" + buildTools + ", energy=" + energy + ", health=" + health + '}';
    }
    
    
    
}
