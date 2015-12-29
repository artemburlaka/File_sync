import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Artem on 29.12.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter source folder: ");
        FolderChecker.checkFolderExist();
        System.out.println("Enter destination folder: ");
        FolderChecker.checkFolderExist();


    }
}
