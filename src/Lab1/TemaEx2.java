package Lab1;
import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class TemaEx2 {
    public static void main(String[] args) throws IOException {
        String nume_fis = "in.txt";
        BufferedReader flux_in;
        flux_in = new BufferedReader(new InputStreamReader(new FileInputStream(nume_fis))) {
        };
        String linie = flux_in.readLine();
        Scanner scanner = new Scanner(new File("in.txt"));
        int x = scanner.nextInt();
        System.out.println(x);

    }
}
