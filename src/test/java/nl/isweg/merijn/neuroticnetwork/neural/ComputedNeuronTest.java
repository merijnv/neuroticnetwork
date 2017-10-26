package nl.isweg.merijn.neuroticnetwork.neural;

import nl.isweg.merijn.neuroticnetwork.node.Variable;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ComputedNeuronTest {
    ComputedNeuron n = null;

    @Before
    public void before() {
        n = new ComputedNeuron();
    }

    @Test
    public void neuronsHaveBiasInitiallyZero() {
        assertEquals(0.0, n.getBias());
    }

    @Test
    public void neuronsCanSetBias() {
        n.setBias(0.5);
        assertEquals(0.5, n.getBias(), 0.001);
    }

    @Test
    public void neuronValueChangeWithBias() {
        n.addNode(new Variable(0.2));
        n.addNode(new Variable(0.2));
        n.setBias(0.5);
        assertEquals(0.9, n.getValue(), 0.001);
    }
}
