public class Contador {
    private static int total = 0; // Variável de classe
    private int id;
    public Contador() {
        total++; // Incrementa contador global
        id = total;
    }
    public static int getTotal() { // Método de classe
        return total;
    }
}