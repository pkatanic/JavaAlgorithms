package simpleGraph;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Graph<V> {
    private Map<V, Node<V>> adj;
    Graph(List<V> nodes) {
        adj = new HashMap<>();
        for (V node : nodes) {
            adj.put(node, new Node<V>(node));
        }
    }
    Node<V> getNode(V node){
        return adj.get(node);
    }
    void addNeighbor(V v1, V v2) {
        adj.get(v1).addNeighbor(getNode(v2));
    }
    Collection<Node<V>> getNodes(){
        return adj.values();
    }
}
