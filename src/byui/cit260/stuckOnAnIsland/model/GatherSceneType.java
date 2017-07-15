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
public class GatherSceneType implements Serializable{
    
    // class instance variables
    private String description;
    private String availableResources;
    private String gatherResources;
    private double energy;
    private double health;
    
    private Resource[] resource;

    public GatherSceneType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
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

    public Resource[] getResource() {
        return resource;
    }

    public void setResource(Resource[] resource) {
        this.resource = resource;
    }

    
}
