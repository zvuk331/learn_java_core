package org.example.lesson8;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\Users\\zvuk3\\Desktop\\test");
        Path destination = Paths.get("C:\\Users\\zvuk3\\Desktop\\CopyHere");
        Files.walkFileTree(source, new MyVisitorFile2(source, destination));
        System.out.println("Done!");
    }
}
class MyVisitorFile2 extends SimpleFileVisitor<Path>{
    Path source;
    Path destination;

    public MyVisitorFile2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }


    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

}
