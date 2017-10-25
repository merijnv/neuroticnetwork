package nl.isweg.merijn.neuroticnetwork.node;

import java.util.ArrayList;
import java.util.List;

/**
 * Computed node in a compute network, that sums the
 */
public class Computed extends Node {
    private List<Node> inputs = new ArrayList<Node>(2);

    /**
     * Returns the sum of the inputs.
     *
     * If this compute node has no inputs, it returns NaN.
     * @return the value of this node
     */
    public double getValue() {
        if (inputs.isEmpty()) {
            return Double.NaN;
        }

        return inputs.stream().map(n -> n.getValue()).reduce((a, b) -> a + b).get();
    }

    /**
     * Add a node to the input of this compute node.
     * @param n the node to add.
     */
    public void addNode(Node n) {
        inputs.add(n);
    }

    /**
     * Returns the number of inputs for this node.
     * @return int, the number of inputs.
     */
    public int countInputs() {
        return inputs.size();
    }
}
