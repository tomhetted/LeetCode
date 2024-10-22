package org.example.task1768;

public class MergeStrings {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(word1.length(), word2.length());

        for (int i = 0; i < minLength; i++) {
            result.append(word1.charAt(i)).append(word2.charAt(i));
        }

        if (word1.length() > minLength) {
            result.append(word1.substring(minLength));
        } else if (word2.length() > minLength) {
            result.append(word2.substring(minLength));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String a = "cdf", b = "a";
        System.out.println(mergeAlternately(a, b));
    }

}
