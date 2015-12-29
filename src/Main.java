import java.io.IOException;

/**
 * Created by Artem on 29.12.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        String test = "123";

        System.out.println("Enter source folder: ");
        String srcFolder = FolderChecker.checkFolderExist();
        System.out.println("Enter destination folder: ");
        String destFolder = FolderChecker.checkFolderExist();

        System.out.println(srcFolder + " ||||| " + destFolder);


    }
}
