package Ejercicios;

import java.util.List;
import java.util.LinkedList;

public class BusquedaLineal {

    public static boolean contains(List<Integer> list, int x) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (x == list.get(i))
                return true;
        }
        return false;
    }

    public static int indexOf(List<Integer> list, int x) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (x == list.get(i))
                return i;
        }
        return -1;
    }

    public static int times(List <Integer> list, int x) {
        int count = 0, n = list.size();
        for (int i = 0; i < n; i++) {
            if (x == list.get(i)) {
                count++;
            }
        }
        return count;
    }

    public static LinkedList<Automovil> busquedaMarca(List<Automovil> autos, String marca) {
        LinkedList<Automovil> resultados = new LinkedList<Automovil>();
        int n = autos.size();
        for (int i = 0; i < n; i++) {
            if (marca.equals(autos.get(i).getMarca()))
                resultados.add(autos.get(i));
        }
        return resultados;
    }

    public static LinkedList<Automovil> busquedaModelo(List<Automovil> autos, int modelo) {
        LinkedList<Automovil> resultados = new LinkedList<Automovil>();
        int n = autos.size();
        for (int i = 0; i < n; i++) {
            if (modelo == autos.get(i).getModelo())
                resultados.add(autos.get(i));
        }
        return resultados;
    }

    public static LinkedList<Automovil> busquedaPrecio(List<Automovil> autos, float presupuesto) {
        LinkedList<Automovil> resultados = new LinkedList<Automovil>();
        int n = autos.size();
        for (int i = 0; i < n; i++) {
            if (presupuesto >= autos.get(i).getPrecio())
                resultados.add(autos.get(i));
        }
        return resultados;
    }
}
