package nl.isweg.merijn.neuroticnetwork.node;


/**
 * A Node in the neural network is something you can get a value from.
 */
public abstract class Node {
    public abstract double getValue();

    @Override
    public String toString() {
        return "" + getValue();
    }
}
