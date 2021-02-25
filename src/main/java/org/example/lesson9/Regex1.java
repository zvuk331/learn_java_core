package org.example.lesson9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s = "ABCDEFABCOPABCNKABIRABBAJTLABCOF";
//        Pattern pattern = Pattern.compile("[ABC]");
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            System.out.println("Position: " + matcher.start() + "   "  + matcher.group());
        }
    }
}
