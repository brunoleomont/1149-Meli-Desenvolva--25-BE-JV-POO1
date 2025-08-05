public class Aula6 {
    public static void main(String[] args) {
        // Uso sem criar instância
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        Contador c4 = new Contador();
        int total = Contador.getTotal();
        System.out.println(total);
    }
}
