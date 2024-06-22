public class PruebasNotacion {

    public static void main(String args[]) {
        ArbolBin arbol;

        Nodo n65 = new Nodo(65);
        Nodo n25 = new Nodo(25);
        Nodo n5 = new Nodo(5, n65, n25);
        Nodo n30 = new Nodo(30);
        Nodo n60 = new Nodo(60);
        Nodo n55 = new Nodo(55);
        Nodo n50 = new Nodo(50);
        Nodo n40 = new Nodo(40);
        Nodo n20 = new Nodo(20);
        Nodo n45 = new Nodo(45);
        Nodo n10 = new Nodo(10);
        Nodo n35 = new Nodo(35);
        Nodo n15 = new Nodo(15);

        arbol = new ArbolBin(n5);
        arbol.add(n65, n30, 0);
        arbol.add(n30, n60, 0);
        arbol.add(n30, n55, 1);
        arbol.add(n55, n50, 0);
        arbol.add(n55, n40, 1);
        arbol.add(n50, n20, 0);
        arbol.add(n50, n45, 1);
        arbol.add(n25, n10, 0);
        arbol.add(n10, n35, 1);
        arbol.add(n35, n15, 0);

        System.out.println("BFS: ");
        arbol.breadthFirst();

        System.out.println("\nNotacion prefija: ");
        arbol.preorder();

        System.out.println("\nNotacion infija: ");
        arbol.inorder();

        System.out.println("\nNotacion postfija: ");
        arbol.postorder();

    }

}
