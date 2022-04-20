package Ficheros;

import java.io.*;

public class CountingVocals {

    private static String FILE_NAME = "input.txt";
    private static String VOCALS = "aeiou";

    public static void run() {
        try {
            CharCounter counters = new CharCounter(VOCALS, false);
            FileReader input = new FileReader(FILE_NAME);
            int c = input.read();
            while (c != (-1)){
                counters.countIfTargeted((char) c);
                c = input.read();
            }
            input.close();
            System.out.println(counters);
        } catch (IOException ex) {
            System.out.println("Something bad has happended :-‐‐(");
        }
    }
}