package nl.isweg.merijn.neuroticnetwork.neural;

import java.util.ArrayList;
import java.util.List;

/**
 * The Layer is able to connect to a previous layer.
 * It contains either Variables (the InputLayer) or
 * it contains Neurons (HiddenLayer and OutputLayer).
 *
 * The OutputLayer is just a semantic entity in this version,
 * simply extending the Hidden layer.
 */
public class Layer<N extends Neuron> {
    private List<N> neurons = new ArrayList<>(2);

    public void addNeuron(N n){
        neurons.add(n);
    }

    /**
     * Gets the i-th neuron, 0-indexed.
     * @param i the neuron to get.
     * @return the neuron.
     */
    public N getNeuron(int i) {
        return neurons.get(i);
    }

    public int size() {
        return neurons.size();
    }
}
