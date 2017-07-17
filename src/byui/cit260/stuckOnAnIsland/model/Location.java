package byui.cit260.stuckOnAnIsland.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Ronnie-PC
 */
public class Location implements Serializable{
    
    // class instance variables
    private String name;
    private RegularSceneType regularScene;
    private BuildSceneType buildScene;
    private RaftSceneType raftScene;
    private GatherSceneType gatherScene;
    private Actor actor;

    
    public Location(String locationName) {
        name = locationName;
    }
    
    public String getName() {
        return name;
    }


    public RegularSceneType getRegularSceneType() {
        return regularScene;
    }

    public void setRegularSceneType(RegularSceneType locationScene) {
        this.regularScene = locationScene;
    }
    
    public BuildSceneType getBuildSceneType() {
        return buildScene;
    }

    public void setBuildSceneType(BuildSceneType locationScene) {
        this.buildScene = locationScene;
    }
    
    public RaftSceneType getRaftSceneType() {
        return raftScene;
    }

    public void setRaftSceneType(RaftSceneType locationScene) {
        this.raftScene = locationScene;
    }
    
    public GatherSceneType getGatherSceneType() {
        return gatherScene;
    }

    public void setGatherSceneType(GatherSceneType locationScene) {
        this.gatherScene = locationScene;
    }
     
}
