import java.util.Random;
import java.util.Scanner;

class Ejercicio2
{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("ingrese un pais");
        String pais = scanner1.next();
        System.out.println("ingrese su capital");
        String capital = scanner1.next();
        System.out.println(capital + " es la capital de " + pais);
    }
}
