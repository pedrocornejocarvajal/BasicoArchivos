package Ficheros;

public class CharCounter2 {
    private int contadorA=0;
    private int contadorE=0;
    private int contadorI=0;
    private int contadorO=0;
    private int contadorU=0;

    public void countIfTargeted(char c) {
        switch (c){
            case 'a' ->contadorA++;
            case 'e' ->contadorE++;
            case 'i' ->contadorI++;
            case 'o' ->contadorO++;
            case 'u' ->contadorU++;
        }
    }

    @Override
    public String toString() {
        return String.format("hay %s a, %s e, %s i, %s o, %s u en el texto",
                contadorA, contadorE, contadorI, contadorO, contadorU);
    }
}