
// import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class Digraph {
    private int V;
    private ArrayList<LinkedList<Integer>> adjArray;

    public Digraph(int v) {
        V = v;
        adjArray = new ArrayList<>();
        for (int i = 0; i < v; ++i)
            adjArray.add(i, new LinkedList<Integer>());
    }

    public void addEdge(int v, int w) {
        adjArray.get(v).add(w);
    }

    public void printGraph() {
        for (int v = 0; v < this.V; v++) {
            System.out.println("Lista de Adyacencia del vertice " + v);
            System.out.print(v);
            for (Integer node : this.adjArray.get(v)) {
                System.out.print(" -> " + node);
            }
            System.out.println("\n");
        }
    }
}