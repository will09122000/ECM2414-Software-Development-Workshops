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
 * This test class (together with LargestTest2) is 
 * written to facilitate your 
 * understanding of TestSuite
 */
public class LargestTest {
    
    public LargestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testOrder () {
	assertEquals (9, Largest.largest (new int[] {8 ,9 ,7}));
        assertEquals (9, Largest.largest (new int [] {8 ,9 ,7}));
        assertEquals (9, Largest.largest (new int [] {7 ,8 ,9}));

    }
    
    @Test
    public void testEmpty () {
        try {
            Largest.largest(new int [] {});
            fail (" Should have thrown an exception ");
        } catch (RuntimeException e) {
            assertTrue ( true );
        }
    }
    
}
