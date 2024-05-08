import java.util.Scanner;

public class ej06TrasDigitos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un entero de un dígito");

        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo entero de un dígito");
        int num2 = sc.nextInt();

        System.out.println("Ingrese el tercer entero de un dígito");
        int num3 = sc.nextInt();

        System.out.print(num1);
        System.out.print(num2);
        System.out.print(num3);

        int x = num1 * 100 + num2 * 10 + num3;
        System.out.println("El valor de X es: " + x);

    }


}
