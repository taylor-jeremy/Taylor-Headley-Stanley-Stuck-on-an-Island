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
public class WaterStorageView {
    
    private String promptHeight;
    private String promptWeight;
    
    public WaterStorageView(){
        this.promptHeight = "\nPlease enter your character's height in inches: ";
        this.promptWeight = "\nPlease enter your character's weight in pounds: ";
        
        this.displayWaterStorageView();
    }

    void displayWaterStorageView() {
        
        boolean done = false; // set flag to not done
        do {
            String actorsHeight = this.getActorsHeight(); // get actor's weight and height
            String actorsWeight = this.getActorsWeight();
            
            done = this.doAction(actorsHeight, actorsWeight);
        } while(!done);
        
    }

    private String getActorsHeight() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.promptHeight);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: height cannot be blank");
                continue; 
            }
            
            break; // end the loop
     
        }
        
        return value; // return the value entered
    }

    private String getActorsWeight() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.promptWeight);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: height cannot be blank");
                continue; 
            }
            
            break; // end the loop
     
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String actorsHeight, String actorsWeight) {
        String thirdInput = actorsHeight;
        String fourthInput = actorsWeight;
        
        int height = Integer.parseInt(thirdInput); // convert actorsHeight to int
        int weight = Integer.parseInt(fourthInput); // convert actorsWeight to int
        
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
