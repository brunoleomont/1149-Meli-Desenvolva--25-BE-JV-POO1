public class Aula5 {
    public static void main(String[] args) {
        Personagem guerreiro = new Guerreiro(100);
        Personagem mago = new Mago();
        Personagem npc = new NPC();

        // Polimorfismo em ação
        guerreiro.atacar();
        mago.atacar();
        npc.atacar();

        // classe base
        class Forma {
            public double calcularArea() {
                return 0;
            }
        }

        // Classe Herança Circulo
        class Circulo extends Forma {
            private double raio = 10;
            @Override
            public double calcularArea() {
                return Math.PI * raio * raio;
            }
        }

        // Classe Herança Quadrado
        class Quadrado extends Forma {
            int lado = 10;
            public double calcularArea() {
                return lado * lado;
            }
        }

        // Polimorfismo em ação
        Forma circulo = new Circulo();
        Forma quadrado = new Quadrado();
        System.out.println("Area do Circulo = " + circulo.calcularArea()); // Chama método do Circulo
        System.out.println("Area do Quadrado = " + quadrado.calcularArea());
    }
}
