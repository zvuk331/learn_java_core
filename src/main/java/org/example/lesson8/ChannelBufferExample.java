package org.example.lesson8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class ChannelBufferExample {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("test10.txt", "rw");
            FileChannel channel = file.getChannel()){
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder text = new StringBuilder();

            int byteRead = channel.read(buffer);

            while (byteRead > 0){
                buffer.flip();

                while (buffer.hasRemaining()){
                    text.append((char) buffer.get());
                }
                buffer.clear();

                byteRead = channel.read(buffer);

            }
            System.out.println(text);

            String text2 = "\nWe use cookies to remember your preferences and to analyze our traffic. " +
                    "We do not carry ads and will never sell your data to third parties.";
            ByteBuffer buffer3 = ByteBuffer.wrap(text2.getBytes());
            channel.write(buffer3);
//            ByteBuffer buffer2 = ByteBuffer.allocate(text2.getBytes().length);
//            buffer2.put(text2.getBytes());
//            buffer2.flip();
//            channel.write(buffer2);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
