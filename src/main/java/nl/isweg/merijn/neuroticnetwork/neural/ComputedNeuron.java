package nl.isweg.merijn.neuroticnetwork.neural;

import nl.isweg.merijn.neuroticnetwork.node.Computed;
import nl.isweg.merijn.neuroticnetwork.node.Node;

/**
 * A ComputedNeuron is a Computed node (sums its inputs), adjusted with a bias.
 */
public class ComputedNeuron extends Computed implements Neuron {
    private double bias = 0.0;

    @Override
    public double getValue() {
        return super.getValue() + bias;
    }

    /**
     * The value of the ComputedNeuron is the value of the underlying Compute node
     * plus the bias.
     *
     * @return neuron value.
     */


    public double getBias() {
        return bias;
    }

    public void setBias(double bias) {
        this.bias = bias;
    }
}
