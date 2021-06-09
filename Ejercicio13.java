import java.util.Random;
import java.util.Scanner;

class Ejercicio13
{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int radio = scanner1.nextInt();
        int altura = scanner1.nextInt();
        if (radio > 0 & altura > 0)
        {
            System.out.println("volumen: " + 3.1416 * radio * radio * altura);
        }
        else
        {
            System.out.println("imposible");
        }
    }
}
