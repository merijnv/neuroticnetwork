This project is an attempt to create a neural network from the ground up, using
plain java and plain java objects.

So, first off, performance is not a concern here, this project is intended to
build a neural network from the ground up to get a better understanding how
they actually work. That is, how the neurons depend on their inputs, how
back-propagation works and maybe a few other things I can learn from this.

My intention is to create this step by step, and have each step sit in separate
branch, so everyone can see the steps I made to create this.

See git branch for the list of steps, checkout each branch in order, to see how
the first step goes to the next etc.


Step 0
======

The basis of this neural network implementation is a compute network, that
consists of Nodes.

Node
----

A Node is just a thing that can return a double value, with a toString that
makes it look kind of like a node.

Inputs, Neurons and Axions (the things between neurons) are all Nodes in the compute network.

Variable
--------

A Variable is a Node that can contain a value. It can be set initially and
later set explicitly.

These form the basis for the inputs of the neural network.


Compute
-------

A compute node has inputs, which all are Nodes.

When asked for its value, it returns the sum of its inputs. 

If it doesn't have any input, the output will be NaN.


Neurons and connections
=======================

Neuron
------

The Neurons in the network are Compute nodes, with a bias.

The value of the Neuron is the sum of its inputs, plus the bias.
