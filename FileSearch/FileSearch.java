import java.io.*;

public class FileSearch {
    public static String searchFile(String fileName) {
        File directory = new File("documents");
        if (!directory.exists() || !directory.isDirectory()){
            return null;
        }
        return search(directory, fileName);
    }
    public static String search(File directory, String filename){
         File[] files = directory.listFiles();
        if (files == null) {
            return null;
        }
        for (File file : files) {
            if (file.isDirectory()) {
                String result = search(file, filename);
                if (result != null) {
                    return result; 
                }
            } 
            else if (file.getName().equals(filename)) {
                return file.getPath();
            }
        }
        return null;
    }
}