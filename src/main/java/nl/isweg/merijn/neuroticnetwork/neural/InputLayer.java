package nl.isweg.merijn.neuroticnetwork.neural;


/**
 * The inputlayer represents the input of the neural network.
 *
 * As a convenience, this layer lets you set the value of a particular input,
 * so you do not have to get a specific input.
 *
 */
public class InputLayer extends Layer<InputNeuron> {

    public InputLayer(int numberOfInputs) {
        for (int i = 0; i < numberOfInputs; i++) {
            addNeuron(new InputNeuron());
        }
    }

    /**
     * Convenience function to set the value of a particular input in the input layer.
     * Equivalent to layer.get(i).setValue(v);
     * @param i the input to set
     * @param v the value to set
     */
    public void setValue(int input, double value) {
        getNeuron(input).setValue(value);
    }
}
