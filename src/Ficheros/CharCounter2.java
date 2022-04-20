package Ficheros;

public class CharCounter2 {
    private int contadorVocalA =0;
    private int contadorVocalE =0;
    private int contadorVocalI =0;
    private int contadorVocalO =0;
    private int contadorVocalU =0;

    public void countIfTargeted(char c) {
        switch (c){
            case 'a' -> contadorVocalA++;
            case 'e' -> contadorVocalE++;
            case 'i' -> contadorVocalI++;
            case 'o' -> contadorVocalO++;
            case 'u' -> contadorVocalU++;
        }
    }

    @Override
    public String toString() {
        return String.format("Hay %s a, %s e, %s i, %s o, %s u en el texto",
                contadorVocalA, contadorVocalE, contadorVocalI, contadorVocalO, contadorVocalU);
    }
}