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
public class Location implements Serializable{
    
    // class instance variables
    private int row;
    private int column;
    private String visited;
    private String available;
    
    private RegularSceneType[] regularSceneType;

    public Location() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public RegularSceneType[] getRegularSceneType() {
        return regularSceneType;
    }

    public void setRegularSceneType(RegularSceneType[] regularSceneType) {
        this.regularSceneType = regularSceneType;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.row;
        hash = 13 * hash + this.column;
        hash = 13 * hash + Objects.hashCode(this.visited);
        hash = 13 * hash + Objects.hashCode(this.available);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (!Objects.equals(this.available, other.available)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", available=" + available + '}';
    }
    
    
    
    
    
}
