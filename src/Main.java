import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by Artem on 29.12.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        //для копирования файлов нужно писать путь не к директории, а именно к файлу!
        //причем в dest тоже должен быть прописан путь к "еще не перемещенному" файлу
        String src = "G:\\1t\\Main.java";
        String dest = "G:\\2t\\Main.java";

//        System.out.println("Enter source folder: ");
//        String srcFolder = FolderChecker.checkFolderExist();
//        System.out.println("Enter destination folder: ");
//        String destFolder = FolderChecker.checkFolderExist();
//
//        System.out.println(srcFolder + " ||||| " + destFolder);

//        Path srcPath = Paths.get(srcFolder);
//        Path destPath = Paths.get(destFolder);

        //TODO прохождение по каждому файлу директории

        Path srcPath = Paths.get(src);
        Path destPath = Paths.get(dest);

        Files.copy(srcPath, destPath);

        System.out.println("Done!");


    }
}
