package org.example.task151;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    public static String reverseWords(String s) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        list.removeIf(String::isEmpty);
        Collections.reverse(list);
        StringBuilder builder = new StringBuilder("");
        for (String unit : list) {
            builder.append(" ").append(unit);
        }
        return builder.toString().trim();
    }

    public static void main(String[] args) {
        String a = "the sky is blue";
        String b = "a good   example";
        System.out.println(reverseWords(b));
    }

}
