public class Aula4 {
    public static void main(String[] args) {
        Personagem conan = new Guerreiro(1500);
        // Não permite instanciar classe abstrct
        // Personagem persona = new Personagem();
        conan.setNome("Conan");
//        conan.setVida(100);
        System.out.println(conan.getNome());
        System.out.println(conan.getVida());
        conan.atacar();

        // Revisão de comparadores
//        double saldo = 0;
//        boolean isActive = false;
//        String perfil = "Gerente";
//
//        if (
//                ((saldo > 50) && isActive) // || "Gerente".equalsIgnoreCase(perfil)
//        ) {
//            System.out.println("Verdadeiro");
//        } else {
//            System.out.println("Falso");
//        }
    }
}
