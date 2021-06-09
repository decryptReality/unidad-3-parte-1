import java.util.Random;
import java.util.Scanner;

class Ejercicio14
{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int numero1 = scanner1.nextInt();
        int numero2 = scanner1.nextInt();
        int residuo = numero2 % numero1;
        if (residuo == 0)
        {
            System.out.println("es divisible");
        }
    }
}
