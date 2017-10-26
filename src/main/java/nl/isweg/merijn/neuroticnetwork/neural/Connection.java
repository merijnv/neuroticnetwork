package nl.isweg.merijn.neuroticnetwork.neural;

import nl.isweg.merijn.neuroticnetwork.node.Node;

/**
 * A Connections is a Node with one input Neuron,
 * a weight with which it multiplies the output of that neuron as its value.
 *
 * The initial weight is 1.0.
 */
public class Connection extends Node {

    private double weight = 1.0;
    private Neuron neuron;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return neuron.getValue() * weight;
    }

    public void setInput(Neuron node) {
        this.neuron = node;
    }

    public Neuron getNeuron() {
        return neuron;
    }
}
