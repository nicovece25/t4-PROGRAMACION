import java.util.Random;

public class ejercicio13 {

    public static void main(String[] args) {
        char[] aux;
        char[] aux2;

        Random rd = new Random();
        String[] nombre = { "Torres,pedro", "Aguirre,juan", "Diaz,estaban", "Juarez,leo", "Vera,nicolas",
                "Ordoñez,mauro", "Varela,flo", "Sosa,matias" };
        int[] legajo = { 10000000, 10000001, 10000002, 10000003, 10000004, 10000005, 10000006, 10000007 };

        for (int i = 0; i < nombre.length - 1; i++) {
            aux = nombre[i].toCharArray();
            aux2 = nombre[i + 1].toCharArray();

            for (int j = 0; j < aux.length; j++) {
                if (aux[j] == aux2[j]) {
                    continue;
                }
                if (aux[j] > aux2[j]) {
                    String az = nombre[j];
                    nombre[j] = nombre[j + 1];
                    nombre[j + 1] = az;
                    break;

                }
            }

        }

        System.out.printf(" %-20s %s%n", "| Nombre ", "| Legajo   ");
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("---------------");
            System.out.printf(" %-20s %d%n", nombre[i], legajo[i]);
        }

    }
}
