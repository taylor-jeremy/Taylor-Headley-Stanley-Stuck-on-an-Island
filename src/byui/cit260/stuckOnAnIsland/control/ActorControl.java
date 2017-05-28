/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.control;

/**
 *
 * @author Ronnie-PC
 */
public class ActorControl {
    
        int finalHealth;
        int finalEnergy;
        
    public int calcEnergy(int currentEnergy, int buildTools, int buildRaft, int moveLocation, int gatherResources, int eatFood, int drinkWater) {
    
        if (buildTools < 0 || buildTools > 100) {
            return -1;
        }
        
        if (buildRaft < 0 || buildRaft > 100) {
            return -1;
        }
        
        if (moveLocation < 0 || moveLocation > 100) {
            return -1;
        }
        
        if (gatherResources < 0 || gatherResources > 100) {
            return -1;
        }
        
        if (eatFood < 0 || eatFood > 100) {
            return -1;
        }
        
        if (drinkWater < 0 || drinkWater > 100) {
            return -1;
        }
        
        finalEnergy = (currentEnergy - buildTools - buildRaft - moveLocation - gatherResources + eatFood + drinkWater);
        
        if (finalEnergy > 100) {
            return Math.min(100, finalEnergy);
        }
        
        if (finalEnergy < 0) {
            return Math.max(0, finalEnergy);
        }
        return finalEnergy;
    }
    
    public int calcHealth(int currentHealth, int energy, int time) {
    
        if (energy < 0 || energy > 100) {
            return -1;
        }
 
        if (time < 1 || time > 5) {
            return -1;
        }
                    
        if (energy < 20) {
            return Math.max(0, currentHealth - (30 * time));
        }
                    
        if (energy < 50) {
            return Math.max(0, currentHealth - (20 * time));
        }
            
        if (energy >= 50) {
            return Math.min(100, currentHealth + (20 * time));
        }
 
        return finalHealth;
    }
    
}
