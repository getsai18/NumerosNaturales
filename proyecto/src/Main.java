import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
        int numeroN = sc.nextInt();
        System.out.println("La suma recursiva del numero "+numeroN+" Es igual a = "+m.recursividad(numeroN));
        
        
    }

    int recursividad(int num){
        if(num == 0){
            return 0;
        }else{
            return  num + recursividad(num - 1);
        }
    }
}
