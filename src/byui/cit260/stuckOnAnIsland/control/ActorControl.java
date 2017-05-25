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
