public class Aula3 {
    public static void main(String[] args) {
        // Aula 3
        Matematica calculadora = new Matematica();
        System.out.println("Soma = " + calculadora.soma(4,5));
        System.out.println("Valor de PI ao quadrado: " + calculadora.piAoQuadrado());

        ContaBancaria conta1 = new ContaBancaria();
        System.out.println("Saldo: " + conta1.getSaldo());
        // Trabalhei
        //conta1.setSaldo(-100);
        conta1.setPerfil("Gerente");
        conta1.depositar(100);
        conta1.depositar(100);
        conta1.depositar(25);
        conta1.setNome("Jhenny");
        System.out.println("A conta pertence a: " + conta1.getNome());
        System.out.println("Trabalhei, agora meu saldo é: " + conta1.getSaldo());
    }
}
