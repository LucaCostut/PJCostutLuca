package Lab1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex1 {
    public static void main(String[] args) throws IOException
{
    String[] judete = readJudeteFromFile("judete_in.txt");
    Arrays.sort(judete);
    BufferedReader flux_in;
    String nume_fis= "judete_in.txt";
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Introduceti judetul: ");
        String judetCautat = scanner.nextLine();

        int pozitie = Arrays.binarySearch(judete, judetCautat);
        if (pozitie >= 0) {
            System.out.println("Judetul se afla pe pozitia " + pozitie);
        } else {
            System.out.println("Judetul nu a fost gasit");
        }
    }
    
}

    public static String[] readJudeteFromFile(String fileName) {
        String[] judete = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        String line;
        int numJudete = 0;
        while ((line = reader.readLine()) != null) {
            numJudete++;
        }

        judete = new String[numJudete];

        reader.close();
        BufferedReader read = new BufferedReader(new FileReader(fileName));

        int i = 0;
        while ((line = read.readLine()) != null) {
            judete[i++] = line;
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
        return judete;
}
}
