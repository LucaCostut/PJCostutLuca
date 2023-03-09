package Lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Cantec {
    public static void main(String[] args) {
        ArrayList<Vers> versuri = new ArrayList<Vers>();
        try {
            Scanner scanner = new Scanner(new File("cantec_in.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Vers vers = new Vers(line);
                vers.adaugaInfo();
                versuri.add(vers);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul cantec_in.txt nu a fost gasit.");
            return;
        }
        try {
            PrintWriter writer = new PrintWriter("cantec_out.txt", "UTF-8");
            for (Vers vers : versuri) {
                writer.println(vers);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("A aparut o eroare la scrierea fisierului cantec_out.txt.");
            return;
        }
    }
    
}