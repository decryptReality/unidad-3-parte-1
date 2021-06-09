import java.util.Scanner;
import java.util.Random;

class Ejercicio16
{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int num1 = scanner1.nextInt();
        int num2 = scanner1.nextInt();
        int num3 = scanner1.nextInt();
        int mayor = 0;
        if (num1 > num2 & num1 > num3)
        {
            mayor = num1;
        }
        else
        {
            if (num2 > num3)
            {
                mayor = num2;
            }
            else
            {
                mayor = num3;
            }
        }
        System.out.println("mayor: " + mayor);
    }
}

