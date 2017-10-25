package nl.isweg.merijn.neuroticnetwork.node;

/**
 * A Variable is a Node that can be explicitly set to a value.
 */
public class Variable extends Node {
    private double value = 0.0;

    /**
     * Construct a variable with a given value.
     * @param value initial value
     */
    public Variable(double value) {
        this.value = value;
    }

    /**
     * Construct a variable.
     *
     * Default value of the variable is 0.0
     */
    public Variable() {
    }

    @Override
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
