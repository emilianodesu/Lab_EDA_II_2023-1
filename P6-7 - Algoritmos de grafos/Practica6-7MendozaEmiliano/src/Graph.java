import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class Graph {
    private int V;
    private ArrayList<LinkedList<Integer>> adjArray;
    // LinkedList<Integer> adjArray[];

    public Graph(int v) {
        V = v;
        // adjArray = new LinkedList[v];
        adjArray = new ArrayList<>();
        for (int i = 0; i < v; ++i)
            // adjArray[i] = new LinkedList();
            adjArray.add(i, new LinkedList<Integer>());
    }

    public void addEdge(int v, int w) {
        // adjArray[v].add(w);
        adjArray.get(v).add(w);
        // adjArray[w].add(v);
        adjArray.get(w).add(v);
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

    public void BFS(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adjArray.get(s).listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        System.out.println("");
    }

    public void DFS (int v){
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }

    public void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.println(v + " ");

        Iterator<Integer> i = adjArray.get(v).listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
}