import java.util.Scanner;

public class ej03presupuesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el presupuesto");

        double presupuesto = sc.nextDouble();

        System.out.println("El presupuesto para Urgencias es: $" + presupuesto * 0.37);
        System.out.println("El presupuesto para Pediatría es: $" + presupuesto * 0.42);
        System.out.println("El presupuesto para Traumatología es: $" + presupuesto * 0.21);

        sc.close();
    }

}
