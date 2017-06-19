/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.stuckOnAnIsland.view;

import byui.cit260.stuckOnAnIsland.control.ActorControl;
import java.util.Scanner;

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

    private boolean doAction(String actorsHeight, String actorsWeight) {
       
        
        int height = Integer.parseInt(actorsHeight); // convert actorsHeight to int
        int weight = Integer.parseInt(actorsWeight); // convert actorsWeight to int
        
        double waterStorageCapacity;
        waterStorageCapacity = ActorControl.calcWaterStorageCapacity(height, weight);
        
        this.displayNextView(waterStorageCapacity); // display next view
        
        return true; // success!
    }

    private void displayNextView(double waterStorageCapacity) {
        // display water storage capacity message
        System.out.println("\n============================================="
                          + "\n Your water storage capacity is " + waterStorageCapacity + "lbs"
                          + "\n============================================"
                          );
    }
    
}
