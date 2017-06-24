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
    private BuildScene buildScene;
    private RaftScene raftScene;
    private GatherScene[] gatherScene;
    private Actor actor;

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
    
    

    

    public void setScene(RegularSceneType regularScene) {
        System.out.println("stub function called");
    }
    
    
    
    
    
}
