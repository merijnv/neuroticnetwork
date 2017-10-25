package nl.isweg.merijn.neuroticnetwork.node;

import nl.isweg.merijn.neuroticnetwork.node.Variable;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VariableTest {
    @Test
    public void defaultZero() {
        Variable v = new Variable();
        assertEquals(0.0, v.getValue());
    }

    @Test
    public void initialValueKept() {
        Variable v = new Variable(0.5);
        assertEquals(0.5, v.getValue());
    }

    @Test
    public void variableValueIsVariable() {
        Variable v = new Variable(0.5);
        assertEquals(0.5, v.getValue(), 0.0001);
        v.setValue(0.8);
        assertEquals(0.8, v.getValue(), 0.0001);

    }
}
