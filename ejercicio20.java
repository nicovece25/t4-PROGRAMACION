import java.util.Random;

public class ejercicio20 {
    public static void main(String[] args) {
        Random rd = new Random();
        int array[][] = new int[3][6];
        int tranverso[][] = new int[6][3];

        array = rellenoArray(array, rd);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d |", array[i][j]);
            }
            System.out.println();
        }

        System.out.println("");

        tranverso = arraytranverso(array, tranverso);
        for (int i = 0; i < tranverso.length; i++) {
            for (int j = 0; j < tranverso[i].length; j++) {
                System.out.printf("%d |", tranverso[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] rellenoArray(int[][] array, Random r) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = r.nextInt(8) + 1;
            }
        }
        return array;

    }

    public static int[][] arraytranverso(int[][] array, int[][] tranverso) {

        for (int j = 0; j < tranverso.length; j++) {
            for (int i = 0; i < tranverso[j].length; i++) {
                tranverso[j][i] = array[i][j];
            }
        }
        return tranverso;
    }
}