import java.io.IOException;

public class ClearScreen {
    public void clearScreen() throws IOException{
        String os = System.getProperty("os.name");

        if (os.contains("Windows"))
        {
            Runtime.getRuntime().exec("cls");
        }
        else
        {
            Runtime.getRuntime().exec("clear");
        }
        
    }
}
