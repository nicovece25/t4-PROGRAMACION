import java.util.Random;

public class ejerci4 {

    public static void main(String[] args) {
        int c = 0;

        Random rd = new Random();

        float vector[] = new float[10];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rd.nextFloat(99);
        }

        for (int i = 0; i < vector.length; i++) {

            System.out.println("posicion  " + i);
            System.out.println("n°guardado:  " + String.format("%.2f", vector[i]));
            System.out.println("------------");
        }

        c = repetirNumero(vector);

        if (c > 1) {
            System.out.println("serepite el n°:  " + c);
        } else
            System.out.println("no hay n° repetidos");

        float mayor = numeroMayor(vector);
        System.out.printf("El numero mayor: %f ", mayor);

    }

    public static int repetirNumero(float[] vector) {
        int c = 0;
        float vec = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vec == vector[i]) {
                c++;
            }
        }

        return c;
    }

    public static float numeroMayor(float[] vector) {

        float numeroMayor = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (numeroMayor < vector[i]) {
                numeroMayor = vector[i];
            }
        }
        return numeroMayor;

    }

}