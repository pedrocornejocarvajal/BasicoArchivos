package Ficheros;

public class CharCounter {

    private String busqueda;
    private boolean caseSensitive;
    private int contador;

    public CharCounter(String busqueda, boolean caseSensitive) {
        this.busqueda = busqueda;
        this.caseSensitive = caseSensitive;
    }

    public void countIfTargeted(char c) {
        if (this.caseSensitive) {
            if (busqueda.toLowerCase().contains(Character.toString(c).toLowerCase())) {
                contador++;
            }
        } else {
            if (busqueda.contains(Character.toString(c))) {
                contador++;
            }
        }

    }

    @Override
    public String toString() {
        return "Hay " + contador + " vocales";
    }
}
