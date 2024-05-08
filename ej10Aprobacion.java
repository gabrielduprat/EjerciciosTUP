import java.util.Scanner;

public class ej10Aprobacion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primera nota");

        int nota1 = sc.nextInt();

        System.out.println("Ingrese la segunda nota");

        int nota2 = sc.nextInt();

        System.out.println("Ingrese la tercera nota");

        int nota3 = sc.nextInt();

        double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio < 60) {
            System.out.println("El alumno desaprobo con el promedio: " + promedio);
        } else {
            System.out.println("El alumno aprobo con el promedio " + promedio);
        }

        sc.close();

    }

}
