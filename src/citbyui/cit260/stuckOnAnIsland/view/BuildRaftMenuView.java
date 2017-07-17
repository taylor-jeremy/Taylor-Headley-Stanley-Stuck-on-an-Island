package citbyui.cit260.stuckOnAnIsland.view;
import byui.cit260.stuckOnAnIsland.model.RaftSceneType;
/**
 *
 * @author taylo
 */
public class BuildRaftMenuView extends View {

    public BuildRaftMenuView() {
         super("\n"
                  + "\n-----------------------------------------"
                  + "\n| Raft Building Menu                             |"
                  + "\n-----------------------------------------"
                  + "\nC - Check Raft Status."
                  + "\nB - Build Raft."
                  + "\nQ - Quit"
                  + "\n-----------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert to all upper case
        
        switch (value) {
            case "C": // raftStatus
                this.raftStatus();
                break;
            case "B": // buildRaft
                this.buildRaft();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    
    }

    private void raftStatus() {
        this.console.println("\n*** raftStatus Stub function called.");
    }

    private void buildRaft() {
        this.console.println("\n*** buildRaft Stub function called.");
    }
}
