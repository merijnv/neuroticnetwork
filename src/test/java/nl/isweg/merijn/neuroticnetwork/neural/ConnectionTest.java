package nl.isweg.merijn.neuroticnetwork.neural;

import nl.isweg.merijn.neuroticnetwork.node.Node;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class ConnectionTest {
    private Connection c;

    @Before
    public void before() {
        c = new Connection();
    }

    @Test
    public void aConnectionHasAWeight() {
        c.getWeight();
        assertEquals(1.0, c.getWeight());
    }

    @Test
    public void aConnectionHasAnInput() {
        c.setInput(mockNode());
        assertNotNull(c.getNode());
    }

    @Test
    public void aConnectionCalculates() {
        c.setInput(mockNode());
        assertEquals(1.0, c.getValue());
    }

    @Test
    public void aConnectionWeightInfluencesCalculation() {
        c.setInput(mockNode());
        c.setWeight(0.5);
        assertEquals(0.5, c.getValue(), 0.001);
    }

    private Node mockNode() {
        return new Node() {
            @Override
            public double getValue() {
                return 1.0;
            }
        };
    }
}
