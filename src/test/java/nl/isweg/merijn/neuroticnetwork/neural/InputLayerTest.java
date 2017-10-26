package nl.isweg.merijn.neuroticnetwork.neural;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InputLayerTest {
    InputLayer l = null;

    @Before
    public void init() {
        l = new InputLayer(1);
    }

    @Test
    public void testInputLayersSetInputs() {
        l.setValue(0, 0.5);
        assertEquals(0.5, l.getNeuron(0).getValue());
    }
}
