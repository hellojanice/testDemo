import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by janice.zhang on 9/5/17.
 */
public class TestMy {

    @Test
    public void testMyClass() {
        MyClass tester = new MyClass(); // MyClass is tested

        // assert statements
        assertEquals("0 add 10 must be 10", 10, tester.addMethod(0, 10));
        assertEquals("0 add 10 must not be 0", 0, tester.addMethod(0, 10));
    }
}
