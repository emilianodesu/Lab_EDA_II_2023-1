import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        java.util.Scanner stdin = new java.util.Scanner(System.in);
        System.out.println("***** Menú Práctica 5 *****");
        System.out.println("Selecciona una opción");
        System.out.println("1) Manejo de Tablas Hash en Java");
        System.out.println("2) Función Hash por módulo");
        System.out.println("3) Encadenamiento");
        System.out.print("Opción: ");
        int opc = stdin.nextInt();

        switch (opc) {
            case 1:
                System.out.println("\nCreando una tabla Hash de tipo HashMap...");
                HashMap<Integer, String> myHashMap = new HashMap<>();
                System.out.println("Agregando elementos a myHashMap...");
                myHashMap.put(912419031, "Armando Archundia");
                myHashMap.put(872340194, "Erling Haaland");
                myHashMap.put(948103314, "Teresa Fidalgo");
                myHashMap.put(481048952, "Selene Delgado");
                System.out.println("Se agregaron los siguientes elementos a myHashMap:");
                System.out.println("myHashMap: " + myHashMap);

                System.out.println("\nCreando myHashMap2 con los elementos de myHashMap...");
                HashMap<Integer, String> myHashMap2 = new HashMap<>(myHashMap);
                System.out.println("myHashMap2: " + myHashMap2);

                System.out.println("\nProbando algunos de los métodos de HashMap...");
                System.out.println("\nmyHashMap.equals(myHashMap2) : " + myHashMap.equals(myHashMap2));
                System.out.println("myHashMap: " + myHashMap);
                System.out.println("myHashMap2: " + myHashMap2);

                System.out.println("\nAgregando otro elemento a myHashMap...");
                System.out.println("myHashMap.put(824095247, \"Hugo Boss\")");
                myHashMap.put(824095247, "Hugo Boss");
                System.out.println("myHashMap.equals(myHashMap2) : " + myHashMap.equals(myHashMap2));

                System.out.println(
                        "\nmyHashMap.containsKey(\"317579439\") : " + myHashMap.containsKey(317579439));
                System.out.println(
                        "myHashMap.containsValue(\"Erling Haaland\") : " + myHashMap.containsValue("Erling Haaland"));

                System.out.println("\nmyHashMap.get(948103314) : " + myHashMap.get(948103314));
                System.out.println("myHashMap.get(317579439) : " + myHashMap.get(317579439));

                System.out.println(
                        "\nmyHashMap.remove(912419031) : " + myHashMap.remove(912419031));
                System.out.println("myHashMap.remove(872340194, \"Erling Haaland\") : "
                        + myHashMap.remove(872340194, "Erling Haaland"));
                System.out.println("myHashMap.remove(817409810, \"Hernan Cortes\") : "
                        + myHashMap.remove(817409810, "Hernan Cortes"));

                System.out.println("\nmyHashMap.size() : " + myHashMap.size());
                System.out.println("myHashMap2.size() : " + myHashMap2.size());

                System.out.println("\nmyHashMap.replace(948103314, \"El mencho\") : "
                        + myHashMap.replace(948103314, "El mencho"));
                System.out.println("myHashMap.replace(\"Hugo Boss\", 824095247, 123456789) : "
                        + myHashMap.replace(824095247, "Hugo Boss", "Aristoteles"));
                System.out.println("myHashMap: " + myHashMap);

                System.out.println("\nmyHashMap.isEmpty() : " + myHashMap.isEmpty());
                break;

            case 2:
                char opcion2;
                HashModulo hm = new HashModulo();
                do {
                    System.out.println("\nSelecciona una opción");
                    System.out.println("a) Agregar elemento");
                    System.out.println("b) Imprimir lista");
                    System.out.println("c) Buscar elemento");
                    System.out.println("d) Salir");
                    System.out.print("Opción: ");
                    opcion2 = stdin.next().charAt(0);
                    int num;
                    switch (opcion2) {
                        case 'a':
                            System.out.print("\nIngrese elemento: ");
                            num = stdin.nextInt();
                            hm.agregarElemento(num);
                            break;

                        case 'b':
                            hm.imprimirLista();
                            break;

                        case 'c':
                            System.out.print("\nIngrese elemento: ");
                            num = stdin.nextInt();
                            if (hm.buscarElemento(num) == -1)
                                System.out.println(num + " no se encuentra en la lista");
                            else
                                System.out.println(num + " esta en el indice " + hm.buscarElemento(num));

                            break;

                        case 'd':
                            continue;

                        default:
                            System.out.println("Opción inválida");
                            continue;
                    }
                } while (opcion2 != 'd');
                break;
            case 3:
                char opcion3;
                Encadenamiento e = new Encadenamiento();
                do {
                    System.out.println("\nSelecciona una opción");
                    System.out.println("a) Agregar elemento");
                    System.out.println("b) Salir");
                    System.out.print("Opción: ");
                    opcion3 = stdin.next().charAt(0);
                    int num;
                    switch (opcion3) {
                        case 'a':
                            System.out.print("\nIngrese elemento: ");
                            num = stdin.nextInt();
                            e.agregarElemento(num);
                            break;

                        case 'b':
                            continue;

                        default:
                            System.out.println("Opción inválida");
                            continue;
                    }
                } while (opcion3 != 'b');
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
        stdin.close();
    }
}
