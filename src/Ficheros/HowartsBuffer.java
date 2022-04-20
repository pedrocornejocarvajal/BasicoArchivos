package Ficheros;


import java.io.*;

public class HowartsBuffer {

    private static final String mailOrigen = "mail.txt";
    private static final String mailHowler = "howler.txt";

    public static void howlizarCarta (){
        BufferedReader entrada = null;
        BufferedWriter salida = null;
        String texto;
        try {
            entrada = new BufferedReader(new FileReader(mailOrigen));
            salida = new BufferedWriter(new FileWriter(mailHowler, true));
            texto = entrada.readLine();
            while (texto != null){
                salida.write(texto.toUpperCase());
                salida.newLine();
                texto=entrada.readLine();
            }
        }catch (IOException e){
            System.out.println("Fallo de lectura/escritura.");
        }finally {
            try {
                assert entrada != null;
                entrada.close();
                assert salida != null;
                salida.close();
            } catch (IOException e) {
                System.out.println("Problemas cerrando el buffer.");
            }
        }
    }
}
