package org.example.lesson8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Map;

public class PathAndFilesExample {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test11.txt");
        Path directoryPath = Paths.get("C:\\Users\\zvuk3\\Desktop\\test");
        Path directoryPath3 = Paths.get("C:\\Users\\zvuk3\\Desktop\\test2");
        Path anotherPath = Paths.get("C:\\Users\\zvuk3");
//        System.out.println(filePath.relativize(directoryPath));
//        System.out.println(directoryPath.relativize(anotherPath));
//        System.out.println("===============================================");
//
//        System.out.println(Files.size(filePath));
//        System.out.println(Files.getAttribute(filePath, "creationTime"));

//        Map<String, Object> map = Files.readAttributes(filePath, "*");
//
//        for (Map.Entry<String, Object> entry : map.entrySet())
//        {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }

//        Files.copy(directoryPath3,directoryPath.resolve("folder"));
//        Files.move(filePath, directoryPath.resolve("test15.txt"));
//        Files.copy(filePath, directoryPath.resolve("test16.txt"), StandardCopyOption.REPLACE_EXISTING);
//        Files.move(filePath, Paths.get("test11.txt"));
//        Files.delete(filePath);

//        Files.createFile(filePath);
        String text = "Hello my friend, long time no see.";
        String text2 = "Здорова давно не виделись";
//        Files.write(filePath, text2.getBytes());
        List<String> list = Files.readAllLines(filePath);

        list.forEach(System.out::println);
    }
}
