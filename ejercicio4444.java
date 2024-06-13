import java.util.Random;

public class ejercicio4444 {

    public static void main(String[] args) {
        Random rd = new Random();
        int sum = 0;

        int vector[] = new int[5];

        vector = rellenoArreglo(vector, rd);
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%d |", vector[i]);

        }

        sum = suma(sum, vector);

        System.out.printf(" resultado => %d", sum);

    }

    public static int[] rellenoArreglo(int[] rellenar, Random r) {

        for (int i = 0; i < rellenar.length; i++) {
            rellenar[i] = r.nextInt(9) + 1;

        }

        return rellenar;
    }

    public static int suma(int sum, int array[]) {
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }

        return sum;

    }

}
