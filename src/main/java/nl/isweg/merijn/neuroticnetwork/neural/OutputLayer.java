package nl.isweg.merijn.neuroticnetwork.neural;

public class OutputLayer extends HiddenLayer {
    public OutputLayer(int numberOfNeurons) {
        super(numberOfNeurons);
    }

    /**
     * Convenience function to get the value of the n'th Neuron in this layer.
     *
     * @param n the neuron
     * @return the value of the network for this neuron.
     */
    public double getValue(int n) {
        return getNeuron(n).getValue();
    }
}
