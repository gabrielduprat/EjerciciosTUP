import java.util.Scanner;

public class ej02PrecioBoleto {
    public static void main (String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de kilometros a recorre");

        int distancia = sc.nextInt();
        //double precio = 10.5 * distancia;

        System.out.print("El precio del boleto es: $" + distancia * 10.5);
        sc.close(); 
    }
}