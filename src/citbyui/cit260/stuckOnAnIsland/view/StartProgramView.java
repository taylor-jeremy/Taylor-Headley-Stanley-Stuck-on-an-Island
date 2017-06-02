/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.stuckOnAnIsland.view;

import byui.cit260.stuckOnAnIsland.control.GameControl;
import byui.cit260.stuckOnAnIsland.model.Actor;
import java.util.Scanner;

/**
 *
 * @author Ronnie-PC
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
    
        this.promptMessage = "\nPlease enter your name: ";
        
        this.displayBanner();
        
    }

    private void displayBanner() {
        System.out.println(
        "\n***********************************************"
       +"\n*                                             *"
       +"\n* Welcome to the game Stuck On An Island      *"
       +"\n* In this game you will crash on the island,  *"
       +"\n* you will have the oppurtunity to gather     *"
       +"\n* resources and make your way off the island  *"
       +"\n* by building a raft.                         *"
       +"\n*                                             *"
       +"\n* Good luck and be smart out there!           *"  
       +"\n***********************************************" 
       );
    }

    public void displayStartProgramView() {
        
        //System.out.println("\n*** displayStartProgram() function called ***");
        boolean done = false; // set flag to not done
        do {
                // prompt for and get players name 
                String actorsName = this.getActorsName();
                if (actorsName.toUpperCase().equals("Q")) //user wants to quit
                    return; //exit the game
                
                // do the requested action and display the next view
                done = this.doAction(actorsName);
                
        } while (!done);
        }

    private String getActorsName() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue; 
            }
            
            break; // end the loop
                    
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String ActorsName) {
       
        if (ActorsName.length() <2) {
            System.out.println("\nInvalid plyaers name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control function
        Actor actor = GameControl.createActor(ActorsName);
        
        if (actor == null) { // if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
        
        //display next view
        this.displayNextView();
        
        return true; // success!
    }
    


    private void displayNextView() {
        System.out.println("\n*** displayNextView() called***");
    }}

    


  