package org.example.task58;

import java.util.ArrayList;
import java.util.Arrays;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        list.removeIf(String::isEmpty);
        return list.get(list.size() - 1).length();
    }

    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }

}
