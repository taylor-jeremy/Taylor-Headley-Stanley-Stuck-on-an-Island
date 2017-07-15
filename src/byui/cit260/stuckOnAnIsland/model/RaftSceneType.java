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
 * @author Ronnie-PC
 */
public class RaftSceneType implements Serializable {
    
    // class instance variables
    private String description;
    private double energy;
    private String buildRaft;
    private String raftStatus;

    public RaftSceneType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public String getBuildRaft() {
        return buildRaft;
    }

    public void setBuildRaft(String buildRaft) {
        this.buildRaft = buildRaft;
    }

    public String getRaftStatus() {
        return raftStatus;
    }

    public void setRaftStatus(String raftStatus) {
        this.raftStatus = raftStatus;
    }
    
    
}
