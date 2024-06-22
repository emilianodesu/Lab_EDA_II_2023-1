package Ejercicios;

import java.util.List;

public class BusquedaBinaria {

    public static boolean contains(List<Integer> list, int x) {
        int left = 0, mid = 0;
        int right = list.size() - 1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (x == list.get(mid))
                return true;
            if (x < list.get(mid))
                right = mid - 1;
            if (x > list.get(mid)) 
                left = mid + 1;
        }
        return false;
    }

    public static int times(List<Integer> list, int x) {
        int count = 0, left = 0, mid = 0;
        int right = list.size() - 1;
        // System.out.println("Right: " + right);
        while (left <= right) {
            mid = (left + right) / 2;
            if (x == list.get(mid)) {
                count++;
                int i = mid - 1;
                while (list.get(i--) == x) {
                    count++;
                }
                i = mid + 1;
                while (list.get(i++) == x) {
                    count++;
                }
                return count;
            }
            if (x < list.get(mid))
                right = mid - 1;
            if (x > list.get(mid))
                left = mid + 1;
        }
        return count;
    }
}
