public class Main {
    public static void main(String[] args) {
        java.util.Scanner stdin = new java.util.Scanner(System.in);
        int option;
        System.out.println("""
                ***** Menu Practica 8-9 *****
                Selecciona una opcion:
                1. Arbol binario
                2. Arbol binario de busqueda
                3. Arbol B""");
        System.out.print("Opcion: ");
        option = stdin.nextInt();
        int nodeValue, side, upperValue;
        boolean created = false;
        
        switch (option) {
            case 1:
                ArbolBin aBinaryTree = new ArbolBin();
                do {
                    System.out.println("""
                            \n***** Arbol binario *****
                            Selecciona una opcion:
                            1. Crear arbol
                            2. Agregar dato
                            3. Eliminar dato
                            4. Imprimir arbol (BFS)
                            5. Notacion prefija (preorden)
                            6. Notacion infija (inorden)
                            7. Notacion postfija (postorden)
                            8. Salir""");
                    System.out.print("Opcion: ");
                    option = stdin.nextInt();

                    switch (option) {
                        case 1:
                            if (!created) {
                                System.out.print("\nIngresa el valor de la raiz: ");
                                nodeValue = stdin.nextInt();
                                aBinaryTree.setRoot(nodeValue);
                                System.out.println("Has creado un nuevo arbol binario con la raiz " + nodeValue);
                                created = true;
                            } else {
                                System.out.println("El arbol binario ya ha sido creado");
                            }
                            break;

                        case 2:
                            System.out.print("\nIngresa el valor del nodo que deseas agregar al arbol binario: ");
                            nodeValue = stdin.nextInt();
                            System.out.println("""
                                    ¿Quien sera el padre de este nodo?
                                    Nodos:""");
                            aBinaryTree.breadthFirst();
                            System.out.print("Opcion: ");
                            upperValue = stdin.nextInt();
                            System.out.println("""
                                    ¿De que lado deseas colocar el nodo?
                                    0. Izquierdo
                                    1. Derecho""");
                            System.out.print("Opcion: ");
                            side = stdin.nextInt();
                            Nodo temp = aBinaryTree.search(upperValue);
                            if (temp != null) {
                                aBinaryTree.add(temp, new Nodo(nodeValue), side);
                            System.out.println("Has agregado el nodo con el valor " + nodeValue + " al arbol binario");
                            }
                            break;

                        case 3:
                            System.out.print("\nIngresa el valor del nodo que deseas eliminar del arbol binario: ");
                            nodeValue = stdin.nextInt();
                            aBinaryTree.delete(nodeValue);
                            System.out.println("Has eliminado el nodo con valor " + nodeValue);
                            break;

                        case 4:
                            System.out.println("\nRecorrido BFS del arbol binario:");
                            aBinaryTree.breadthFirst();
                            break;

                        case 5:
                            System.out.println("\nNotacion prefija del arbol binario:");
                            aBinaryTree.preorder();
                            break;

                        case 6:
                            System.out.println("\nNotacion infija del arbol binario:");
                            aBinaryTree.inorder();
                            break;

                        case 7:
                            System.out.println("\nNotacion postfija del arbol binario:");
                            aBinaryTree.postorder();
                            break;

                        case 8:
                            continue;

                        default:
                            System.out.println("Opcion invalida");
                            continue;
                    }
                } while (option != 8);
                break;

            case 2:
                ArbolBinBusq aBinarySearchTree = new ArbolBinBusq();
                do {
                    System.out.println("""
                            \n***** Arbol binario de busqueda *****
                            Selecciona una opcion:
                            1. Crear arbol
                            2. Agregar dato
                            3. Eliminar dato
                            4. Buscar
                            5. Imprimir arbol (BFS)
                            6. Salir""");
                    System.out.print("Opcion: ");
                    option = stdin.nextInt();

                    switch (option) {
                        case 1:
                            if (!created) {
                                System.out.print("\nIngresa el valor de la raiz: ");
                                nodeValue = stdin.nextInt();
                                aBinarySearchTree.setRoot(nodeValue);
                                System.out.println("Has creado un nuevo arbol binario de busqueda con la raiz " + nodeValue);
                                created = true;
                            } else {
                                System.out.println("El arbol binario ya ha sido creado");
                            }
                            break;

                        case 2:
                            System.out.print("\nIngresa el valor del nodo que deseas agregar al arbol binario de busqueda: ");
                            nodeValue = stdin.nextInt();
                            aBinarySearchTree.add(nodeValue);
                            System.out.println("Has agregado el nodo con el valor " + nodeValue + " al arbol binario de busqueda");
                            break;

                        case 3:
                            System.out.print("\nIngresa el valor del nodo que deseas eliminar del arbol binario de busqueda: ");
                            nodeValue = stdin.nextInt();
                            aBinarySearchTree.delete(nodeValue);
                            System.out.println("Has eliminado el nodo con valor " + nodeValue);
                            break;

                        case 4:
                            System.out.print("\nIngresa el valor del nodo que deseas buscar en el arbol binario de busqueda: ");
                            nodeValue = stdin.nextInt();
                            aBinarySearchTree.contains(nodeValue);
                            break;

                        case 5:
                            System.out.println("\nRecorrido BFS del arbol binario:");
                            aBinarySearchTree.breadthFirst();
                            break;

                        case 6:
                            continue;

                        default:
                            System.out.println("Opcion invalida");
                            continue;
                    }
                } while (option != 6);
                break;

            case 3:
            int m;
            BTree aBTree = new BTree(0);
                do {
                    System.out.println("""
                            \n***** Arbol B *****
                            Selecciona una opcion:
                            1. Crear arbol
                            2. Agregar un valor
                            3. Buscar valor
                            4. Imprimir arbol
                            5. Salir""");
                    System.out.print("Opcion: ");
                    option = stdin.nextInt();

                    switch (option) {
                        case 1:
                            System.out.print("\nIngresa el orden del arbol B que deseas crear: ");
                            m = stdin.nextInt();
                            aBTree.setM(m);
                            System.out.println("Has creado un nuevo arbol B de orden " + m );
                            break;
                        
                        case 2:
                            System.out.print("\nIngresa el valor que deseas agregar al arbol B: ");
                            nodeValue = stdin.nextInt();
                            aBTree.add(nodeValue);
                            System.out.println("Has agregado el valor " + nodeValue + " al arbol B");
                            break;

                        case 3:
                            System.out.print("\nIngresa el valor que deseas buscar en el arbol B: ");
                            nodeValue = stdin.nextInt();
                            Boolean wasFound = aBTree.find(nodeValue);
                            if (wasFound) {
                                System.out.println("El valor " + nodeValue + " SI esta en el arbol B");
                            } else {
                                System.out.println("El valor " + nodeValue + " NO esta en el arbol B");
                            }
                            break;
                        
                        case 4:
                            System.out.println("\nEl arbol B es:");
                            aBTree.mostrarArbol();
                            break;
                        
                        case 5:
                            continue;
                    
                        default:
                            System.out.println("Opcion invalida");
                            continue;
                    }
                } while (option != 5);
                break;

            default:
                System.out.println("Opcion invalida");
                break;
        }
        stdin.close();
    }
}
