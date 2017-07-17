package citbyui.cit260.stuckOnAnIsland.view;
import byui.cit260.stuckOnAnIsland.control.GameControl;
import byui.cit260.stuckOnAnIsland.exceptions.GameControlException;
import byui.cit260.stuckOnAnIsland.model.Actor;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ronnie-PC
 */
public class StartProgramView extends View {
    
    private String promptMessage;
    
    public StartProgramView() {
    
        this.promptMessage = "\nPlease enter your name: ";
        
        this.displayBanner();
        
    }

    private void displayBanner() {
        this.console.println(
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
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        
        try {
            while (!valid) {
                this.console.println("\n" + this.promptMessage);

                value = this.keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks

                if (value.length() < 1) {
                    ErrorView.display(this.getClass().getName(), "You must enter a value.");
                    continue; 
                }

                break; // end the loop

            }

        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
        return value;
    }

    @Override
    public boolean doAction(String actorsName) {
       
        try {
            if (actorsName.length() < 2) {
                ErrorView.display(this.getClass().getName(), "\nInvalid players name: "
                        + "The name must be greater than one character in length");
                return false;
            }
            
            // call createPlayer() control function
            Actor actor = GameControl.createActor(actorsName);
            
            //display next view
            this.displayNextView(actor);
            
        } catch (GameControlException ex) {
            Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true; // success!
    }
    


    private void displayNextView(Actor actor) {
        
        
        
        //Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display main menu view
        mainMenuView.display();
    }
}

    


  