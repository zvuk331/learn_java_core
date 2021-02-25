package org.example.lesson9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        String s = "Oleg Ivanov, anymail@gmail.com, +79005603478, Moscow";
//        Pattern pattern = Pattern.compile("\\w+");
//        Pattern pattern = Pattern.compile("\\+\\d{11}");
//        Pattern pattern = Pattern.compile("[A-Za-z0-9._]+@[a-z0-9.-]+.[a-z]{2,4}");
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
