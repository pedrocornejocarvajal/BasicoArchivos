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
            System.out.println("Introduzca una cadena de caracteres");
            texto=scanner.nextLine();
            FileWriter output = new FileWriter(ARCHIVO);
            output.write(texto);
            output.close();
        } catch (IOException ex) {
            System.out.println("Fallo");
        }
    }

}