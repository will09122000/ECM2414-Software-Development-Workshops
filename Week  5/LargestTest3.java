/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.categories.Category;

/**
 *
 * @author yw433
 * This test class (together with LargestTest4) is 
 * written to facilitate your 
 * understanding of Categories in suites (SlowTestSuite)
 */
public class LargestTest3 {
    
    public LargestTest3() {
    }
    
    @Category(SlowTests.class)
    @Test
    public void testOne () {
        assertEquals (1, Largest.largest ( new int [] {1}));
    }

    @Category(FastTests.class)
    @Test
    public void testNegative (){
        int [] negList = new int [] {-9, -8, -7};
        assertEquals (-7, Largest.largest(negList));
    }   
}
