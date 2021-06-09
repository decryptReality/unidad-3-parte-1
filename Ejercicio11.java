import java.util.Random;
import java.util.Scanner;

class Ejercicio11
{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int centimetros = scanner1.nextInt();
        double metros = centimetros / 100.0;
        double yardas = 1.094 * metros;
        double pies = 3.281 * metros;
        double pulgadas = 39.97 * metros;
        System.out.println("yardas: " + yardas);
        System.out.println("metros: " + metros);
        System.out.println("pies: " + pies);
        System.out.println("pulgadas: " + pulgadas);
    }
}
