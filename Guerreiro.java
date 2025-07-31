public class Guerreiro extends Personagem {
    private int furia;

    public Guerreiro(int vida) {
        setVida(vida);
    }

    public void atacar() {
        System.out.println("Ataque ao inimigo");
    }
}
