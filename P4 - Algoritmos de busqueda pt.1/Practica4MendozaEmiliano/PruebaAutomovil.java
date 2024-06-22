import java.util.LinkedList;

import Ejercicios.BusquedaLineal;
import Ejercicios.Automovil;

public class PruebaAutomovil {
    public static void main(String[] args) {
        LinkedList<Automovil> mis_autos = new LinkedList<Automovil>();
        Automovil corollaHB = new Automovil("Toyota", 2021, 475000f);
        mis_autos.add(corollaHB);
        Automovil civic = new Automovil("Honda", 2019, 520000f);
        mis_autos.add(civic);
        Automovil accord = new Automovil("Honda", 2020, 650000f);
        mis_autos.add(accord);
        Automovil swiftSport = new Automovil("Suzuki", 359000f);
        mis_autos.add(swiftSport);
        Automovil R8 = new Automovil("Audi", 1989000f);
        mis_autos.add(R8);
        mis_autos.add(new Automovil("KIA", 2020, 290000f));
        mis_autos.add(new Automovil("Volkswagen", 2017, 330000f));

        System.out.println("\nAutos en existencia:");
        int n = mis_autos.size();
        for (int i = 0; i < n; i++) {
            System.out.println(mis_autos.get(i).toString());
        }
        System.out.println("\nSe realizaron los siguientes ajustes por inflación y descuentos:");
        for (int i = 0; i < n; i++) {
            mis_autos.get(i).ajusteInflacion(5.9f);
        }
        swiftSport.aplicarDescuento(15f);
        mis_autos.get(3).aplicarDescuento(8f);
        for (int i = 0; i < n; i++) {
            System.out.println(mis_autos.get(i).toString());
        }

        System.out.println("\nBuscando autos de la marca Honda...");
        LinkedList<Automovil> honda = BusquedaLineal.busquedaMarca(mis_autos, "Honda");
        System.out.println("Se encontraron los siguientes resultados: ");
        for (int i = 0; i < honda.size(); i++) {
            System.out.println(honda.get(i).toString());
        }

        System.out.println("\nBuscando autos modelo 2020...");
        LinkedList<Automovil> dosmilveinte = BusquedaLineal.busquedaModelo(mis_autos, 2020);
        System.out.println("Se encontraron los siguientes resultados: ");
        for (int i = 0; i < dosmilveinte.size(); i++) {
            System.out.println(dosmilveinte.get(i).toString());
        }

        System.out.println("\nBuscando autos dentro de un presupuesto de $400,000.00...");
        LinkedList<Automovil> presupuesto = BusquedaLineal.busquedaPrecio(mis_autos, 400000f);
        System.out.println("Se encontraron los siguientes resultados: ");
        for (int i = 0; i < presupuesto.size(); i++) {
            System.out.println(presupuesto.get(i).toString());
        }
    }
}
