import java.io.IOException;
import java.nio.file.*;

/**
 * Created by Artem on 29.12.2015.
 *
 *
 * Done 1. Скопіювати всі файли в dest (зберігаючи структуру підпапки), які відрізняються за розміром та мають однакове ім’я
 * Done 2. Скопіювати всі нові файли, які присутні в source та відсутні в dest
 * Done 3. Видалити всі файли, які відсутні в source  та присутні в dest
 */
public class Main {
    public static void main(String[] args) throws IOException {

//        String src = "G:\\1t";
//        String dest = "G:\\2t";

        System.out.println("Enter source folder: ");
        String srcFolder = FolderChecker.checkFolderExist();
        System.out.println("Enter destination folder: ");
        String destFolder = FolderChecker.checkFolderExist();

        Path srcPath = Paths.get(srcFolder);
        Path destPath = Paths.get(destFolder);

        Files.walkFileTree(srcPath, new CopyFileVisitor(srcPath, destPath));
        Files.walkFileTree(destPath, new DeleteFileVisitor(destPath, srcPath));

        System.out.println("Done!");


    }
}
