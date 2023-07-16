import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Login {
    public void login(String username, String password) throws IOException{
        File database = new File("src/auth/usersDatabase.txt");
        Reader reader = new FileReader(database);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            if (line.equals(username)) {
                
                
                break; 
            }
        }
        
    }
}
