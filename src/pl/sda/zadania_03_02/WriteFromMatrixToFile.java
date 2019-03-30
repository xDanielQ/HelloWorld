package pl.sda.zadania_03_02;

import java.io.*;


public class WriteFromMatrixToFile {
    public static void main(String[] args) throws IOException {
        String[] tab = new String[]{"Ala ma kota", "Ala ma kota 2", "Ala ma kota 3", "Ala ma kota 4"};

        final String FILE_NAME = "ala-ma-kota.txt";

        File f = new File("ala-ma-kota.txt");
        PrintWriter zapis = new PrintWriter(new BufferedWriter(new FileWriter(f, true)));
        for (int i = 0; i < tab.length; i++) {
            zapis.println(tab[i]);
        }
        zapis.close();
        PrintWriter3.readFromFile(FILE_NAME);
    }


}
