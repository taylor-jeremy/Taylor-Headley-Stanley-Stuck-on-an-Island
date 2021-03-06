package citbyui.cit260.stuckOnAnIsland.view;
import java.io.PrintWriter;
import stuckonanisland.StuckOnAnIsland;

/**
 *
 * @author taylo
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = StuckOnAnIsland.getOutFile();
    private static final PrintWriter logFile = StuckOnAnIsland.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "------------------------------------------------------"
                  + "\n- ERROR - " + errorMessage
                  + "\n------------------------------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
    }
    
}
