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
 * @author Ronnie-PC
 */
public class CheckHealthView {
    
    private String promptCurrentHealth;
    private String promptEnergy;
    private String promptTime;
    

    public CheckHealthView() {
    
        promptCurrentHealth = "\nPlease enter your character's last "
                + "calculated health:";
        promptEnergy = "\nPlease enter your character's current energy:";
        promptTime = "\nPlease enter the amount of time since you last "
                + "checked your health: ";
        
        displayCheckHealthView();

}

    void displayCheckHealthView() {
        
        //Get actors currentHealth, Energy, and Time. 
         boolean done = false; // set flag to not done
        do {
            String actorsCurrentHealth = this.getActorsCurrentHealth(); 
            String actorsEnergy = this.getActorsEnergy();
            String actorsTime = this.getActorsTime();
            
            done = this.doAction(actorsCurrentHealth, actorsEnergy, actorsTime);
        } while(!done);
        
    }

    private String getActorsCurrentHealth() {
       
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.promptCurrentHealth);
            
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

    private String getActorsEnergy() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.promptEnergy);
            
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

    private String getActorsTime() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.promptTime);
            
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

    private boolean doAction(String actorsCurrentHealth, String actorsEnergy, String actorsTime) {
        
        int currentHealth = Integer.parseInt(actorsCurrentHealth); // convert actorsCurrentHealth to int
        int energy = Integer.parseInt(actorsEnergy); // convert actorsEnergy to int
        int time = Integer.parseInt(actorsTime); // convert actorsTime to int
        
        int health;
        health = ActorControl.calcHealth(currentHealth, energy, time);
        
        this.displayNextView(health); // display next view
        
        return true; // success!
    }

    private void displayNextView(int health) {
       // display final Health message
        System.out.println("\n============================================="
                          + "\n Your New Final Health Is " + health
                          + "\n============================================"
                          );
    }
    
    
}

