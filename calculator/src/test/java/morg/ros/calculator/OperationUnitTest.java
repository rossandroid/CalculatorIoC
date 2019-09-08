package morg.ros.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class OperationUnitTest {

    Memory m;
    Operations o;
    @Before public void createOperations(){
        m = new Memory();
        o = new Operations(m);
    }

    @Test
    public void add_isCorrect() {

        assertEquals(3, o.add(1, 2));

    }

    @Test
    public void setMemory_isCorrect() {
        m.saveValue(5);
        o.setMemory(m);
        assertEquals(5, o.getMemory().getValue());

    }


}