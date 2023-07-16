import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        final List<Contact> contacts = new ArrayList<>();

        System.out.println("        Agendinha      ");
        System.out.println("------------------------------");

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Login: ");
        String username = scanner.nextLine();

        System.out.print("Senha: ");
        String password = scanner.nextLine();

        boolean running = true;
        while (running) {
        System.out.println("Seja bem vindo " + username);
        System.out.println("Escolha uma opção!\n");
        System.out.println(" 1. Criar contato \n 2. Listar contatos \n 3. Atualizar contato \n 4. Deletar contato");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                createContact(scanner, contacts);
                break;
            
            case 2:
                listContacts(contacts);
                break;
            
            case 3:
                updateContact(scanner, contacts);
                break;
            case 4:
                deleteContact(scanner, contacts);
            default:
                break;
        }


        System.out.println("------------------------------"); 
        }


        
    }

    public static void createContact(Scanner scanner, List<Contact> contacts) {
        scanner.nextLine(); 
        System.out.println("\n--- Lista de contatos ---");
        System.out.print("Nome: ");
        String name = scanner.nextLine();

        System.out.print("Telefone: ");
        String phone = scanner.nextLine();

        System.out.print("Idade: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Endereço: ");
        String address = scanner.nextLine();

        System.out.print("Profissão: ");
        String occupation = scanner.nextLine();

        System.out.print("Observações: ");
        String notes = scanner.nextLine();

        Contact contact = new Contact(name, phone, age, address, occupation, notes);
        contacts.add(contact);

        System.out.println("Contato criado com sucesso.");
    }

    public static void listContacts(List<Contact> contacts) {
        System.out.println("\n--- Lista de contatos ---");
        if (contacts.isEmpty()) {
            System.out.println("Nenhum contato encontrado.");
        } else {
            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = contacts.get(i);
                System.out.println("Contato " + (i + 1) + ":");
                System.out.println("Nome: " + contact.getName());
                System.out.println("Telefone: " + contact.getPhone());
                System.out.println("Idade: " + contact.getAge());
                System.out.println("Endereço: " + contact.getAdress());
                System.out.println("Profissão: " + contact.getOcupation());
                System.out.println("Observações: " + contact.getNotes());
                System.out.println("---------------------------");
            }
        }
    }

    public static void updateContact(Scanner scanner, List<Contact> contacts) {
        System.out.print("Digite o índice do contato a ser atualizado: ");
        int index = scanner.nextInt();
        scanner.nextLine(); 
    
        if (index < 1 || index > contacts.size()) {
            System.out.println("Índice inválido.");
            return;
        }
    
        Contact contact = contacts.get(index - 1);
    
        System.out.print("Novo nome: ");
        String name = scanner.nextLine();
        System.out.print("Novo telefone: ");
        String phone = scanner.nextLine();
        System.out.print("Nova idade: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Novo endereço: ");
        String address = scanner.nextLine();
        System.out.print("Nova profissão: ");
        String occupation = scanner.nextLine();
        System.out.print("Novas observações: ");
        String notes = scanner.nextLine();
    
        contact.setName(name);
        contact.setPhone(phone);
        contact.setAge(age);
        contact.setAdress(address);
        contact.setOcupation(occupation);
        contact.setNotes(notes);
    
        System.out.println("Contato atualizado com sucesso.");
    }

    public static void deleteContact(Scanner scanner, List<Contact> contacts) {
        System.out.print("Digite o índice do contato a ser deletado: ");
        int index = scanner.nextInt();
        scanner.nextLine(); 
    
        if (index < 1 || index > contacts.size()) {
            System.out.println("Índice inválido.");
            return;
        }
    
        Contact contact = contacts.remove(index - 1);
        System.out.println("Contato removido: " + contact.getName());
    }
}