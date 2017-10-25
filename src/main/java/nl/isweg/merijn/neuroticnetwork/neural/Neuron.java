package nl.isweg.merijn.neuroticnetwork.neural;

import nl.isweg.merijn.neuroticnetwork.node.Computed;

/**
 * A Neuron is a Computed node (sums its inputs), adjusted with a bias.
 */
public class Neuron extends Computed {
    private double bias = 0.0;

    @Override
    public double getValue() {
        return super.getValue() + bias;
    }

    /**
     * The value of the Neuron is the value of the underlying Compute node
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
