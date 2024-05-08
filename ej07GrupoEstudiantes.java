import java.util.Scanner;

public class ej07GrupoEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de hombres");

        int hombres = sc.nextInt();

        System.out.println("Ingrese la cantidad de mujeres");
        int mujeres = sc.nextInt();

        int totalAlumnos = hombres + mujeres;

        double porcentajeH = hombres * 100 / totalAlumnos;
        double porcentajeM = mujeres * 100 / totalAlumnos;

        System.out.println("El porcentaje de alumnos hombres es: " + porcentajeH + " %");
        System.out.println("El porcentaje de alumnos mujeres es: " + porcentajeM + " %");

        sc.close();
    }
}