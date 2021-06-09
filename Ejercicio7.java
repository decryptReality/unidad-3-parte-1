import java.util.Random;
import java.util.Scanner;

class Ejercicio7
{
    public static void main(String[] args) {
        Random random1 = new Random();
        int numero1 = random1.nextInt(41) + 10;
        double numero2 = 0.85 * numero1;
        System.out.println("aleatorio: " + numero1 + "\n" + "disminuido 15%: " + numero2);
    }
}
