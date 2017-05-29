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

    /**
     * Test of calcEnergy method, of class ActorControl.
     */
    @Test
    public void testCalcEnergy() {
        System.out.println("calcEnergy");
        int currentEnergy = 100;
        int buildTools = 30;
        int buildRaft = 40;
        int moveLocation = 50;
        int gatherResources = 60;
        int eatFood = 10;
        int drinkWater = 20;
        ActorControl instance = new ActorControl();
        int expResult = 0;
        int result = instance.calcEnergy(currentEnergy, buildTools, buildRaft, moveLocation, gatherResources, eatFood, drinkWater);
        assertEquals(expResult, result);
        
    
     //test case #2
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        currentEnergy = 30;
        buildTools = 10;
        buildRaft = 0;
        gatherResources = 0;
        moveLocation = 0;
        eatFood = 20;
        drinkWater = 20;
        
        expResult = 60;
        result = instance.calcEnergy(currentEnergy, buildTools, buildRaft, moveLocation, gatherResources, eatFood, drinkWater);
        assertEquals(expResult, result);
        
        //test case #3
        System.out.println("\tTest case #3");
        
        // input values for test case 3
        currentEnergy = 10;
        buildTools = 2;
        buildRaft = 10;
        gatherResources = -10;
        moveLocation = 20;
        eatFood = 30;
        drinkWater = 40;
        
        expResult = -1;
        result = instance.calcEnergy(currentEnergy, buildTools, buildRaft, moveLocation, gatherResources, eatFood, drinkWater);
        assertEquals(expResult, result);
        
        //test case #4
        System.out.println("\tTest case #4");
        
        // input values for test case 4
        currentEnergy = 100;
        buildTools = 1000;
        buildRaft = 10;
        gatherResources = 50;
        moveLocation = 7000;
        eatFood = 2210;
        drinkWater = -10;
        
        expResult = -1;
        result = instance.calcEnergy(currentEnergy, buildTools, buildRaft, moveLocation, gatherResources, eatFood, drinkWater);
        assertEquals(expResult, result);
        
        //test case #5
        System.out.println("\tTest case #5");
        
        // input values for test case 5
        currentEnergy = 20;
        buildTools = 5;
        buildRaft = 10;
        gatherResources = 25;
        moveLocation = 30;
        eatFood = 30;
        drinkWater = 30;
        
        expResult = 10;
        result = instance.calcEnergy(currentEnergy, buildTools, buildRaft, moveLocation, gatherResources, eatFood, drinkWater);
        assertEquals(expResult, result);
        
        //test case #6
        System.out.println("\tTest case #6");
        
        // input values for test case 6
        currentEnergy = 50;
        buildTools = 0;
        buildRaft = 0;
        gatherResources = 0;
        moveLocation = 0;
        eatFood = 20;
        drinkWater = 50;
        
        expResult = 100;
        result = instance.calcEnergy(currentEnergy, buildTools, buildRaft, moveLocation, gatherResources, eatFood, drinkWater);
        assertEquals(expResult, result);
        
        //test case #7
        System.out.println("\tTest case #7");
        
        // input values for test case 7
        currentEnergy = 100;
        buildTools = 100;
        buildRaft = 100;
        gatherResources = 0;
        moveLocation = 0;
        eatFood = 20;
        drinkWater = 20;
        
        expResult = 0;
        result = instance.calcEnergy(currentEnergy, buildTools, buildRaft, moveLocation, gatherResources, eatFood, drinkWater);
        assertEquals(expResult, result);
        
    
}

    /**
     * Test of calcWaterStorageCapacity method, of class ActorControl.
     */
    @Test
    public void testCalcWaterStorageCapacity() {
        System.out.println("calcWaterStorageCapacity");
        
        //test case #1
        System.out.println("\tTest case #1");
        
        //input values for test case 1
        int height = 67;
        int weight = 200;
        ActorControl instance = new ActorControl();
        double expResult = 59.0;
        double result = instance.calcWaterStorageCapacity(height, weight);
        assertEquals(expResult, result, 0.1);
        
        //test case #2
        System.out.println("\tTest case #2");
        
        //input values for test case 2
        height = 35;
        weight = 30;
        
        expResult = -1;
        result = instance.calcWaterStorageCapacity(height, weight);
        assertEquals(expResult, result, 0.1);
        
        //test case #3
        System.out.println("\tTest case #3");
        
        //input values for test case 3
        height = 95;
        weight = 271;
        
        expResult = -1;
        result = instance.calcWaterStorageCapacity(height, weight);
        assertEquals(expResult, result, 0.1);
        
        //test case #4
        System.out.println("\tTest case #4");
        
        //input values for test case 4
        height = 75;
        weight = 29;
        
        expResult = -1;
        result = instance.calcWaterStorageCapacity(height, weight);
        assertEquals(expResult, result, 0.1);
        
        //test case #5
        System.out.println("\tTest case #5");
        
        //input values for test case 5
        height = 36;
        weight = 36;
        
        expResult = 7.0;
        result = instance.calcWaterStorageCapacity(height, weight);
        assertEquals(expResult, result, 0.1);
        
        //test case #6
        System.out.println("\tTest case #6");
        
        //input values for test case 6
        height = 94;
        weight = 270;
        
        expResult = 84.0;
        result = instance.calcWaterStorageCapacity(height, weight);
        assertEquals(expResult, result, 0.1);
        
        //test case #7
        System.out.println("\tTest case #7");
        
        //input values for test case 7
        height = 96;
        weight = 30;
        
        expResult = 9.0;
        result = instance.calcWaterStorageCapacity(height, weight);
        assertEquals(expResult, result, 0.1);
    }
}
