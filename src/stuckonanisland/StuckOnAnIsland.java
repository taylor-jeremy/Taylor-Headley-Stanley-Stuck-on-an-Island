package stuckonanisland;

import byui.cit260.stuckOnAnIsland.model.Actor;
import byui.cit260.stuckOnAnIsland.model.Game;
import byui.cit260.stuckOnAnIsland.model.Location;
import byui.cit260.stuckOnAnIsland.model.RaftSceneType;
import byui.cit260.stuckOnAnIsland.model.RegularSceneType;
import byui.cit260.stuckOnAnIsland.model.GatherSceneType;
import byui.cit260.stuckOnAnIsland.model.BuildSceneType;
import byui.cit260.stuckOnAnIsland.model.Map;
import citbyui.cit260.stuckOnAnIsland.view.ErrorView;
import citbyui.cit260.stuckOnAnIsland.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author taylo
 */
public class StuckOnAnIsland {
    
    private static Game currentGame = null;
    private static Actor actor = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        StuckOnAnIsland.currentGame = currentGame;
    }

    public static Actor getActor() {
        return actor;
    }

    public static void setActor(Actor actor) {
        StuckOnAnIsland.actor = actor;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
            // open character stream files for end user input and output
            StuckOnAnIsland.inFile = new BufferedReader(new InputStreamReader(System.in));
            StuckOnAnIsland.outFile = new PrintWriter(System.out, true);
            
            // open log file
            String filePath = "logfile.txt";
            StuckOnAnIsland.logFile = new PrintWriter(filePath);
        
        // create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        
        startProgramView.displayStartProgramView();
        return;
        
        } catch (Throwable e) {
            ErrorView.display("StuckOnAnIsland", "Exception: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
            
            e.printStackTrace();
        }
        
        finally {
            try {
                if (StuckOnAnIsland.inFile != null)
                    StuckOnAnIsland.inFile.close();
                
                if (StuckOnAnIsland.outFile != null)
                    StuckOnAnIsland.outFile.close();
                
                if (StuckOnAnIsland.logFile != null)
                    StuckOnAnIsland.logFile.close();
            } catch (IOException ex) {
                ErrorView.display(StuckOnAnIsland.class.getName(), "Error closing files");
                return;
            }
            StuckOnAnIsland.outFile.close();
        }
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        StuckOnAnIsland.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        StuckOnAnIsland.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        StuckOnAnIsland.logFile = logFile;
    }
    
}
