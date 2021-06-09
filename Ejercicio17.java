import java.util.Random;
import java.util.Scanner;

class Ejercicio17
{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int lado1 = scanner1.nextInt();
        int lado2 = scanner1.nextInt();
        int lado3 = scanner1.nextInt();
        if (lado1 == lado2)
        {
            if (lado2 == lado3)
            {
                System.out.println("equilatero");
            }
            else
            {
                System.out.println("isoceles");
            }
        }
        else
        {
            if (lado2 == lado3)
            {
                System.out.println("isoceles");
            }
            else
            {
                System.out.println("escaleno");
            }
        }
    }
}
