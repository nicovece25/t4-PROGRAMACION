import java.util.Random;

public class ejercicio15A {

    public static void main(String[] args) {
        int minimo, maximo, indice = 0;
        Random rd = new Random();
        int array[] = new int[10];

        array = rellenoArray(array, rd);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d|", array[i]);

        }

        double promedio = promediOArray(array);

        System.out.println("promedio : " + promedio);

        minimo = numeroMenor(array);
        indice = devolderindice(array, minimo);
        System.out.println("el numero menor es: " + minimo + "  en el indice  " + indice);

        maximo = numeroMayor(array);
        indice = devolderindice(array, maximo);
        System.out.println("el numero mayor es: " + maximo + " en el indice  " + indice);

        int menorpromedio = devolvercantidad(array, indice);
        System.out.println("la cantidad de n° menores al promedio es : " + menorpromedio);

        array = ordenAscendente(array);
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

    public static double promediOArray(int[] array) {
        int acum = 0;
        for (int i = 0; i < array.length; i++) {
            acum = acum + array[i];
        }

        double promedio = acum / array.length;
        return promedio;
    }

    public static int numeroMayor(int[] array) {
        int maximo = array[0];

        for (int i = 0; i < array.length; i++) {
            if (maximo < array[i]) {
                maximo = array[i];
            }
        }
        return maximo;
    }

    public static int numeroMenor(int[] array) {
        int minimo = array[0];

        for (int i = 0; i < array.length; i++) {
            if (minimo > array[i]) {
                minimo = array[i];
            }
        }
        return minimo;

    }

    public static int devolderindice(int[] array, int buscador) {
        int indice = 0;

        for (int i = 0; i < array.length; i++) {
            if (buscador == array[i]) {
                indice = i;
            }
        }

        return indice;

    }

    public static int devolvercantidad(int[] array, int promedio) {
        int cantidad = 0;

        for (int i = 0; i < array.length; i++) {
            if (promedio > array[i]) {
                cantidad++;
            }
        }

        return cantidad;

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

}
