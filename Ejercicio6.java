import java.util.Random;
import java.util.Scanner;

class Ejercicio6
{
    public static void main(String[] args) {
        Random random1 = new Random();
        int numero = random1.nextInt(201);
        System.out.println("aleatorio: " + numero);
        double numero2 = 1.3 * numero;
        System.out.println("aumentado 30%: " + numero2);
    }
}
