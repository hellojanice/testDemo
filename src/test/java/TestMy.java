//import org.junit.Test;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

//import static junit.framework.TestCase.assertEquals;


/**
 * Created by janice.zhang on 9/5/17.
 */
public class TestMy {
    @Test
    public void testMyClassPass() {
        MyClass tester = new MyClass();
         int expectValue=Integer.valueOf(System.getProperty("expectValue"));
        assertEquals("0 add 5 must be 5", expectValue, tester.addMethod(0, 5));
    }
}
