import java.util.Scanner;

public class ej05CalculosConDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double num1 = sc.nextDouble();

        System.out.println("Ingrese el segundo numero");
        double num2 = sc.nextDouble();

        double suma = (num1 * 2) + (num2 * num2);
        System.out.println("La suma del doble del primer número más el cuadrado del segundo número es: " + suma);

        double promedio = Math.pow(num1, 3) + Math.pow(num2,3) / 2;
        System.out.println("El promedio de los cubos de los dos números es: " + promedio);

        sc.close();
    }

}
