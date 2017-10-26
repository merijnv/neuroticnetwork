package nl.isweg.merijn.neuroticnetwork.neural;

import nl.isweg.merijn.neuroticnetwork.node.Variable;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class InputNeuronTest {
    @Test
    public void inputNeuronIsAVariable() {
        InputNeuron in = new InputNeuron();
        assertTrue(in instanceof Variable);
    }
}
