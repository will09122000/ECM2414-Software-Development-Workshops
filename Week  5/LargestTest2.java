/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yw433
 * This test class (together with LargestTest) is 
 * written to facilitate your 
 * understanding of TestSuite
 */
public class LargestTest2 {
    
    public LargestTest2() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testOne () {
        assertEquals (1, Largest.largest ( new int [] {1}));
    }

    @Test
    public void testNegative (){
        int [] negList = new int [] {-9, -8, -7};
        assertEquals (-7, Largest.largest(negList));
    }
    
}
