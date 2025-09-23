import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Cat {
    public static void cat(String[] args) throws IOException {
        // your code here
        if (args.length !=1){
            return ;
        }
        String filename= args[0];
        Path path= Path.of(filename);
        try {
            byte[] content = Files.readAllBytes(path);
            System.out.write(content);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}