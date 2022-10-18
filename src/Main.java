import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder(
                "C:\\Program Files\\Git\\git-bash", "-c", "cat prueba.txt | wc");
        processBuilder.directory(new File("./src"));
        processBuilder.start();
    }
}