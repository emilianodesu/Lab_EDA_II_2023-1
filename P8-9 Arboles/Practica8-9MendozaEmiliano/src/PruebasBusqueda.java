public class PruebasBusqueda {
    public static void main(String[] args) {
        ArbolBinBusq miABB = new ArbolBinBusq(120);
        miABB.add(87);
        miABB.add(140);
        miABB.add(43);
        miABB.add(99);
        miABB.add(130);
        miABB.add(22);
        miABB.add(65);
        miABB.add(93);
        miABB.add(135);
        miABB.add(56);
        System.out.println("Recorrido BFS del arbol");
        miABB.breadthFirst();
        System.out.println("\nEliminando el 56");
        miABB.delete(56);
        miABB.breadthFirst();
        System.out.println("\nEliminando el 120");
        miABB.delete(120);
        miABB.breadthFirst();
        System.out.println("\nEliminando el 87");
        miABB.delete(87);
        miABB.breadthFirst();
    }
}
