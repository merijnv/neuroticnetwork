package nl.isweg.merijn.neuroticnetwork.neural;

/**
 * Marker interface for Neurons.
 *
 * The input neuron is a variable and the computed neurons is a computed node.
 * I want the layers to have Neurons in them, not generic nodes. Allowing that to be nodes
 * would allow Connections to be added to the Layer. And that is not what layers are for.
 *
 * Each neuron has a getValue(), modeled here.
 */
interface Neuron {
    double getValue();
}
