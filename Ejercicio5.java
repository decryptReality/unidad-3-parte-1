import java.util.Random;
import java.util.Scanner;

class Ejercicio5
{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = scanner1.nextInt();
        int siguiente = numero + 1;
        System.out.println("siguiente: " + siguiente);
    }
}
