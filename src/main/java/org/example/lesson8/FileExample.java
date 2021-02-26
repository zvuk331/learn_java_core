package org.example.lesson8;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\zvuk3\\Desktop\\newdir\\test10.txt");
        File folder = new File("C:\\Users\\zvuk3\\Desktop\\newdir");
//        System.out.println(file.getAbsolutePath());
//        System.out.println(folder.isDirectory());
//        folder.mkdir();
//        file.createNewFile();
//        System.out.println(folder.length());
//        System.out.println(file.length());

//        File[] files = folder.listFiles();
//        System.out.println(Arrays.toString(files));

        file.delete();
        folder.delete();

    }
}
