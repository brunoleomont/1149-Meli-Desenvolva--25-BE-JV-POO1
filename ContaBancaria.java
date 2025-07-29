public class ContaBancaria {
    // criar nome
    // criar perfil ("Gerente", "Atendente")
    // crirar regra pra permitir depositar somente se for perfil "Gerente"
    private String nome;
    private String perfil;
    private boolean isActive;
    private double saldo; // Encapsulado

    public ContaBancaria() {
        this.isActive = true;
    }

    // Getter
    public double getSaldo() {
        return saldo;
    }
    // Setter
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    // Setter com validação
    public void depositar(double valor) {
        if (valor > 0 & "Gerente".equalsIgnoreCase(perfil) && isActive) {
            saldo += valor;
        } else {
            System.out.println("Não é permitido deposito sem ser perfil Gerente");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}