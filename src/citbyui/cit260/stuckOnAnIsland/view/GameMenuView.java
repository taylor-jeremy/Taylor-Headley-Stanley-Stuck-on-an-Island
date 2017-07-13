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
import java.io.IOException;
import java.io.PrintWriter;
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
                  + "\nP - Print Inventory Report"
                  + "\nN - Print Tools Report" 
                  + "\nI - View your Inventory"
                  + "\nW - Calculate your Water Storage Capacity?"
                  + "\nM - Display Map" 
                  + "\nE - Check your energy?"
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
            case "P": // Print Report of Inventory
                this.InventoryFilePath();
                break;
            case "N": // Print Report of Tools
                this.toolsFilePath();
                break;
            case "I": // View Inventory
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
            case "E": // Calculate Energy Menu
                this.calcEnergy();
                break;
            case "H": // Calculate Health Menu
                this.calcHealth();
                break;
            case "T": // Tools Menu
                this.buildTools();
                break;
            case "J": // Wreckage Inventory Menu
                this.wreckageInventory();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
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
    
    private void calcEnergy() {
        CheckEnergyView checkEnergyView = new CheckEnergyView();
        checkEnergyView.display();
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
            this.console.println(item);
            
        }
    }
    
     private void viewTools() {
       
         ToolItem[] items = ToolItem.values();
         
         for (ToolItem item : items) {
             this.console.println(item);
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
              if (null != item) switch (item) {
                  case Fruit:
                      fruitCount++;
                      break;
                  case Vegetables:
                      vegetableCount++;
                      break;
                  case Water:
                      waterCount++;
                      break;
                  case Wood:
                      woodCount++;
                      break;
                  case Vines:
                      vinesCount++;
                      break;
                  case Rope:
                      ropeCount++;
                      break;
                  default:
                      break;
              }
    }
          this.console.println("You have " + fruitCount + " fruit.");
          this.console.println("You have " + vegetableCount + " vegetable.");
          this.console.println("You have " + waterCount + " water.");
          this.console.println("You have " + woodCount + " wood.");
          this.console.println("You have " + vinesCount + " vine.");
          this.console.println("You have " + ropeCount + " rope.");
}
      
    private void InventoryFilePath() {
        
        //prompt for and get the name of the file to print the report
        String inventoryFilePath = this.getInput("\n\nEnter the file path for the Inventory Items report to be printed to.");
        ArrayList<Resource> resource = StuckOnAnIsland.getCurrentGame().getResource();
        printInventoryReport(inventoryFilePath, resource);
    }
      
    public void printInventoryReport(String inventoryFilePath, ArrayList<Resource> resource) {
        
        // create BufferedReader object for input file
        try (PrintWriter out = new PrintWriter(inventoryFilePath)) {
            
            // print title and column headings
            out.println("\n\n         Inventory Report        ");
            out.printf("%n%-20s%10s", "Item", "Description");
            out.printf("%n%-20s%10s", "----", "-----------");
            
            // print the iteam, and description of each item. 
            for (Resource item : resource) {
                out.printf("%n%-20s%s", item.name(), item.getDescription());
            }
            console.println("Resources Printed to " + inventoryFilePath + " successfully.");
        } catch (IOException ex) {
            ErrorView.display(getClass().getName(), "I/O Error: " + ex.getMessage());
        }
    }
    private void toolsFilePath () {
        // prompt for and get the name of the file to print the report
        String toolsFilePath = this.getInput("\n\nEnter the file path for the file where the "
                + "tools should be printed to.");
        ArrayList<ToolItem> tool = StuckOnAnIsland.getCurrentGame().getTool();
        printToolsReport(toolsFilePath, tool);
    }

    private void printToolsReport(String toolsFilePath, ArrayList<ToolItem> tool) {
        // create BufferedReader object for input file
        try (PrintWriter out = new PrintWriter(toolsFilePath)) {
            
            // print title and column headings
            out.println("\n\n         Tools Report        ");
            out.printf("%n%-20s%10s", "Tool", "Description");
            out.printf("%n%-20s%10s", "----", "-----------");
            
            // print the iteam, and description of each item. 
            for (ToolItem item : tool) {
                out.printf("%n%-20s%s", item.name(), item.getDescription());
            }
            console.println("Tools Printed to " + toolsFilePath + " successfully.");
        } catch (IOException ex) {
            ErrorView.display(getClass().getName(), "I/O Error: " + ex.getMessage());
        }
    }


}

  
