import java.util.Random;

public class ejercicio12 {

    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(5) + 1;
        int m = rd.nextInt(5) + 1;
        int m1 = 0, n1 = 0;
        int array[] = new int[n];
        int array2[] = new int[m];
        int array3[] = new int[n + m];

        array = rellenoArray(array, rd);
        array = ordenAscendente(array);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d |", array[i]);
        }
        System.out.println();

        array2 = rellenoArray(array2, rd);
        array2 = ordenDescendente(array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("%d |", array2[i]);
        }
        System.out.println();

        array2 = ordenAscendente(array2);

        for (int i = 0; i < array2.length; i++) {
            System.out.printf("%d |", array2[i]);
        }
        System.out.println();

        for (int i = 0; i < array3.length; i++) {

            if (n1 == n) {
                array3[i] = array2[m1];
                m1++;
            } else if (m1 == m) {
                array3[i] = array[n1];
                n1++;
            } else if (array[n1] < array2[m1]) {
                array3[i] = array[n1];
                n1++;
            } else {
                array3[i] = array2[m1];
                m1++;
            }

            System.out.printf("%d|", array3[i]);

        }
        System.out.println();

    }

    public static int[] rellenoArray(int[] array, Random r) {
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(9) + 1;
        }
        return array;
    }

    public static int[] sumaArray(int[] array) {

        return array;
    }

    public static int[] ordenAscendente(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;

                }
            }
        }
        return array;

    }

    public static int[] ordenDescendente(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;

                }
            }
        }

        return array;
    }

}
