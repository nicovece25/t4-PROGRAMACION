import java.util.Random;
import java.util.Scanner;

public class ejercicio25 {

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sd = new Scanner(System.in);
        String opcion;
        int numAlumno, nota;

        int[][] ListaAlumos = new int[10][3];
        double promedio;

        System.out.println();

        ListaAlumos = rellenoArray(ListaAlumos, rd);
        for (int i = 0; i < ListaAlumos.length; i++) {
            System.out.printf("\nAlumno n°  %d  ", (i + 1));

            for (int j = 0; j < ListaAlumos[i].length; j++) {
                System.out.printf(" trimestre %d=  %d ", j + 1, ListaAlumos[i][j]);
            }

            promedio = promedio(ListaAlumos[i]);
            System.out.printf("promedio es %.2f", promedio);
        }
        System.out.println();

        System.out.println(" ¿Quiere modificar alguna nota?  (s/n)");

        opcion = sd.nextLine();
        opcion = opcion.toLowerCase();

        if (opcion.equals("si") || opcion.equals("s")) {
            System.out.println(" indique n° de legajo");
            numAlumno = sd.nextInt() - 1;
            System.out.println("ingrese trimestre");
            int trimestre = sd.nextInt() - 1;
            System.out.println(" ingrese la nota");
            ListaAlumos[numAlumno][trimestre] = sd.nextInt();

        }

        for (int i = 0; i < ListaAlumos.length; i++) {
            System.out.printf("\nAlumno n°  %d  ", (i + 1));

            for (int j = 0; j < ListaAlumos[i].length; j++) {
                System.out.printf(" trimestre %d=  %d ", j + 1, ListaAlumos[i][j]);
            }

            promedio = promedio(ListaAlumos[i]);
            System.out.printf("promedio es %.2f", promedio);
        }

    }

    public static int[][] rellenoArray(int[][] ListaAlumos, Random r) {
        for (int i = 0; i < ListaAlumos.length; i++) {
            for (int j = 0; j < ListaAlumos[i].length; j++) {

                ListaAlumos[i][j] = r.nextInt(9) + 1;

            }
        }
        return ListaAlumos;

    }

    public static double promedio(int[] notas) {
        double promedio = 0;

        promedio = (notas[0] + notas[1] + notas[2]) / 3.0;

        return promedio;
    }
}
