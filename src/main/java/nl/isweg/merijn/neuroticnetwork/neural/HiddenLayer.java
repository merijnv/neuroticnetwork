package nl.isweg.merijn.neuroticnetwork.neural;

/**
 * This forms the hidden layer of a neural network.
 * It can connect to another layer, conceptually previous to this one.
 * So, the first HiddenLayer should connectTo the InputLayer.
 */
public class HiddenLayer extends Layer<ComputedNeuron> {
    public HiddenLayer(int numberOfNeurons) {
        for(int i = 0; i < numberOfNeurons; i++) {
            addNeuron(new ComputedNeuron());
        }
    }

    /**
     * This connects this layer to it's previous layer.
     *
     * This connects all Neurons in this layer with all
     * Neurons in the previous layers, using Connections.
     *
     * @param layer The previous layer.
     */
    public void connect(Layer layer) {
        for (int i = 0; i < layer.size(); i++) {
            Neuron prev = layer.getNeuron(i);
            for (int j = 0; j < size(); j++) {
                ComputedNeuron n = getNeuron(j);

                Connection c = new Connection();
                c.setInput(prev); // add the previous node as input to this connection
                n.addNode(c); // add the connection as input to the neuron in this layer

            }
        }
    }
}
