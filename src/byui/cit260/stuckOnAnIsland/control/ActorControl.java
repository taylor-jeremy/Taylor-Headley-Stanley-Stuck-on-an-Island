package byui.cit260.stuckOnAnIsland.control;
import byui.cit260.stuckOnAnIsland.exceptions.ActorControlException;

/**
 *
 * @author Ronnie-PC
 */
public class ActorControl {
    
        static int finalHealth;
        static int finalEnergy;
        
    public static int calcEnergy(int currentEnergy, int buildTools, int buildRaft, int moveLocation, int gatherResources, int eatFood, int drinkWater) 
    throws ActorControlException{
    
        if (buildTools < 0 || buildTools > 100) {
            throw new ActorControlException("Cannot set buildTools to " + buildTools +
                    " because it is not in the range of 0-100");
        }
        
        if (buildRaft < 0 || buildRaft > 100) {
            throw new ActorControlException("Cannot set buildRaft to " + buildRaft +
                    " because it is not in the range of 0-100");
        }
        
        if (moveLocation < 0 || moveLocation > 100) {
            throw new ActorControlException("Cannot set moveLocation to " + moveLocation +
                    " because it is not in the range of 0-100");
        }
        
        if (gatherResources < 0 || gatherResources > 100) {
            throw new ActorControlException("Cannot set gatherResources to " + gatherResources +
                    " because it is not in the range of 0-100");
        }
        
        if (eatFood < 0 || eatFood > 100) {
            throw new ActorControlException("Cannot set eatFood to " + eatFood +
                    " because it is not in the range of 0-100");
        }
        
        if (drinkWater < 0 || drinkWater > 100) {
            throw new ActorControlException("Cannot set drinkWater to " + drinkWater +
                    " because it is not in the range of 0-100");
        }
        
        finalEnergy = (currentEnergy - buildTools - buildRaft - moveLocation - gatherResources + eatFood + drinkWater);
        
        if (finalEnergy > 100) {
            return Math.min(100, finalEnergy);
        }
        
        else if (finalEnergy < 0) {
            return Math.max(0, finalEnergy);
        }
        return finalEnergy;
    }
    
    public static int calcHealth(int currentHealth, int energy, int time)
    throws ActorControlException{
    
        
        
        if (energy < 0 || energy > 100) {
            throw new ActorControlException("Cannot set energy to " + energy +
                    " because it is not in the range of 0-100.");
        }
 
        else if (time < 1 || time > 5) {
            throw new ActorControlException("Cannot set time to " + time +
                    " because it is not in the range of 1-5 mintues.");
        }
        
        else if (currentHealth < 0 || currentHealth > 100) {
            throw new ActorControlException("Cannot set current health to " + currentHealth +
                    " because it is not in the range of 0-100");
        }
                    
        else if (energy < 20) {
            return Math.max(0, currentHealth - (30 * time));
        }
                    
        else if (energy < 50) {
            return Math.max(0, currentHealth - (20 * time));
        }
            
        else if (energy >= 50) {
            return Math.min(100, currentHealth + (20 * time));
        }
 
        return finalHealth;
    }
 
    /**
     *
     * @param height
     * @param weight
     * @return
     * @throws byui.cit260.stuckOnAnIsland.exceptions.ActorControlException
     */
    public static double calcWaterStorageCapacity(int height, int weight) throws ActorControlException {
        if (height < 36 || height > 96) // height is out of range
	throw new ActorControlException("Cannot set actor to height of " + 
                height + " inches because that height is outside the range of 36-96 inches");

        else if (weight < 30 || weight > 270) // weight is out of range
	throw new ActorControlException("Cannot set actor to weight of " + 
                weight + " pounds because that weight is outside the range of 30-270 pounds");

	double bodyMass = (weight * 0.45) / ((height * 0.025) * (height * 0.025));
	double waterStorageCapacity = Math.round((weight / 3.0) - (bodyMass / 4.0)); // Determine water storage based on weight on body mass

        return waterStorageCapacity;

    }
}
