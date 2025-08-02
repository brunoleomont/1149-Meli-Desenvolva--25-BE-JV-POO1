public class Agenda {
     class MinhaAgenda {
         Contato[] contatos = new Contato[10];
         int contador = 0;

         void adicionarContato(Contato contato) {
             if (contador < contatos.length) {
                 contatos[contador] = contato;
                 contador++;
             } else {
                 System.out.println("Agenda cheia!");
             }
         }

         void listarContatos() {
             for (int i = 0; i < contador; i++) {
                 System.out.println("Contato " + (i + 1) + ": " + contatos[i].getNome() + ", Telefone: " + contatos[i].getTelefone());
             }
         }
     }
}
