import java.util.LinkedList;

public class HashModulo {
    private LinkedList<Integer> lista = new LinkedList<>();

    public HashModulo() {
        for (int i = 0; i < 15; i++) {
            lista.add(null);
        }
    }

    public void imprimirLista() {
        System.out.println("\nLa lista es:");
        System.out.println("Clave      Valor");
        for (int i = 0; i < 15; i++) {
            System.out.println(i + "           " + lista.get(i));
        }
    }

    public int modulo(int elemento) {
        return elemento < 0 ? (elemento * -1) % 15 : elemento % 15;
    }

    public int plegamiento(int elemento) {
        String elementS = String.valueOf(elemento);
        String sub[] = new String[3];
        String temp = "";
        for (int i = 0; i < 4; i++)
            temp += elementS.charAt(i);
        sub[0] = temp;
        temp = "";
        for (int i = 4; i < 8; i++)
            temp += elementS.charAt(i);
        sub[1] = temp;
        temp = "";
        temp += elementS.charAt(8);
        sub[2] = temp;
        int sum = 0;
        for (String string : sub) {
            int num = Integer.parseInt(string);
            sum += num;
        }
        String sumS = String.valueOf(sum);

        return Character.getNumericValue(sumS.charAt(sumS.length() - 1));
    }

    public void agregarElemento(int elemento) {
        int indice = plegamiento(elemento);
        indice = modulo(indice);

        int flag = 0;
        while (lista.get(indice) != null) {
            indice++;
            flag++;
            if (indice == 15)
                indice = 0;
            if (flag == 15)
                break;
        }
        if (flag == 15) {
            System.out.println("ERROR: No se pudo agregar el elemento. Contenedor lleno.");
        } else {
            lista.set(indice, elemento);
            System.out.println(elemento + " agregado exitosamente en " + indice);
        }
    }

    public int buscarElemento(int elemento) {
        return lista.contains(elemento) ? lista.indexOf(elemento) : -1;
    }

}
