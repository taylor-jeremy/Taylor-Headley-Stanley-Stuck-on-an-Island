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
public class RaftScene implements Serializable {
    
    // class instance variables
    private String description;
    private double energy;
    private String buildRaft;
    private String raftStatus;

    public RaftScene() {
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.energy) ^ (Double.doubleToLongBits(this.energy) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.buildRaft);
        hash = 23 * hash + Objects.hashCode(this.raftStatus);
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
        final RaftScene other = (RaftScene) obj;
        if (Double.doubleToLongBits(this.energy) != Double.doubleToLongBits(other.energy)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.buildRaft, other.buildRaft)) {
            return false;
        }
        if (!Objects.equals(this.raftStatus, other.raftStatus)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RaftScene{" + "description=" + description + ", energy=" + energy + ", buildRaft=" + buildRaft + ", raftStatus=" + raftStatus + '}';
    }
    
    
    
    
}
