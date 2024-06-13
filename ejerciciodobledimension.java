import java.util.Random;

public class ejerciciodobledimension {

    public static void main(String[] args) {

        int matris2[][] = new int[3][3];
        Random rd = new Random();

        int vector[][] = new int[3][3];

        for (int i = 0; i < vector.length; i++) {
            for (int k = 0; k < vector[0].length; k++) {
                vector[i][k] = rd.nextInt(9);
                System.out.printf("%d |", vector[i][k]);
            }
            System.out.print("\t");
            for (int j = 0; j < vector[0].length; j++) {
                matris2[i][j] = rd.nextInt(9);
                System.out.printf("%d |", matris2[i][j]);

            }
            System.out.println("");

        }

    }

}
