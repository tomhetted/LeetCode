package org.example.task392;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;

        int subIndex = 0;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(subIndex)) {
                subIndex++;
            }
            if (subIndex == s.length()) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

}
