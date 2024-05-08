import java.util.Scanner;

public class ej13NumerosEnteros {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = numeros.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int num2 = numeros.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        int num3 = numeros.nextInt();

        int mayor = 0;
        for (int i = 0; i < 3; i++){
            if (num1 > mayor){
                mayor = num1;
            
            } else if(num2 > mayor){
                mayor = num2;
            }else if(num3 > mayor){
                mayor = num3;
            }
        }
        System.out.println("Los números ingresados son: " + num1 + ", " + num2   + " y " + num3 + ".");
        System.out.println("El mayor es: " + mayor);
        numeros.close();

    }

}
