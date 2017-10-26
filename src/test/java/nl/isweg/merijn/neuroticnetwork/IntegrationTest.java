package nl.isweg.merijn.neuroticnetwork;

import nl.isweg.merijn.neuroticnetwork.neural.HiddenLayer;
import nl.isweg.merijn.neuroticnetwork.neural.InputLayer;
import nl.isweg.merijn.neuroticnetwork.neural.OutputLayer;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Test towards a full neurotic network!
 */
public class IntegrationTest {

    @Test
    public void constructAndTestThreeLayers() {
        InputLayer input = new InputLayer(2);
        HiddenLayer hidden = new HiddenLayer(3);
        hidden.connect(input);
        OutputLayer output = new OutputLayer(1);
        output.connect(hidden);

        input.setValue(0, 1.0);
        input.setValue(1, 1.0);

        assertEquals(6.0, output.getValue(0), 0.001);

    }
}
