public class Aula2 {
    public static void main(String[] args) {
        // Aula 2
        // objeto Carro 1
        Carro carroDoJoao = new Carro();
        carroDoJoao.cor = "verde";
        carroDoJoao.marca = "fiat";

        // objeto Carro 2
        Carro carroDaRegiane = new Carro();
        carroDaRegiane.roda = 29;
        carroDaRegiane.placa = "PLRSZ456";
        carroDaRegiane.cor = "Amarela";
        carroDaRegiane.marca = "Ford";

        // objeto Carro 3
        Carro carroDoManuel = new Carro("Ford", "Fiesta");
        System.out.println("Marca do Carro do Manuel: " + carroDoManuel.marca
                + "\nModelo do Carro do Manuel: " + carroDoManuel.modelo);

        // objeto Carro 4
        Carro carroDaManuela = new Carro("Ford", 22);
        System.out.println("Marca do Carro da Manuela: " + carroDaManuela.marca
                + "\nModelo do Carro da Manuela: " + carroDaManuela.modelo);

        // objeto Carro 5
        Carro carroDaManuela2 = new Carro("Ford", 22, "Fiesta");
        System.out.println("Marca do Carro da Manuela 2: " + carroDaManuela2.marca
                + "\nModelo do Carro da Manuela 2: " + carroDaManuela2.modelo);

        // Declaração
        String nome;
        Carro carroAzul;

        // Atribui valor
        nome = "Bruno";
        carroAzul = new Carro();

         System.out.println("Cor do Carro do João: " + carroDoJoao.cor
                + "\nMarca do Carro do João: " + carroDoJoao.marca);
         System.out.println(carroDoJoao.marca);
         System.out.println(carroDoJoao.roda);
         // saida carro 2
        System.out.println("Cor do Carro da Regiane: " + carroDaRegiane.cor
                + "\nMarca do Carro da Regiane: " + carroDaRegiane.marca);

        System.out.println(carroDaRegiane.roda);
        System.out.println(carroDaRegiane.placa);
    }
}
