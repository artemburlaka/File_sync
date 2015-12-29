import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Artem on 29.12.2015.
 */
public class FolderChecker {
        static String trueFolder = "";

    public static String checkFolderExist() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ourFolder = reader.readLine();
        File folder = new File(ourFolder);
        if (folder.exists()) {
            System.out.println("Folder exists");
            trueFolder = ourFolder;
        } else {
            System.out.println("Folder does not exist. Enter the correct name of the folder:");
            checkFolderExist();
        }
        return trueFolder;
    }
}
