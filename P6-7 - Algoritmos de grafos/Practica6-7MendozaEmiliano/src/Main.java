import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // int V = 5;
        // Graph graph = new Graph(V);
        // graph.addEdge(0, 1);
        // graph.addEdge(0, 4);
        // graph.addEdge(1, 2);
        // graph.addEdge(1, 3);
        // graph.addEdge(1, 4);
        // graph.addEdge(2, 3);
        // graph.addEdge(3, 4);
        // graph.printGraph();

        // WGraph grafoP = new WGraph(7);
        // grafoP.addEdge(0, 1, 30);
        // grafoP.addEdge(0, 4, 40);
        // grafoP.addEdge(0, 6, 40);
        // grafoP.addEdge(1, 2, 30);
        // grafoP.addEdge(2, 6, 50);
        // grafoP.addEdge(2, 3, 30);
        // grafoP.addEdge(3, 4, 40);
        // grafoP.addEdge(3, 5, 40);
        // grafoP.addEdge(4, 5, 40);
        // grafoP.printGraph();
        // Graph MST = grafoP.prim(0);
        // MST.printGraph();

        java.util.Scanner stdin = new Scanner(System.in);
        int opcion, nodos, opcion2;
        System.out.println("***** Menu Practica 6-7 *****");
        System.out.println("Selecciona una opcion:");
        System.out.println("1. Grafo no dirigido");
        System.out.println("2. Grafo dirigido");
        System.out.println("3. Grafo ponderado");
        System.out.print("Opcion: ");
        opcion = stdin.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("***** Grafo no dirigido *****");
                System.out.print("Ingresa la cantidad de nodos del grafo: ");
                nodos = stdin.nextInt();
                Graph graph = new Graph(nodos);
                int start;
                do {
                    System.out.println("Selecciona una opción:");
                    System.out.println("1. Agregrar aristas");
                    System.out.println("2. Imprimir grafo");
                    System.out.println("3. Hacer BFS");
                    System.out.println("4. Hacer DFS");
                    System.out.println("5.Salir");
                    System.out.print("Opcion: ");
                    opcion2 = stdin.nextInt();

                    switch (opcion2) {
                        case 1:
                            int v1, v2, flag;
                            do {
                                System.out.print("Ingresa el primer vertice de la arista: ");
                                v1 = stdin.nextInt();
                                System.out.print("Ingresa el segundo vertice de la arista: ");
                                v2 = stdin.nextInt();
                                graph.addEdge(v1, v2);
                                System.out.print("Ingresa 1 para agregar otra arista o 0 para salir: ");
                                flag = stdin.nextInt();
                            } while (flag != 0);
                            break;

                        case 2:
                            graph.printGraph();
                            break;

                        case 3:
                            System.out.print("Ingresa el nodo de inicio: ");
                            start = stdin.nextInt();
                            graph.BFS(start);
                            break;

                        case 4:
                            System.out.print("Ingresa el nodo de inicio: ");
                            start = stdin.nextInt();
                            graph.DFS(start);
                            break;

                        case 5:
                            continue;

                        default:
                            System.out.println("Opcion invalida");
                            continue;
                    }
                } while (opcion2 != 5);
                break;

            case 2:
                System.out.println("***** Grafo dirigido *****");
                System.out.print("Ingresa la cantidad de nodos del grafo: ");
                nodos = stdin.nextInt();
                Digraph digraph = new Digraph(nodos);
                do {
                    System.out.println("Selecciona una opción:");
                    System.out.println("1. Agregrar aristas");
                    System.out.println("2. Imprimir grafo");
                    System.out.println("3.Salir");
                    System.out.print("Opcion: ");
                    opcion2 = stdin.nextInt();
                    switch (opcion2) {
                        case 1:
                            int v1, v2, flag;
                            do {
                                System.out.print("Ingresa el vertice de origen de la arista: ");
                                v1 = stdin.nextInt();
                                System.out.print("Ingresa el vertice de destino de la arista: ");
                                v2 = stdin.nextInt();
                                digraph.addEdge(v1, v2);
                                System.out.print("Ingresa 1 para agregar otra arista o 0 para salir: ");
                                flag = stdin.nextInt();
                            } while (flag != 0);
                            break;

                        case 2:
                            digraph.printGraph();
                            break;

                        case 3:
                            continue;

                        default:
                            System.out.println("Opcion invalida");
                            continue;
                    }
                } while (opcion2 != 3);
                break;

            case 3:
                System.out.println("***** Grafo ponderado *****");
                System.out.print("Ingresa la cantidad de nodos del grafo: ");
                nodos = stdin.nextInt();
                WGraph wgraph = new WGraph(nodos);
                do {
                    System.out.println("Selecciona una opción:");
                    System.out.println("1. Agregrar aristas");
                    System.out.println("2. Imprimir grafo");
                    System.out.println("3. Crear MST");
                    System.out.println("4. Salir");
                    System.out.print("Opcion: ");
                    opcion2 = stdin.nextInt();
                    switch (opcion2) {
                        case 1:
                            int v1, v2, weight, flag;
                            do {
                                System.out.print("Ingresa el primer vertice de la arista: ");
                                v1 = stdin.nextInt();
                                System.out.print("Ingresa el segundo vertice de la arista: ");
                                v2 = stdin.nextInt();
                                System.out.print("Ingresa el valor del peso de la arista: ");
                                weight = stdin.nextInt();
                                wgraph.addEdge(v1, v2, weight);
                                System.out.print("Ingresa 1 para agregar otra arista o 0 para salir: ");
                                flag = stdin.nextInt();
                            } while (flag != 0);
                            break;

                        case 2:
                            wgraph.printGraph();
                            break;

                        case 3:
                            System.out.print("Ingresa el nodo de inicio: ");
                            start = stdin.nextInt();
                            Graph MST = wgraph.prim(start);
                            MST.printGraph();
                            break;

                        case 4:
                            continue;

                        default:
                            System.out.println("Opcion invalida");
                            continue;
                    }
                } while (opcion2 != 4);
                break;

            default:
                System.out.println("Opcion invalida");
                break;
        }
        stdin.close();
    }
}
