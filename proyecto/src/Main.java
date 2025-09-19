public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.recursividad(10));
        
    }

int suma = 0;
    int recursividad(int num){
        
        if(num < 0){
            return suma;
        }else{
            suma += num;
            return recursividad(num-1);
        }
    }
    
}
