import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        String aux;

        String[] pais = { "Canada", "Inglaterra", "Francia", "Alemania", "India", "Isrrael", "Italia ", "Japon",
                "mexico", "china", "rusia", "EEUU" };
        String[] capital = { "Ottawa", "Londres", "Paris", "Bonn", "Nueva delhi", "Jerusalen", "Roma", "Tokio",
                "Ciudad de mexico", "Pekin", "Moscu", "washington" };

        System.out.println("seleccione un pais");

        String buscador = sd.nextLine();
        for (int i = 0; i < pais.length; i++) {
            aux = pais[i].toLowerCase();
            buscador = buscador.toLowerCase();
            if (aux.equals(buscador)) {

                System.out.println("la capital del pais seleccionado es : " + capital[i]);
                break;
            }
        }

    }
}
