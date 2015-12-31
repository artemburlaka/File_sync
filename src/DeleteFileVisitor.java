import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by Artem on 31.12.2015.
 */
public class DeleteFileVisitor extends SimpleFileVisitor<Path> {
    private Path destPath;
    private Path srcPath;

    public DeleteFileVisitor(Path destPath, Path srcPath) {
        this.destPath = destPath;
        this.srcPath = srcPath;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path checkPathFile = srcPath.resolve(file.getFileName());
        File checkFile = new File(String.valueOf(checkPathFile));
        if (checkFile.exists() != true) {
            Files.delete(file);
        }
        else {
            //do nothing
        }

        return FileVisitResult.CONTINUE;
    }
}
