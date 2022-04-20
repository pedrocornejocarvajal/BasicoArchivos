package Ficheros;

import java.io.*;

public class ContarVocales {

    private static final String NOMBRE_FICHERO = "input.txt";
    private static final String VOCALES = "aeiou";

    public static void run() {
        try {
            ContarLetras counters = new ContarLetras(VOCALES, false);
            FileReader input = new FileReader(NOMBRE_FICHERO);
            int c = input.read();
            while (c != (-1)){
                counters.countIfTargeted((char) c);
                c = input.read();
            }
            input.close();
            System.out.println(counters);
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
}