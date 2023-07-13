import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("        Agendinha      ");
        System.out.println("------------------------------");

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: \n");
        String username = scanner.nextLine();

        System.out.println("Seja bem vindo " + username);
        System.out.println("Escolha uma opção!\n");
        System.out.println(" 1. Criar contato \n 2. Listar contatos \n 3. Atualizar contato \n 4. Deletar contato");

        System.out.println("------------------------------");


    }
}