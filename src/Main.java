import java.io.IOException;
import java.nio.file.*;

/**
 * Created by Artem on 29.12.2015.
 *
 *
 * 1. ��������� �� ����� � dest (��������� ��������� �������), �� ����������� �� ������� �� ����� �������� ���
 * 2. ��������� �� ��� �����, �� ������� � source �� ������ � dest
 * 3. �������� �� �����, �� ������ � source  �� ������� � dest
 */
public class Main {
    public static void main(String[] args) throws IOException {

        //��� ����������� ������ ����� ������ ���� �� � ����������, � ������ � �����!
        //������ � dest ���� ������ ���� �������� ���� � "��� �� �������������" �����
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

        //TODO ������ ����������� ����� �������� ����� 1t (�������� ������ ������ preVisitDirectory)
        //TODO

        Path srcPath = Paths.get(src);
        Path destPath = Paths.get(dest);

        Files.walkFileTree(srcPath, new MyFileVisitor(srcPath, destPath));

        System.out.println("Done!");


    }
}
