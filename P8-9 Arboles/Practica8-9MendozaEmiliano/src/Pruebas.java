/**
 *
 * @author Edgar
 */
public class Pruebas {

    public static void main(String args[]) {
        ArbolBin arbol;

        Nodo n7 = new Nodo(7);
        Nodo n9 = new Nodo(9);
        Nodo n1 = new Nodo(1, n7, n9);
        Nodo n15 = new Nodo(15);
        Nodo n8 = new Nodo(8);
        Nodo n4 = new Nodo(4);
        Nodo n2 = new Nodo(2);
        Nodo n16 = new Nodo(16);
        Nodo n3 = new Nodo(3);

        arbol = new ArbolBin(n1);
        arbol.add(n7, n15, 0);
        arbol.add(n7, n8, 1);
        arbol.add(n9, n4, 0);
        arbol.add(n9, n2, 1);
        arbol.add(n15, n16, 1);
        arbol.add(n8, n3, 0);
        arbol.breadthFirst();

        // Nodo n21 = new Nodo(21);
        // Nodo n90 = new Nodo(90);
        // Nodo n7 = new Nodo(7, n21, n90);
        // Nodo n30 = new Nodo(30);
        // Nodo n59 = new Nodo(59);
        // Nodo n14 = new Nodo(14);
        // Nodo n22 = new Nodo(22);
        // Nodo n5 = new Nodo(5);
        // Nodo n6 = new Nodo(6);
        // Nodo n100 = new Nodo(100);

        // arbol = new ArbolBin(n7);
        // arbol.add(n21, n30, 0);
        // arbol.add(n21, n59, 1);
        // arbol.add(n90, n14, 1);
        // arbol.add(n30, n22, 0);
        // arbol.add(n30, n5, 1);
        // arbol.add(n59, n6, 0);
        // arbol.add(n59, n100, 1);
        // arbol.breadthFirst();

        // arbol.delete(21);
        // System.out.println();
        // arbol.breadthFirst();

        System.out.println("\nBuscando algunos valores en el arbol");
        arbol.contains(8);
        arbol.contains(30);
        arbol.contains(15);
        arbol.contains(40);

        // arbol.preorder();
        // arbol.inorder();
        // arbol.postorder();

    }

}
