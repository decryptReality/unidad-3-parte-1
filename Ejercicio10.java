import java.util.Random;
import java.util.Scanner;

class Ejercicio10
{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int base = scanner1.nextInt();
        int altura = scanner1.nextInt();
        int area = base * altura;
        int perimetro = 2 * base + 2 * altura;
        System.out.println("area: " + area + "\n" + "perimetro: " + perimetro);
    }
}
