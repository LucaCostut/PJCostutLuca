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
class Vers {
    private String vers;

    public Vers(String vers) {
        this.vers = vers;
    }

    public int numarCuvinte() {
        return vers.split("\\s+").length;
    }

    public int numarVocale() {
        String vocale = "aeiouAEIOU";
        int numarVocale = 0;
        for (int i = 0; i < vers.length(); i++) {
            if (vocale.indexOf(vers.charAt(i)) >= 0) {
                numarVocale++;
            }
        }
        return numarVocale;
    }

    public void adaugaInfo() {
        String cuvinte = String.valueOf(numarCuvinte());
        String vocale = String.valueOf(numarVocale());
        if (vers.endsWith("are") || vers.endsWith("ere") || vers.endsWith("ire")) {
            vers += "*";
        }
        vers += " (" + cuvinte + " cuvinte, " + vocale + " vocale)\n";
        if (Math.random() < 0.1) {
            vers = vers.toUpperCase();
        }
    }

    public String toString() {
        return vers;
    }
}