package Ficheros;

public class CharCounter {

    private String buscar;
    private boolean caseSensitive;
    private int contador;

    public CharCounter(String busqueda, boolean caseSensitive) {
        this.buscar = busqueda;
        this.caseSensitive = caseSensitive;
    }

    public void countIfTargeted(char c) {
        if (this.caseSensitive) {
            if (buscar.toLowerCase().contains(Character.toString(c).toLowerCase())) {
                contador++;
            }
        } else {
            if (buscar.contains(Character.toString(c))) {
                contador++;
            }
        }

    }

    @Override
    public String toString() {
        return "Hay " + contador + " vocales";
    }
}
