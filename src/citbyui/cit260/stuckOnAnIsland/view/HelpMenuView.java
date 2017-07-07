/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.stuckOnAnIsland.view;

import java.util.Scanner;

/**
 *
 * @author taylo
 */
public class HelpMenuView extends View {
    
    public HelpMenuView() {
        super("\n"
                  + "\n-----------------------------------------"
                  + "\n| Help Menu                             |"
                  + "\n-----------------------------------------"
                  + "\nG - What is the goal of the game?"
                  + "\nT - How to fast travel?"
                  + "\nB - How to build tools?"
                  + "\nR - How to gather resources?"
                  + "\nF - How to build the raft?"
                  + "\nC - How to check raft status?"
                  + "\nE - How does energy work?"
                  + "\nH - How does helath work?"
                  + "\nQ - Quit"
                  + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
         value = value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "G": // Goal of Game
                this.goalOfGame();
                break;
            case "T": // Fast Travel
                this.fastTravel();
                break;
            case "B": // Build Tools
                this.buildTools();
                break;
            case "R": // Gather Resources
                this.gatherResources();
                break;
            case "F": // Build Raft
                this.buildRaft();
                break; 
            case "C": // Check Raft Status
                this.raftStatus();
                break; 
            case "E": // How energy works
                this.energyFacts();
                break;
            case "H": // How helath works
                this.healthFacts();
                break;      
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    
    }

    private void goalOfGame() {
        this.console.println("\n*** The Goal of the game is to build the raft"
                + " and escape the island.");
    }

    private void fastTravel() {
       this.console.println("\n*** You can use energy to Fast Travel to different"
               + " locations throughout the map through the Fast Travel Menu.");
    }

    private void buildTools() {
        this.console.println("\n*** You can build tools at the build tools "
                + " location on the map, building tools allows you to further "
                + " work on the raft.");
    }

    private void gatherResources() {
        this.console.println("\n*** You can visit many locations on the map"
                + " where various resources are available to be gathered,"
                + " certain resources are required of you later on to escape"
                + " the island.");
    }

    private void buildRaft() {
        this.console.println("\n*** In order to build the raft, you must gather,"
                + " wood, vine, and have the proper energy to be able to work"
                + " on the raft, you must also have the proper tools required"
                + " to work on the raft, which will be showed to you later.");
    }

    private void raftStatus() {
        this.console.println("\n*** At the Raft Scene, you will be able to "
                + " periodicially check the status of your raft, and it will"
                + " tell you how much more resources are required to finish the"
                + " raft.");
    }

    private void energyFacts() {
        this.console.println("\n*** Energy is very important in this game, energy"
                + " is needed to gather resources, build the raft, build tools,"
                + " and to travel, You can gain energy back by drinking or "
                + " eating from your resources.");
    }

    private void healthFacts() {
        this.console.println("\n*** Health is important in order to keep you alive"
                + " and able to escape from the Island. In order to keep your"
                + " health in order, you must keep your energy high, if your"
                + " energy drops below 50, you will lose health, if it drops"
                + " below 20, your health will be lost at an even faster pace."
                + " Health will be assessed every one minute.");
    }
    
}
