package Lab1;
import java.io.*;
import java.util.*;
public class Lab2Ex2 {
    
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
