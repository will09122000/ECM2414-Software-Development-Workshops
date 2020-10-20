
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yw433
 */
@RunWith(Categories.class)
@IncludeCategory(SlowTests.class)
@SuiteClasses({LargestTest3.class, LargestTest4.class})
public class SlowTestSuite {
    
}
