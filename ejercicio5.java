import java.util.Random;

public class ejercicio5 {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(5) + 1;
        int p = 0;

        int vectorA[] = new int[n];
        int vectorB[] = new int[n];

        vectorB = rellenoArreglo(vectorB, rd);
        vectorA = rellenoArreglo(vectorA, rd);

        // muestra imprime
        for (int i = 0; i < vectorB.length; i++) {
            System.out.printf("%d |", vectorB[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < vectorB.length; i++) {
            System.out.printf("%d |", vectorA[i]);
        }
        System.out.println("");
        p = prodEscalar(p, vectorA, vectorB);

        System.out.println("resultado  " + p);

    }

    public static int[] rellenoArreglo(int[] relleno, Random r) {

        for (int i = 0; i < relleno.length; i++) {
            relleno[i] = r.nextInt(9) + 1;
        }
        return relleno;
    }

    public static int prodEscalar(int p, int vectorA[], int vectorB[]) {
        for (int i = 0; i < vectorA.length; i++) {

            p = (vectorA[i] * vectorB[i]) + p;

        }

        return p;
    }

}
