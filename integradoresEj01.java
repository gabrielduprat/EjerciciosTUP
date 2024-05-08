import java.util.Scanner;

public class integradoresEj01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno: ");
        float[] floatArray = {3.14f, 2.718f, 1.618f, 4.2f, 5.6f};
        String nombre = sc.next();

        while (!nombre.equals(" ")) {

            System.out.println("Ingrese la primer nota: ");
            int nota1 = sc.nextInt();
            System.out.println("Ingrese la segunda nota: ");
            int nota2 = sc.nextInt();
            System.out.println("Ingrese la tercera nota: ");
            int nota3 = sc.nextInt();

            if ((0 <= nota1 && nota1 <= 10) && (0 <= nota2 && nota2 <= 10) && (0 <= nota3 && nota3 <= 10) ){
                double practica = nota1 * 0.10;
                double problemas = nota2 * 0.50;
                double teoria = nota3 * 0.40;
                System.out.println("La nota final del alumno " + nombre + " es: " + (practica + problemas + teoria));
            } else {
                System.out.println("Las notas deben tener un valor entre 0 y 10, las ingresadas fueron: " + nota1 + ", " + nota2 + ", " + nota3);
            }

            System.out.println("Ingrese el nombre del alumno: ");
            nombre = sc.next();

        }
        

        sc.close();
    }

}
