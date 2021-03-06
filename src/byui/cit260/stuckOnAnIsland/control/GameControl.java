package byui.cit260.stuckOnAnIsland.control;
import byui.cit260.stuckOnAnIsland.exceptions.GameControlException;
import byui.cit260.stuckOnAnIsland.model.Actor;
import byui.cit260.stuckOnAnIsland.model.Game;
import byui.cit260.stuckOnAnIsland.model.Location;
import byui.cit260.stuckOnAnIsland.model.Map;
import byui.cit260.stuckOnAnIsland.model.RegularSceneType;
import byui.cit260.stuckOnAnIsland.model.Resource;
import byui.cit260.stuckOnAnIsland.model.ToolItem;
import citbyui.cit260.stuckOnAnIsland.view.ErrorView;
import citbyui.cit260.stuckOnAnIsland.view.View;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import stuckonanisland.StuckOnAnIsland;

/**
 *
 * @author Ronnie-PC
 */
public class GameControl extends View {

    public static Actor createActor(String name) throws GameControlException {
            
            if (name == null) {
                throw new GameControlException("Cannot create actor name with a null value.");
            }
            
            Actor actor = new Actor();
            actor.setName(name);
            
            StuckOnAnIsland.setActor(actor); //save the player
            
            return actor;
        }

    public static void createNewGame(Actor actor) {
        
        Game game = new Game(); //create new game
        StuckOnAnIsland.setCurrentGame(game); // save in StuckOnAnIsland
        
        game.setActor(actor); // save actor in game
        
        createMap(game); // create and initialize the new map
        
        InventoryControl.addResource(Resource.Fruit);
        InventoryControl.addResource(Resource.Fruit);
        InventoryControl.addResource(Resource.Fruit);
        InventoryControl.addResource(Resource.Fruit);
        
        InventoryControl.addResource(Resource.Vegetables);
        InventoryControl.addResource(Resource.Vegetables);
        
        InventoryControl.addResource(Resource.Water);
        
        InventoryControl.addResource(Resource.Wood);
        InventoryControl.addResource(Resource.Wood);
        InventoryControl.addResource(Resource.Wood);
        
        InventoryControl.addResource(Resource.Vines);
        InventoryControl.addResource(Resource.Vines);
        InventoryControl.addResource(Resource.Vines);
        InventoryControl.addResource(Resource.Vines);
        InventoryControl.addResource(Resource.Vines);
        
        InventoryControl.addResource(Resource.Rope);
        InventoryControl.addResource(Resource.Rope);
        
        game.getTool().add(ToolItem.Axe);
        game.getTool().add(ToolItem.Hammer);
        game.getTool().add(ToolItem.Knife);
       
        // this how you add a tool
       // StuckOnAnIsland.getCurrentGame().getTool().add(ToolItem.Axe);
       
    }
    
    public static void createMap(Game game){
        Map map = MapControl.createMap();
        game.setMap(map);
    }

   

    public static void createHelpMenu(Actor actor) {
        StuckOnAnIsland.getOutFile().println("\n*** createHelpMenu stub function called ***");
    }

    

    public static void restartGame(Actor actor) {
        StuckOnAnIsland.getOutFile().println("\n*** restartGame stub function called ***");
    }

    public static void saveGame(Game currentGame, String filePath) throws GameControlException {
        try(FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame); // write the game object out to file
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filepath) throws GameControlException{
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filepath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); // read the game object from file
            
        }
        catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        // close the output file
        StuckOnAnIsland.setCurrentGame(game);
    }
    }

    
    
    

