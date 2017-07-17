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
                  + "\nF - Flashlight"
                  + "\nD - Dry food"
                  + "\nK - Knife"
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
            case "F": // Flashlight
                this.flashlight();
                break; 
            case "D": // Dry Food
                this.dryFood();
                break; 
            case "K": // Knife
                this.knife();
                break;
            case "R": // Rope
                this.rope();
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

    private void flashlight() {
        this.console.println("\n*** flashlight Stub function called.");
    }

    private void dryFood() {
        this.console.println("\n*** dryFood Stub function called.");
    }

    private void knife() {
        this.console.println("\n*** knife Stub function called.");
    }

    private void rope() {
        this.console.println("\n*** rope Stub function called.");
    }
}
