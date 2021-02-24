package org.example.lesson8;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DeleteFilesAndDir {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\zvuk3\\Desktop\\CopyHere");
        Files.walkFileTree(path, new MyVisitorFile3());
        System.out.println("Done!");
    }
}
class MyVisitorFile3 extends SimpleFileVisitor<Path>{

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Files.delete(file);
        System.out.println("Deleted file " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        Files.delete(dir);
        System.out.println("Deleted directory " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}
