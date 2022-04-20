package Ficheros;

public class ContarLetras {

    private final String buscar;
    private final boolean caseSensitive;
    private int contador;

    public ContarLetras(String busqueda, boolean caseSensitive) {
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
