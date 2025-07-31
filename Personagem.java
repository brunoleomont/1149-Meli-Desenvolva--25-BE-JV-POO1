public abstract class Personagem {
    private String nome;
    private int vida;
    private int poderAtaque;
    private int defesa;

    public Personagem() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public abstract void atacar();
}
