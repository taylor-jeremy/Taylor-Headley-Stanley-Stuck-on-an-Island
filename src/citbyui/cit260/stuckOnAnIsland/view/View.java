/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.stuckOnAnIsland.view;

import java.util.Scanner;

/**
 *
 * @author Ronnie-PC
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View() {
    
}
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
         boolean done = false; // set flag to not done
        do {
            // prompt for and get input
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
            return; // exit the view
            
            // do the requested action and display the next view
            done = this.doAction(value);
        } while(!done);
    }
    
    @Override
    public String getInput() {
        return getInput(displayMessage);
    }
    
    public String getInput(String prompt) {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        boolean valid = false; // value to be returned
        String value = null; //initialize to not valid
        
        while (!valid) {
            
            // prompt for the input
            System.out.println("\n" + prompt);
            
            // get the value entered from the keyboard
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // blank value entered
                System.out.println("\n*** You must enter a value *** ");
                continue;
            }
                break;
        }
        return value; // return the value entered
    }
    
    public boolean doAction(String variable){
        System.out.println("You likely didn't want to call this method.");
        return true;
    }
}
