package citbyui.cit260.stuckOnAnIsland.view;
import byui.cit260.stuckOnAnIsland.control.ActorControl;
import byui.cit260.stuckOnAnIsland.exceptions.ActorControlException;
import java.util.Scanner;

/**
 *
 * @author taylo
 */
public class CheckEnergyView extends View{
    
    private String promptCurrentEnergy;
    private String promptBuildTools;
    private String promptBuildRaft;
    private String promptMoveLocation;
    private String promptGatherResources;
    private String promptEatFood;
    private String promptDrinkWater;
    

    public CheckEnergyView() {
    
        promptCurrentEnergy = "\nPlease enter your character's last "
                + "calculated energy:";
        promptBuildTools = "\nPlease enter your character's energy from Build Tools:";
        promptBuildRaft = "\nPlease enter your character's energy from Building the Raft:";
        promptMoveLocation = "\nPlease enter your character's energy from moving locations:";
        promptGatherResources = "\nPlease enter your character's energy from gathering resources:";
        promptEatFood = "\nPlease enter your character's energy from eating food:";
        promptDrinkWater = "\nPlease enter your character's energy from drinking water:";
}

    public void display() {
        
        //Get actors currentEnergy, buildTools, buildRaft, moveLocation, gatherResources, eatFood, and drinkWater 
         boolean done = false; // set flag to not done
        do {
            String actorsCurrentEnergy = getInput(promptCurrentEnergy); 
            String actorsBuildTools = getInput(promptBuildTools);
            String actorsBuildRaft = getInput(promptBuildRaft);
            String actorsMoveLocation = getInput(promptMoveLocation);
            String actorsGatherResources = getInput(promptGatherResources);
            String actorsEatFood = getInput(promptEatFood);
            String actorsDrinkWater = getInput(promptDrinkWater);
            
            done = this.doAction(actorsCurrentEnergy, actorsBuildTools, actorsBuildRaft, actorsMoveLocation, actorsGatherResources, actorsEatFood, actorsDrinkWater);
        } while(!done);
        
    }

    private boolean doAction(String actorsCurrentEnergy, String actorsBuildTools, String actorsBuildRaft, String actorsMoveLocation, String actorsGatherResources, String actorsEatFood, String actorsDrinkWater) {
        int currentEnergy;
        int buildTools;
        int buildRaft;
        int moveLocation;
        int gatherResources;
        int eatFood;
        int drinkWater;
        
        try {
            try {
                currentEnergy = Integer.parseInt(actorsCurrentEnergy); // convert actorsCurrentEnergy to int
            } catch (NumberFormatException nfe) {
                ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number. Try again.");
                return false;
            }
            try {
                buildTools = Integer.parseInt(actorsBuildTools); // convert actorsBuildTools to int
            } catch (NumberFormatException nfe) {
                ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number. Try again.");
                return false;
            }
            try {
                buildRaft = Integer.parseInt(actorsBuildRaft); // convert actorsBuildRaft to int
            } catch (NumberFormatException nfe) {
                ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number. Try again.");
                return false;
            }
            try {
                moveLocation = Integer.parseInt(actorsMoveLocation); // convert actorsMoveLocation to int
            } catch (NumberFormatException nfe) {
                ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number. Try again.");
                return false;
            }
            try {
                gatherResources = Integer.parseInt(actorsGatherResources); // convert actorsGatherResources to int
            } catch (NumberFormatException nfe) {
                ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number. Try again.");
                return false;
            }
            try {
                eatFood = Integer.parseInt(actorsEatFood); // convert actorsEatFood to int
            } catch (NumberFormatException nfe) {
                ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number. Try again.");
                return false;
            }
            try {
                drinkWater = Integer.parseInt(actorsDrinkWater); // convert actorsDrinkWater to int
            } catch (NumberFormatException nfe) {
                ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number. Try again.");
                return false;
            }
            
            int energy;
            energy = ActorControl.calcEnergy(currentEnergy, buildTools, buildRaft, moveLocation, gatherResources, eatFood, drinkWater);

            this.displayNextView(energy); // display next view

        } catch (ActorControlException ace) {
           ErrorView.display(this.getClass().getName(), ace.getMessage());
            return false;
        }
        
        return true; // success!
    }

    private void displayNextView(int energy) {
       // display final Energy message
        this.console.println("\n============================================="
                          + "\n Your New Final Energy Is " + energy
                          + "\n============================================"
                          );
    }  
}

