import java.util.Random;
import java.util.Scanner;

class Ejercicio15
{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int numero = scanner1.nextInt();
        if (numero == 0)
        {
            System.out.println("nulo");
        }
        else
        {
            if (numero > 0)
            {
                System.out.println("positivo");
            }
            else
            {
                System.out.println("negativo");
            }
        }
    }
}
