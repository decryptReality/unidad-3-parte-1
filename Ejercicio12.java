import java.util.Random;
import java.util.Scanner;

class Ejercicio12
{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int celsius = scanner1.nextInt();
        double fahrenheit = (9.0/5) * celsius + 32;
        System.out.println("fahrenheit: " + fahrenheit);
    }
}
