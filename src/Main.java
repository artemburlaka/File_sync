import java.io.IOException;
import java.nio.file.*;

/**
 * Created by Artem on 29.12.2015.
 *
 *
 * 1. Скопіювати всі файли в dest (зберігаючи структуру підпапки), які відрізняються за розміром та мають однакове ім’я
 * 2. Скопіювати всі нові файли, які присутні в source та відсутні в dest
 * 3. Видалити всі файли, які відсутні в source  та присутні в dest
 */
public class Main {
    public static void main(String[] args) throws IOException {

        //для копирования файлов нужно писать путь не к директории, а именно к файлу!
        //причем в dest тоже должен быть прописан путь к "еще не перемещенному" файлу
//        String src = "G:\\1t\\Main.java";
//        String dest = "G:\\2t\\Main.java";
        String src = "G:\\1t";
        String dest = "G:\\2t";

//        System.out.println("Enter source folder: ");
//        String srcFolder = FolderChecker.checkFolderExist();
//        System.out.println("Enter destination folder: ");
//        String destFolder = FolderChecker.checkFolderExist();

//        Path srcPath = Paths.get(srcFolder);
//        Path destPath = Paths.get(destFolder);

        //TODO убрать копирование самой корневой папки 1t (возможно просто убрать preVisitDirectory)
        //TODO

        Path srcPath = Paths.get(src);
        Path destPath = Paths.get(dest);

        Files.walkFileTree(srcPath, new MyFileVisitor(srcPath, destPath));

        System.out.println("Done!");


    }
}
