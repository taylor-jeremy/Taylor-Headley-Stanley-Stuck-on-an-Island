/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Ronnie-PC
 */
public abstract class RegularSceneType implements Serializable {
    
    // class instance variables
    private String description;
    private double travelTime;
    private String symbol;
    

    public RegularSceneType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

  

    

    

    
    
    
    

    
    
    
    
    

