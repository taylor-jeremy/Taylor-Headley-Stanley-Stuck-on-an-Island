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
 * @author taylo
 */
public class Map implements Serializable {
    
    // Class instance variables
    private String description;
    private int rowCount;
    private int columnCount;
    private int currentRow;
    private int currentColumn;
    
    private Location[] locations;

    public Map() {
    }
    

     public void display() {
        
    
        
        /*if (rowCount < 1 | columnCount < 1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        */
         
        // print out the Locations on the map
        
        System.out.println("\n"
                                + "\n-----------------------------------------"
                                + "\n| Map Locations                             |"
                                + "\n-----------------------------------------"
                                + "\n - Ship Wreckage"
                                + "\n - Home Camp"
                                + "\n - Beach"
                                + "\n - Raft Location"
                                + "\n - Tool Building Shop"
                                + "\n - Vegetable Forrest"
                                + "\n - Fruit Forrest"
                                + "\n - Mountain Range"
                                + "\n - Rain Forrest"
                                + "\n - Fresh Water Creek"
                                + "\n - Cave"
                                + "\n-----------------------------------------");
       
    }

    public Location[] getLocations() {
        return locations;
    }

    public void setLocation(Location[] location) {
        this.locations = location;
    }

    
    

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    
    
    
    
    
    
    //no longer needed
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.description);
        hash = 83 * hash + this.rowCount;
        hash = 83 * hash + this.columnCount;
        hash = 83 * hash + this.currentRow;
        hash = 83 * hash + this.currentColumn;
        return hash;
    }
    
    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", rowCount=" + rowCount + ", columnCount=" + columnCount + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + '}';
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (this.currentRow != other.currentRow) {
            return false;
        }
        if (this.currentColumn != other.currentColumn) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

   

    
}
