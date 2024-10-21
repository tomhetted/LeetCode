package org.example.task125;

import java.util.Locale;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        s = s.toLowerCase(Locale.ROOT);
        StringBuilder straight = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            char unit = s.charAt(i);
            if (Character.isLetterOrDigit(unit)) {
                straight.append(unit);
            }
        }

        String str = straight.toString();
        return (str.equals(straight.reverse().toString()));
    }

    public static void main(String[] args) {
        String s = " ";
        System.out.println(isPalindrome(s));
    }

}
