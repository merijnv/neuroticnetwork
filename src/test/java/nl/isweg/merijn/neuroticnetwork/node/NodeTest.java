package nl.isweg.merijn.neuroticnetwork.node;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NodeTest {

    @Test
    public void nodeHasToString() {
        Node n = new Node() {
            @Override
            public double getValue() {
                return 0;
            }
        };
        assertEquals("0.0", n.toString());

    }
}
