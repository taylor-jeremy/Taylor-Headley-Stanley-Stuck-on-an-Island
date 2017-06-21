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
public class RegularSceneType implements Serializable {
    
    // class instance variables
    private String description;
    private double travelTime;
    private String symbol;
    
    private BuildScene buildScene;
    private RaftScene raftScene;
    private GatherScene gatherScene;

    public RegularSceneType() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BuildScene getBuildScene() {
        return buildScene;
    }

    public void setBuildScene(BuildScene buildScene) {
        this.buildScene = buildScene;
    }

    public RaftScene getRaftScene() {
        return raftScene;
    }

    public void setRaftScene(RaftScene raftScene) {
        this.raftScene = raftScene;
    }

    public GatherScene getGatherScene() {
        return gatherScene;
    }

    public void setGatherScene(GatherScene gatherScene) {
        this.gatherScene = gatherScene;
    }
    
    
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.symbol);
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
        final RegularSceneType other = (RegularSceneType) obj;
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RegularSceneType{" + "description=" + description + ", travelTime=" + travelTime + ", symbol=" + symbol + '}';
    }
    
    
    
    
    
}
