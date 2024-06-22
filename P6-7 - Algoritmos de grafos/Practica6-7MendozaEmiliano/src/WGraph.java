import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Collections;

public class WGraph {
    private int V;
    private ArrayList<LinkedHashMap<Integer, Integer>> adjArray;

    public WGraph(int v) {
        V = v;
        adjArray = new ArrayList<>();
        for (int i = 0; i < v; ++i)
            adjArray.add(i, new LinkedHashMap<Integer, Integer>());
    }

    public void addEdge(int v, int w, int weight) {
        adjArray.get(v).put(w, weight);
        adjArray.get(w).put(v, weight);
    }

    public void printGraph() {
        for (int v = 0; v < this.V; v++) {
            System.out.println("Lista de Adyacencia del vertice " + v);
            System.out.print(v);

            for (Integer node : adjArray.get(v).keySet()) {
                int weight = adjArray.get(v).get(node);
                System.out.print(" -> [ " + node + ", weight: " + weight + " ]");
            }
            System.out.println("\n");
        }
    }

    public Graph prim(int s) {
        int current = s;
        boolean visited[] = new boolean[V];
        Graph MST = new Graph(V);
        ArrayList<String> pq = new ArrayList<>();

        for (Integer key : adjArray.get(current).keySet()) {
            String edge = Integer.toString(adjArray.get(current).get(key));
            edge += "=" + Integer.toString(current);
            edge += "-" + Integer.toString(key);
            pq.add(edge);
        }
        Collections.sort(pq);
        visited[current] = true;

        while (!pq.isEmpty()) {
            int dest = Integer.parseInt(String.valueOf(pq.get(0).charAt(pq.get(0).length() - 1)));
            pq.remove(0);
            if (!visited[dest]) {
                MST.addEdge(current, dest);
                for (Integer key : adjArray.get(dest).keySet()) {
                    if (visited[key])
                        continue;
                    String edge = Integer.toString(adjArray.get(dest).get(key));
                    edge += "=" + Integer.toString(dest);
                    edge += "-" + Integer.toString(key);
                    pq.add(edge);
                }
                Collections.sort(pq);
                visited[dest] = true;
            }
            // current = dest;
            int index = 0;
            if (!pq.isEmpty()) {
                for (int i = 0; i < pq.get(0).length(); i++) {
                    if (pq.get(0).charAt(i) == '=') {
                        index = i + 1;
                        break;
                    }
                }
                current = Integer.parseInt(String.valueOf(pq.get(0).charAt(index)));
            }
            // if (!pq.isEmpty() && current != Integer.parseInt(String.valueOf(pq.get(0).charAt(index)))) {
            //     current = Integer.parseInt(String.valueOf(pq.get(0).charAt(index)));
            // }
        }

        return MST;
    }

}