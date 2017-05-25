/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ronnie-PC
 */
public class ActorControlTest {
    
    public ActorControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcHealth method, of class ActorControl.
     */
    @Test
    public void testCalcHealth() {
        System.out.println("calcHealth");
        
        //test case #1
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        int currentHealth = 100;
        int energy = 5;
        int time = 4;
        ActorControl instance = new ActorControl();
        int expResult = 0;
        int result = instance.calcHealth(currentHealth, energy, time);
        assertEquals(expResult, result);
    
        
        //test case #2
        System.out.println("\tTest case #2");
        
        // input values for test case 1
        currentHealth = 20;
        energy = 10;
        time = -2;
        
        expResult = -1;
        result = instance.calcHealth(currentHealth, energy, time);
        assertEquals(expResult, result);
        
        //test case #3
        System.out.println("\tTest case #3");
        
        // input values for test case 1
        currentHealth = 10;
        energy = -10;
        time = 2;
        
        expResult = -1;
        result = instance.calcHealth(currentHealth, energy, time);
        assertEquals(expResult, result);
        
        //test case #4
        System.out.println("\tTest case #4");
        
        // input values for test case 1
        currentHealth = 90;
        energy = 200;
        time = 3;
        
        expResult = -1;
        result = instance.calcHealth(currentHealth, energy, time);
        assertEquals(expResult, result);
        
        //test case #5
        System.out.println("\tTest case #5");
        
        // input values for test case 1
        currentHealth = 100;
        energy = 100;
        time = 5;
        
        expResult = 100;
        result = instance.calcHealth(currentHealth, energy, time);
        assertEquals(expResult, result);
        
        //test case #6
        System.out.println("\tTest case #6");
        
        // input values for test case 1
        currentHealth = 0;
        energy = 0;
        time = 3;
        
        expResult = 0;
        result = instance.calcHealth(currentHealth, energy, time);
        assertEquals(expResult, result);
        
        //test case #7
        System.out.println("\tTest case #7");
        
        // input values for test case 1
        currentHealth = 100;
        energy = 15;
        time = 1;
        
        expResult = 70;
        result = instance.calcHealth(currentHealth, energy, time);
        assertEquals(expResult, result);
    
    
    
    
    }
        
    
}
