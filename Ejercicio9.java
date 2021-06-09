import java.util.Random;
import java.util.Scanner;

class Ejercicio9
{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String palabraA1 = scanner1.next();
        String palabraB1 = scanner1.next();
        String palabraA2 = palabraA1;
        palabraA1 = palabraB1;
        palabraB1 = palabraA2;
        System.out.println("palabraA: " + palabraA1 + "\n" + "palabraB: " + palabraB1);
    }
}
