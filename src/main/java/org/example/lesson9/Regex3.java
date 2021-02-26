package org.example.lesson9;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {
    public static void main(String[] args) {
        String email = "anymail@gmail.com";
        String text = "Здорова давно не виделись\n" +
                "Здорова давно не виделись\n" +
                "Здорова давно не виделись\n" +
                "Здорова давно не виделись\n" +
                "Здорова давно не виделись";
        boolean result = email.matches("\\w+@\\w+\\.(ru|com)");
        String[] array = text.split(" ");
//        System.out.println(Arrays.toString(array));
//        System.out.println(result);
        String example = "Тут       какой-то       текст   ";
        example = example.replaceAll(" {2,}", " ");
        System.out.println(example);

        String newString = "12345678932638920303750;23567890654387320405176;75439274631243850510327";
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(newString);

//        String cards = matcher.replaceAll("$1 $2 $3 $4 $5/$6 ($7)");
        String numberCard = matcher.replaceAll("$1 $2 $3 $4");
        String dateCard = matcher.replaceAll("$5/$6");
        String cvcCard = matcher.replaceAll("$7");
        System.out.println(numberCard);
        System.out.println(dateCard);
        System.out.println(cvcCard);
    }
}
