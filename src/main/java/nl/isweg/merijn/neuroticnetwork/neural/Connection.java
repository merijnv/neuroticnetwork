package nl.isweg.merijn.neuroticnetwork.neural;

import nl.isweg.merijn.neuroticnetwork.node.Node;

/**
 * A Connections is a Node with one input Neuron,
 * a weight with which it multiplies the output of the node as its value.
 *
 * The initial weight is 1.0.
 */
public class Connection extends Node {

    private double weight = 1.0;
    private Node node;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return node.getValue() * weight;
    }

    public void setInput(Node node) {
        this.node = node;
    }

    public Node getNode() {
        return node;
    }
}
