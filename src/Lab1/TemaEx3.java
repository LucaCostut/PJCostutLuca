package Lab1;
import java.util.Scanner;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class TemaEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul n:");
        int n = scanner.nextInt();
        Boolean x = FALSE;
        System.out.println("---> " + 1 + " este divizor a lui " + n);
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                System.out.println("---> " + i + " este divizor a lui " + n);
                x = TRUE;
        }
        System.out.println("---> " + n + " este divizor a lui " + n);
        if (x == TRUE)
            System.out.println("Numarul nu este prim.");
        else
            System.out.println("Numarul este prim.");
    }
}
