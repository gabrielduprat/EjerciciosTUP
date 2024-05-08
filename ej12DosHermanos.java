import java.util.Scanner;

public class ej12DosHermanos {
    public static void main(String[] args) {
        Scanner hermanos = new Scanner(System.in);
        System.out.println("Ingrese la edad de un hermano: ");

        int hermano1 = hermanos.nextInt();

        System.out.println("Ingrese la de edad del segundo hermano: ");
        int hermano2 = hermanos.nextInt();

        if (hermano1 > hermano2) {
            System.out.println("El hermano mayor tiene " + hermano1 + " años, y la diferncia con el menor es de " + (hermano1 - hermano2));
        } else{
            System.out.println("El hermano mayor tiene " + hermano2 + " años, y la diferncia con el menor es de " + (hermano2 - hermano1));
        }

        hermanos.close();
    }

}
