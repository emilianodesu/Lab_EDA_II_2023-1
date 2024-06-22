import java.util.LinkedList;
import java.util.Random;

public class Encadenamiento {
    private LinkedList<LinkedList<Integer>> listaDeListas = new LinkedList<>();

    public Encadenamiento() {
        for (int i = 0; i < 15; i++) {
            listaDeListas.add(new LinkedList<Integer>());
        }
    }

    public void agregarElemento(int elemento) {
        Random rand = new Random();
        int indice = rand.nextInt(0,15);
        listaDeListas.get(indice).add(elemento);
        System.out.println(elemento + " se agrego a la lista " + indice);
        this.imprimirLista();
    }

    private void imprimirLista() {
        System.out.println("\nIndice      Sublista");
        for (int i = 0; i < 15; i++) {
            System.out.println(i + "           " + listaDeListas.get(i));
        }
    }
}
