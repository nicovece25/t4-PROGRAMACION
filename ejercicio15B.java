import java.util.Random;

public class ejercicio15B {

    public static void main(String[] args) {
        Random rd = new Random();
        int array[] = new int[30];

        array = rellenoArray(array, rd);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d|", array[i]);

        }
        System.out.println();

        for (int j = 0; j < array.length - 2; j++) {

            for (int i = 0; i < array.length - 2; i++) {
                if (i % 2 != 0) {
                    if (array[i] > array[i + 2]) {
                        int aux = array[i];
                        array[i] = array[i + 2];
                        array[i + 2] = aux;
                    }
                } else {
                    if (array[i] < array[i + 2]) {
                        int aux = array[i];
                        array[i] = array[i + 2];
                        array[i + 2] = aux;
                    }

                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d|", array[i]);

        }

    }

    public static int[] rellenoArray(int[] array, Random r) {
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(11) + 1;
        }
        return array;

    }

    public static int[] posicionImpar(int[] array, int[] impar) {

        return impar;
    }

}
