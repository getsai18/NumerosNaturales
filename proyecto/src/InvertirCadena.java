import java.util.Scanner;

public class InvertirCadena {

    public static void invertir(String cadena) {
        if (cadena.isEmpty()) {
            return;
        }
        invertir(cadena.substring(1));
        System.out.print(cadena.charAt(0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String texto = sc.nextLine();
        invertir(texto);
        System.out.println();
        sc.close();
    }
}
