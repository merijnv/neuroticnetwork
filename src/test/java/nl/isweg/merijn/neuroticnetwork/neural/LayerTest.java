package nl.isweg.merijn.neuroticnetwork.neural;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class LayerTest {

   @Test
    public void layerKeepsNeuron() {
        Layer<Neuron> l = new Layer<Neuron>() { };
        l.addNeuron(() -> 0);

        assertNotNull(l.getNeuron(0));
        assertEquals(1, l.size());
    }

    @Test
    public void inputLayerHasInputNeurons() {
        Layer<InputNeuron> l = new Layer<>();
        l.addNeuron(new InputNeuron());

        assertNotNull(l.getNeuron(0));
        assertEquals(1, l.size());
    }

    @Test
    public void hiddenLayerHasComputedNeurons() {
        Layer<ComputedNeuron> l = new Layer<>();
        l.addNeuron(new ComputedNeuron());

        assertNotNull(l.getNeuron(0));
        assertEquals(1, l.size());
    }
}
