import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        Path path= Paths.get(fileName);
        Files.createFile(path);
        Files.write(path,content.getBytes());
    }
    public static String getContentFile(String fileName) throws IOException {
        Path path = Path.of(fileName);
        String content = Files.readString(path);
        return content;
    }
    public static void deleteFile(String fileName) {
        Path path = Path.of(fileName);
        try{
            Files.delete(path);
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
} 