import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Artem on 29.12.2015.
 */
public class FolderChecker {

    public static void checkFolderExist() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String srcFolder = reader.readLine();
        File folder = new File(srcFolder);
        if (folder.exists()) {
            System.out.println("Folder exists");
        } else {
            System.out.println("Folder does not exist. Enter the correct name of the folder:");
            checkFolderExist();
        }
    }
}
