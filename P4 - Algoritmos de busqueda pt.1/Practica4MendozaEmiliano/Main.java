import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

import Ejercicios.BusquedaBinaria;
import Ejercicios.BusquedaLineal;


public class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = new LinkedList<>();

        lista1.add(15);
        lista1.add(92);
        lista1.add(48);
        lista1.add(9);
        lista1.add(25);
        lista1.add(11);
        lista1.add(80);

        System.out.println(" Estado 1 ");
        imprimirLista(lista1);
        System.out.println(" *** ");

        lista1.add(2, 300);
        lista1.add(4, 500);
        lista1.add(5, 700);

        System.out.println(" Estado 2 ");
        imprimirLista(lista1);
        System.out.println(" *** ");

        lista1.set(1, 14);
        lista1.set(2, 16);
        lista1.set(7, 18);

        System.out.println(" Estado 3 ");
        imprimirLista(lista1);
        System.out.println(" *** ");

        List<Integer> lista2, lista3;
        lista2 = lista1.subList(2, 4);
        lista3 = lista1.subList(2, 4);
        imprimirLista(lista2);
        System.out.println(" *** ");
        imprimirLista(lista3);
        System.out.println(lista1.equals(lista2));

        System.out.println("\nProbando los métodos de busqueda lineal:");
        for (int i = 0; i < 17; i++) { //Agregando 17 veces un 92 a la lista
            lista2.add(92);
        }
        lista2.add(13,100); //Agregando un 100 en el índice 13
        System.out.println(BusquedaLineal.contains(lista2, 100)); //true
        System.out.println(BusquedaLineal.indexOf(lista2, 100)); // 13
        System.out.println(BusquedaLineal.contains(lista2, 101)); //false
        System.out.println(BusquedaLineal.indexOf(lista2, 101)); //-1
        System.out.println(BusquedaLineal.times(lista2, 92)); //17

        System.out.println("\nOrdenando la lista2: ");
        Collections.sort(lista2);
        imprimirLista(lista2);

        System.out.println("\nProbando los métodos de busqueda binaria:");
        System.out.println(BusquedaBinaria.contains(lista2, 100)); //true
        System.out.println(BusquedaBinaria.contains(lista2, 101)); //false
        System.out.println(BusquedaBinaria.times(lista2, 92)); //17
    }

    public static void imprimirLista(List<Integer> listaPrint) {
        for (Integer var : listaPrint) {
            System.out.println(var);
        }
    }
}
