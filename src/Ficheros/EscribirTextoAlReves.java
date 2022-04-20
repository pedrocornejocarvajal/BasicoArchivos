package Ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirTextoAlReves {
    private static final String ARCHIVO = "textoatras.txt";
    private static final Scanner scanner = new Scanner(System.in);


    public static void run() {

        String texto;
        try {
            System.out.println("escriba una cadena de caracteres");
            texto=scanner.nextLine();
            FileWriter output = new FileWriter(ARCHIVO);
            output.write(texto);
            /*for (int i = texto.length() - 1; i >= 0; i--) {
                output.write(texto.charAt(i));
            }   Esta forma es para escibirlo caracter a caracter, aunque se puede usar el texto entero.*/
            output.close();
        } catch (IOException ex) {
            System.out.println("No rula bien.");
        }
    }

}