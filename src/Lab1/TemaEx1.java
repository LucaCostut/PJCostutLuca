package Lab1;
import java.util.Scanner;
public class TemaEx1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti lungimea dreptunghiului:");
        int lungime =scanner.nextInt();
        System.out.println("Introduceti latimea dreptunghiului:");
        int latime =scanner.nextInt();
        System.out.println("Perimetrul dreptunghiului este " + (2 * lungime + 2 *latime) + ", iar aria este " + (lungime * latime) + ".");

    }

}
