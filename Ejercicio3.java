import java.util.Random;
import java.util.Scanner;

class Ejercicio3
{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int numero = scanner1.nextInt();
        int doble = 2 * numero;
        int triple = 3 * numero;
        System.out.println("doble: " + doble + "\n" + "triple: " + triple);
    }
}
