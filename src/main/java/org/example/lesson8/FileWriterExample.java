package org.example.lesson8;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        String text = "Расскажите про покупки,\n" +
                "Про какие про покупки?\n" +
                "Про покупки, про покупки,\n" +
                "Про покупочки мои.\n" +
                "\n";
        FileWriter writer = null;
        try {
            writer = new FileWriter("C:\\Users\\zvuk3\\Desktop\\text1.txt",true);
            for (int i = 0; i < text.length(); i++) {
                writer.write(text.charAt(i));
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();

        }

    }
}
