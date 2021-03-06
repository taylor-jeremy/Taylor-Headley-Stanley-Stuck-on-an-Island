package byui.cit260.stuckOnAnIsland.model;
import java.io.Serializable;

/**
 *
 * @author Ronnie-PC
 */
public enum ToolItem implements Serializable {
    
    Axe("This tool will be used to gather wood to work the raft."),
    Knife("This tool will be used to cut vine from trees to work on the raft."),
    Hammer("This tool will be used to work on the raft in general.");
    
    private final String description;
    
    ToolItem(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
    
}
