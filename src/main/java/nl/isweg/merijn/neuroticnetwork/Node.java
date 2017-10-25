package nl.isweg.merijn.neuroticnetwork;


/**
 * A Node in the neural network is something you can get a value from.
 *
 * This very basic neural network is based on double values.
 */
public abstract class Node {
    public abstract double getValue();

    @Override
    public String toString() {
        return "(" + getValue() + ")";
    }
}
