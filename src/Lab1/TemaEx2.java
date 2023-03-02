package Lab1;
import java.io.*;
import java.util.Scanner;

public class TemaEx2 {
    public static void main(String[] args) throws IOException {
        String nume_fis = "in.txt";
        BufferedReader flux_in;
        try {
            flux_in = new BufferedReader(new InputStreamReader(new FileInputStream(nume_fis)));
            String linie = null;
            while ((linie = flux_in.readLine()) != null) {
                System.out.println(linie);
            }
            flux_in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul " + nume_fis + " nu a fost gasit.");
        }
    }
}

