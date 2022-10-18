import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder(
                "C:\\Program Files\\Git\\git-bash", "-c", "cat prueba.txt | wc > resultado.txt");
        processBuilder.directory(new File("./src"));
        processBuilder.start();
        Thread.sleep(1000);
        File archivo = new File ("./src/resultado.txt");
        FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
    }
}