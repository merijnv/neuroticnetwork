package nl.isweg.merijn.neuroticnetwork.node;

import nl.isweg.merijn.neuroticnetwork.node.Computed;
import nl.isweg.merijn.neuroticnetwork.node.Variable;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ComputedTest {

    private Computed c = null;

    @Before
    public void before() {
        c = new Computed();
    }

    @Test
    public void givesNaNValueIfNoInputs() {
        assertTrue(Double.valueOf(c.getValue()).isNaN());
    }

    @Test
    public void initallyZeroInputs() {
        assertEquals(0, c.countInputs());
    }

    @Test
    public void canAddInput() {
        c.addNode(new Variable());
        assertEquals(1, c.countInputs());
    }

    @Test
    public void computesValueFromOneNode() {
        c.addNode(new Variable(0.3));
        assertEquals(0.3, c.getValue());
    }

    @Test
    public void computesValueFromTwoNodes () {
        c.addNode(new Variable(0.3));
        c.addNode(new Variable(0.3));
        assertEquals(0.6, c.getValue());
    }

    @Test
    public void computesASmallNetwork() {
        Variable a = new Variable(0.3);
        Computed b = new Computed();
        b.addNode(new Variable(0.2));
        b.addNode(new Variable(0.1));

        c.addNode(a);
        c.addNode(b);

        assertEquals(0.6, c.getValue(), 0.0001);
    }
}
