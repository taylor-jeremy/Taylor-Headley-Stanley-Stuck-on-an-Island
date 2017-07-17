package citbyui.cit260.stuckOnAnIsland.view;
import byui.cit260.stuckOnAnIsland.control.ActorControl;
import byui.cit260.stuckOnAnIsland.exceptions.ActorControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author taylo
 */
public class WaterStorageView extends View{
    
    private String promptHeight;
    private String promptWeight;
    
    public WaterStorageView(){
        this.promptHeight = "\nPlease enter your character's height in inches: ";
        this.promptWeight = "\nPlease enter your character's weight in pounds: ";
    }

    @Override
    public void display() {
        
        boolean done = false; // set flag to not done
        do {
            String actorsHeight = getInput(promptHeight); // get actor's weight and height
            String actorsWeight = getInput(promptWeight);
            done = this.doAction(actorsHeight, actorsWeight);
        } while(!done);
        
    }

    public boolean doAction(String actorsHeight, String actorsWeight) {
       
       int height = 0;
       int weight = 0;
        
        try {
            try {
            height = Integer.parseInt(actorsHeight); // convert actorsHeight to int
            
            } catch (NumberFormatException nfe) {
                ErrorView.display(this.getClass().getName(), "You must enter a valid number. Try again.");
                return false;
            }
            
            try{
            weight = Integer.parseInt(actorsWeight); // convert actorsWeight to int
            
            } catch (NumberFormatException nfe) {
                ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number. Try again.");
                return false;
            }
            
            double waterStorageCapacity;
            waterStorageCapacity = ActorControl.calcWaterStorageCapacity(height, weight);
            
            this.displayNextView(waterStorageCapacity); // display next view
            
        } catch (ActorControlException ace) {
            ErrorView.display(this.getClass().getName(), ace.getMessage());
            return false;
        }
        return true; // success!
    }

    private void displayNextView(double waterStorageCapacity) {
        // display water storage capacity message
        this.console.println("\n============================================="
                          + "\n Your water storage capacity is " + waterStorageCapacity + "lbs"
                          + "\n============================================"
                          );
    }
    
}
