import java.util.Scanner;

public class ej01PrecioBoleto  {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); // Se crea un objeto Scanner para leer la entrada del usuario
        System.out.print("Ingrese la distancia a recorrer en kilómetros: "); // Se solicita al usuario que ingrese la
                                                                             // distancia a recorrer
        int distancia = sc.nextInt(); // Se lee la distancia ingresada por el usuario
        double precio = distancia * 45.0; // Se calcula el precio del boleto multiplicando la distancia por el precio
                                          // por kilómetro
        System.out.println("El precio del boleto es: $" + precio); // Se muestra el precio del boleto al usuario
        sc.close(); 
    }
    
}
