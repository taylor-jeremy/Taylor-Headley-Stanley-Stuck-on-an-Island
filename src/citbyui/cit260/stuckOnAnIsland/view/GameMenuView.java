/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.stuckOnAnIsland.view;

import byui.cit260.stuckOnAnIsland.model.Game;
import byui.cit260.stuckOnAnIsland.model.Map;
import byui.cit260.stuckOnAnIsland.model.Resource;
import java.util.ArrayList;
import stuckonanisland.StuckOnAnIsland;

/**
 *
 * @author taylo
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                  + "\n-----------------------------------------"
                  + "\n| Game Menu                             |"
                  + "\n-----------------------------------------"
                  + "\nW - Calculate your Water Storage Capacity?"
                  + "\nH - Check your Health?"
                  + "\nT - Build Tools Menu"
                  + "\nJ - Wreckage Inventory Menu"
                  + "\nQ - Quit"
                  + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "M": // dislay Map
                this.dislpayMap();
                break;
            case "W": // Goal of Game
                this.calcWaterStorage();
                break;
            case "R": // View List of Resources
                this.viewResource();
                break;
            case "H": // Fast Travel
                this.calcHealth();
                break;
            case "T": // Tools Menu
                this.buildTools();
                break;
            case "J": // Wreckage Inventory Menu
                this.wreckageInventory();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    
     //void displayMenu() {
       // WaterStorageView waterStorageView = new WaterStorageView();
       // waterStorageView.displayWaterStorageView();
    //}
    
    private void calcWaterStorage() {
        WaterStorageView waterStorageView = new WaterStorageView();
        waterStorageView.display();
    }

    private void calcHealth() {
        CheckHealthView checkHealthView = new CheckHealthView();
        checkHealthView.display();
    }

    private void buildTools() {
        BuildTools buildTools = new BuildTools();
        buildTools.display();
    }

    private void wreckageInventory() {
        WreckageInventoryMenuView wreckageInventory = new WreckageInventoryMenuView();
        wreckageInventory.display();
    }

    private void viewResource() {
        StringBuilder line;
        
        Game game = StuckOnAnIsland.getCurrentGame();
        ArrayList<Resource> resource = game.getResource();
        
        System.out.println("\n LIST OF RESOURCE ITEMS");
        line = new StringBuilder("                             ");
        line.insert(0, "DESCRIPTION");
        System.out.println(line.toString());
        
        // for each resource item
        for (Resource item : resource) {
            line = new StringBuilder("                           ");
            line.insert(0, item.getDescription());
            
            // DISPLAY the line
            System.out.println(line.toString());
        }
        
        
    }

    private void dislpayMap() {
        Map map = new Map();
        map.display();
    }
    
}