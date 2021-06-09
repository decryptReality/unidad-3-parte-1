import java.util.Random;
import java.util.Scanner;

class Ejercicio8
{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int numero1 = scanner1.nextInt();
        int numero2 = scanner1.nextInt();
        int numero3 = scanner1.nextInt();
        int suma = numero1 + numero2 + numero3;
        double promedio = suma / 3.0;
        System.out.println("promedio: " + promedio);
    }
}
