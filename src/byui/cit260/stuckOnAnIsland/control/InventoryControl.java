package byui.cit260.stuckOnAnIsland.control;

import byui.cit260.stuckOnAnIsland.model.Resource;
import stuckonanisland.StuckOnAnIsland;

/**
 *
 * @author Ronnie-PC
 */
public class InventoryControl {
    
    public static void addResource(Resource resource) {
        
        StuckOnAnIsland.getCurrentGame().getResource().add(resource);
        
    }
    
}
