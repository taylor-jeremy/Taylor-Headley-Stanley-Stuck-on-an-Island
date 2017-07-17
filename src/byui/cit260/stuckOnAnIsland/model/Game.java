package byui.cit260.stuckOnAnIsland.model;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author taylo
 */
public class Game implements Serializable {
    
    // class instance variables
    private double totalTime;
    private double score;
    
    private Map map;
    private Actor actor;
    private ArrayList<ToolItem> tool;
    private ArrayList<Resource> resources;
   
    
    public Game() {
        resources = new ArrayList<Resource>();
        tool = new ArrayList<ToolItem>(); 
        
    }
    
     public ArrayList<ToolItem> getTool() {
        return tool;
    }

    public ArrayList<Resource> getResource() {
        return resources;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Map getMap() {
        return map;
    }
    
    public void setMap(Map newMap) {
        map = newMap;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    

    
}
