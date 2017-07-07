/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.stuckOnAnIsland.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import stuckonanisland.StuckOnAnIsland;

/**
 *
 * @author Ronnie-PC
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = StuckOnAnIsland.getInFile();
    protected final PrintWriter console = StuckOnAnIsland.getOutFile();
    
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
        
        boolean valid = false; // value to be returned
        String value = null; //initialize to not valid
        try {
            // while a valid name has not been retrieved
            while (!valid) {

                // prompt for the input
                this.console.println("\n" + prompt);

                // get the value entered from the keyboard
                value = this.keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks

                if (value.length() < 1) { // blank value entered
                    ErrorView.display(this.getClass().getName(), "You must enter a value.");
                    continue;
                }
                    break;
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
        
        return value;
    }
    
    public boolean doAction(String variable){
        this.console.println("You likely didn't want to call this method.");
        return true;
    }
}
