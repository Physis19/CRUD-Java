import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Login {
public boolean login(String username, String password) throws IOException {
    File database = new File("src/auth/usersDatabase.txt");
    Reader reader = new FileReader(database);
    BufferedReader bufferedReader = new BufferedReader(reader);

    String line;
    boolean usernameFound = false;

    while ((line = bufferedReader.readLine()) != null) {
        if (line.equals(username)) {
            String storedPassword = bufferedReader.readLine();

            if (storedPassword.equals(password)) {
                bufferedReader.close();
                return true;
            } else {
                bufferedReader.close();
                System.out.println("Senha incorreta");
                return false;
            }
        }
    }

    bufferedReader.close();

    if (!usernameFound) {
        System.out.println("Nome de usuário não encontrado");
        System.out.println("Deseja criar um novo usuário? (Y/N): ");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("y")) {
            System.out.println("Usuário: ");
            String newUser = scanner.nextLine();

            System.out.println("Senha: ");
            String newPassword = scanner.nextLine();

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(database, true))) {
                bufferedWriter.newLine();
                bufferedWriter.write(newUser);
                bufferedWriter.newLine();
                bufferedWriter.write(newPassword);
            }

            System.out.println("Usuário cadastrado com sucesso!");
            return false;
        } else {
            System.out.println("Usuário não criado.");
            return false;
        }
    }

    return false;
}
}
