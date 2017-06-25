/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.stuckOnAnIsland.view;

import byui.cit260.stuckOnAnIsland.model.Game;
import byui.cit260.stuckOnAnIsland.model.Map;
import byui.cit260.stuckOnAnIsland.model.Resource;
import byui.cit260.stuckOnAnIsland.model.ToolItem;
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
                  + "\nI - View your Inventory"
                  + "\nW - Calculate your Water Storage Capacity?"
                  + "\nM - Display Map" 
                  + "\nH - Check your Health?"
                  + "\nR - View list of Resources"
                  + "\nL - View list of Tools"
                  + "\nT - Build Tools Menu"
                  + "\nJ - Wreckage Inventory Menu"
                  + "\nQ - Quit"
                  + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); // convert choice to upper case
        switch (value) {
            case "I": // Water Storage
                this.viewInventory();
                break;
            case "W": // Water Storage
                this.calcWaterStorage();
                break;
            case "M": // Display Map
                this.displayMap();
                break;    
            case "R": // View List of Resources
                this.viewResource();
                break;
            case "L": // View List of Tools
                this.viewTools();
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
    
     private void displayMap() {
        MapView mapView = new MapView();
        mapView.displayMap();
       
    }
    
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
        
        Resource[] items = Resource.values();
        
        for (Resource item : items) {
            System.out.println(item);
        }
    }
    
     private void viewTools() {
       
         ToolItem[] items = ToolItem.values();
         
         for (ToolItem item : items) {
             System.out.println(item);
         }
    }
     
      private void viewInventory() {
        
          int fruitCount = 0;
          int vegetableCount = 0;
          int waterCount = 0;
          int woodCount = 0;
          int vinesCount = 0;
          int ropeCount = 0;
          
          for (Resource item: StuckOnAnIsland.getCurrentGame().getResource()) {
              if (item == Resource.Fruit) {
                  fruitCount++;
              }
              else if (item == Resource.Vegetables) {
                  vegetableCount++;
              }
              else if (item == Resource.Water) {
                  waterCount++;
              }
              else if (item == Resource.Wood) {
                  woodCount++;
              }
              else if (item == Resource.Vines) {
                  vinesCount++;
              }
              else if (item == Resource.Rope) {
                  ropeCount++;
              }
    }
          System.out.println("You have " + fruitCount + " fruit.");
          System.out.println("You have " + vegetableCount + " vegetable.");
          System.out.println("You have " + waterCount + " water.");
          System.out.println("You have " + woodCount + " wood.");
          System.out.println("You have " + vinesCount + " vine.");
          System.out.println("You have " + ropeCount + " rope.");
        
        
        
        
        
        
        /*StringBuilder line;
        
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
        
        
    }*/

   

   

   
}}

  