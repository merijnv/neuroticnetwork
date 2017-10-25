import nl.isweg.merijn.neuroticnetwork.Variable;
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
}
