package simpleGraph;

import java.util.LinkedList;
import java.util.List;

class Node<V> {
    boolean visited = false;
    V element;
    List<Node<V>> neighbors = new LinkedList<>();
    Node(V v){
        element = v;
    }
    void addNeighbor(Node<V> v){
        neighbors.add(v);
    }
}
