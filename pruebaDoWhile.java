import java.util.Scanner;

public class pruebaDoWhile {
    public static void main(String[] args) {
        
        
       int numero = 5;

        while(numero++ < 10){
            if (numero == 8){
                break;
            }
        };  
        System.out.println("Count: " + numero);      
    
    }

}
