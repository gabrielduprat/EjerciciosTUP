import java.util.Scanner;

public class ej11DescuentoPorCompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el monto de la compra");

        double monto = sc.nextDouble();

        double descuento = 0.20 * monto;

        if (monto > 1000){
            System.out.println("El monto a pagar es: $" + (monto - descuento));
        } else{
            System.out.println("El monto a pagar es: $" + monto);
        }
        sc.close();
    }

}
