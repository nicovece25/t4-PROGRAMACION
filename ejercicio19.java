import java.util.Random;

public class ejercicio19 {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = 4, m = 4;
        int array[][] = new int[4][4];
        int arrayB[][] = new int[4][4];
        int arrayC[][] = new int[4][4];

        array = rellenoArray(array, rd);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d |", array[i][j]);
            }
            System.out.println();
        }

        System.out.println("");

        arrayB = rellenoArray(arrayB, rd);
        for (int i = 0; i < arrayB.length; i++) {
            for (int j = 0; j < arrayB[i].length; j++) {
                System.out.printf("%d |", arrayB[i][j]);
            }
            System.out.println();
        }

        System.out.println("");

        arrayC = suma(array, arrayB, arrayC);
        for (int i = 0; i < arrayC.length; i++) {
            for (int j = 0; j < arrayC[i].length; j++) {
                System.out.printf("%d |", arrayC[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] rellenoArray(int[][] relleno, Random r) {
        for (int i = 0; i < relleno.length; i++) {

            for (int j = 0; j < relleno[i].length; j++) {

                relleno[i][j] = r.nextInt(8) + 1;
            }
        }
        return relleno;
    }

    public static int[][] suma(int[][] array, int[][] arrayB, int[][] suma) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                suma[i][j] = array[i][j] + arrayB[i][j];
            }
        }

        return suma;
    }
}
