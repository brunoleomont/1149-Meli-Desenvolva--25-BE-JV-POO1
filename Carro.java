public class Carro {
        public String cor;
        String marca;
        String modelo;
        int roda;
        String placa;

        public Carro() {}

        public Carro(String marca, String modelo){
                this.marca = marca;
                this.modelo = modelo;
        }

        public Carro(String marca, int roda){
                this.marca = marca;
                this.roda = roda;
        }

        public Carro(String marca, int roda, String modelo) {
                this.marca = marca;
                this.roda = roda;
                this.modelo = modelo;
        }
}