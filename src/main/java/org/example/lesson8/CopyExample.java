package org.example.lesson8;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(
                new FileReader("C:\\Users\\zvuk3\\Desktop\\text1.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\zvuk3\\Desktop\\text2.txt"))

        ){
//            int character;
//            while ((character= reader.read()) != -1){
//                writer.write((char) character);
//            }
            String line;
            while ((line = reader.readLine()) != null){
                writer.write(line);
                writer.write("\n");
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
