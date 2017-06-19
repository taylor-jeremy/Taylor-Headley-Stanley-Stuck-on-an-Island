/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.stuckOnAnIsland.view;

/**
 *
 * @author Ronnie-PC
 */
public class BuildTools extends View {
    
    public BuildTools() {
    
        super("\n"
                  + "\n-----------------------------------------"
                  + "\n| Tool Building Menu                             |"
                  + "\n-----------------------------------------"
                  + "\nH - Build a Hammer."
                  + "\nK - Build a Knife."
                  + "\nA - Build a Axe."
                  + "\nQ - Quit"
                  + "\n-----------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert to all upper case
        
        switch (value) {
            case "H": // Hammer
                this.buildHammer();
                break;
            case "K": // Knife
                this.buildKnife();
                break;
            case "A": // Axe
                this.buildAxe();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    
    }

    private void buildHammer() {
        System.out.println("\n*** buildHammer Stub function called.");
    }

    private void buildKnife() {
        System.out.println("\n*** buildKnife Stub function called.");
    }

    private void buildAxe() {
        System.out.println("\n*** buildAxe Stub function called.");
    }
    
}
