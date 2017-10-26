package nl.isweg.merijn.neuroticnetwork.neural;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HiddenLayerTest {
    HiddenLayer hiddenLayer = null;

    @Before
    public void init() {
        hiddenLayer = new HiddenLayer(1);
    }

    @Test
    public void hiddenLayerCanConnect() {
        // create a minimal network
        // this simulates a previous layer, with one node that outputs one.

        Layer<Neuron> l = new Layer<>();
        l.addNeuron(() -> 1.0);
        hiddenLayer.connect(l);

        // ask the value from the computed neuron
        assertEquals(1.0, hiddenLayer.getNeuron(0).getValue());

        // adjust the weight of the connection
        Connection c = (Connection) hiddenLayer.getNeuron(0).getInput(0);
        c.setWeight(0.5);

        // recalculate
        assertEquals(0.5, hiddenLayer.getNeuron(0).getValue(), 0.001);
    }
}
