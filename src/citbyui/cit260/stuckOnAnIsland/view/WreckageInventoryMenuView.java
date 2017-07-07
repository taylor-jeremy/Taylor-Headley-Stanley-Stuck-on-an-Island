/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.stuckOnAnIsland.view;

/**
 *
 * @author taylo
 */
public class WreckageInventoryMenuView extends View {
    
    public WreckageInventoryMenuView(){
        super("\n"
                  + "\n-----------------------------------------"
                  + "\n| Wreckage Inventory                           |"
                  + "\n-----------------------------------------"
                  + "\nC - Canned Food"
                  + "\nW - Bottle of Water"
                  + "\nL - Lighter"
                  + "\nF - Flashlight"
                  + "\nM - Multi-tool"
                  + "\nD - Dry food"
                  + "\nK - Knife"
                  + "\nT - Tarp"
                  + "\nP - Buckets"
                  + "\nQ - Quit"
                  + "\n-----------------------------------------");
    }
    
    @Override
    public boolean doAction(String value){
        value = value.toUpperCase(); // convert choice to uppercase
        
        switch (value) {
            case "C": // Canned Food
                this.cannedFood();
                break;
            case "W": // Bottle of Water
                this.bottleOfWater();
                break;
            case "L": // Lighter
                this.lighter();
                break;
            case "F": // Flashlight
                this.flashlight();
                break;
            case "M": // Multi-tool
                this.multiTool();
                break; 
            case "D": // Dry Food
                this.dryFood();
                break; 
            case "K": // Knife
                this.knife();
                break;
            case "T": // Tarp
                this.tarp();
                break;   
            case "P": // Buckets
                this.buckets();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void cannedFood() {
        this.console.println("\n*** cannedFood Stub function called.");
    }

    private void bottleOfWater() {
        this.console.println("\n*** bottleOfWater Stub function called.");
    }

    private void lighter() {
        this.console.println("\n*** lighter Stub function called.");
    }

    private void flashlight() {
        this.console.println("\n*** flashlight Stub function called.");
    }

    private void multiTool() {
        this.console.println("\n*** multiTool Stub function called.");
    }

    private void dryFood() {
        this.console.println("\n*** dryFood Stub function called.");
    }

    private void knife() {
        this.console.println("\n*** knife Stub function called.");
    }

    private void tarp() {
        this.console.println("\n*** tarp Stub function called.");
    }

    private void buckets() {
        this.console.println("\n*** buckets Stub function called.");
    }
}
