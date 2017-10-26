package nl.isweg.merijn.neuroticnetwork.neural;

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
        c.setInput(mockNeuron());
        assertNotNull(c.getNeuron());
    }

    @Test
    public void aConnectionCalculates() {
        c.setInput(mockNeuron());
        assertEquals(1.0, c.getValue());
    }

    @Test
    public void aConnectionWeightInfluencesCalculation() {
        c.setInput(mockNeuron());
        c.setWeight(0.5);
        assertEquals(0.5, c.getValue(), 0.001);
    }

    private Neuron mockNeuron() {
        return () -> 1.0;
    }
}
