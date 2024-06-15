public class ejercicio11 {

    public static void main(String[] args) {
        char[] aux;
        char[] aux2;

        String[] nombre = { "pedro", "juan", "estaban", "leo", "nicolas", "mauro", "flo", "matias" };

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

        for (int i = 0; i < nombre.length; i++) {
            System.out.printf("%s", nombre[i] + " , ");
        }

    }
}