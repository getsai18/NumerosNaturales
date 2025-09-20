import java.util.Scanner;

public class PotenciaRecursiva {


    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la base: ");
        int base = sc.nextInt();
        System.out.print("Ingresa el exponente: ");
        int exponente = sc.nextInt();
        int resultado = potencia(base, exponente);
        System.out.println(base + "^" + exponente + " = " + resultado);
        sc.close();
    }



    
    public static int potencia(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * potencia(a, b - 1);
    }

}
