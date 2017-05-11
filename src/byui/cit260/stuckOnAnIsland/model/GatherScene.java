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
public class GatherScene implements Serializable{
    
    // class instance variables
    private String description;
    private String availableResources;
    private String gatherResources;
    private double energy;
    private double health;

    public GatherScene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailableResources() {
        return availableResources;
    }

    public void setAvailableResources(String availableResources) {
        this.availableResources = availableResources;
    }

    public String getGatherResources() {
        return gatherResources;
    }

    public void setGatherResources(String gatherResources) {
        this.gatherResources = gatherResources;
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
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.description);
        hash = 11 * hash + Objects.hashCode(this.availableResources);
        hash = 11 * hash + Objects.hashCode(this.gatherResources);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.energy) ^ (Double.doubleToLongBits(this.energy) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.health) ^ (Double.doubleToLongBits(this.health) >>> 32));
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
        final GatherScene other = (GatherScene) obj;
        if (Double.doubleToLongBits(this.energy) != Double.doubleToLongBits(other.energy)) {
            return false;
        }
        if (Double.doubleToLongBits(this.health) != Double.doubleToLongBits(other.health)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.availableResources, other.availableResources)) {
            return false;
        }
        if (!Objects.equals(this.gatherResources, other.gatherResources)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GatherScene{" + "description=" + description + ", availableResources=" + availableResources + ", gatherResources=" + gatherResources + ", energy=" + energy + ", health=" + health + '}';
    }
    
    
}
