import java.util.Scanner;

public class ej04HorasTrabajadas {
    public static void main(String[] args) {
        Scanner horas = new Scanner(System.in);
        Scanner sueldo = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas trabajadas");
        int cantHoras = horas.nextInt();

        System.out.println("Ingrese el sueldo por horas");
        double sueldoPorHora = sueldo.nextDouble();

        double sueldoOchoHoras = 8 * sueldoPorHora;
        double sueldoExtra =  2 * sueldoPorHora;

        if (cantHoras > 8){
            double sueldoHorasExtras = (cantHoras - 8 ) * sueldoExtra;

            System.out.println("El sueldo total es: $" + (sueldoHorasExtras + sueldoOchoHoras));
        } else {
            System.out.println("El sueldo total es: $" + sueldoOchoHoras);
        }

        horas.close();
        sueldo.close();
;    }

}
