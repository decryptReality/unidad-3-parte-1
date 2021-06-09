import java.util.Random;
import java.util.Scanner;

class Ejercicio4
{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int numero = scanner1.nextInt();
        int cuadrado = numero * numero;
        int cubo = cuadrado * numero;
        System.out.println("cuadrado: " + cuadrado + "\n" + "cubo: " + cubo);
    }
}
