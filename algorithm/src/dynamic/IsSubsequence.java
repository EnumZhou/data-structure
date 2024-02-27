package dynamic;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 *
 * A subsequence of a string is a new string that is formed from the original string
 * by deleting some (can be none) of the characters without
 * disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 *
 * Example 1:
 *
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 */
public class IsSubsequence {
    public static void main (String args[]) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println("isSubsequence: "+isSubsequence(s,t));
    }

    public static boolean isSubsequence(String s, String t) {
        int sPos = 0;
        int tPos = 0;
        while(sPos <s.length() && tPos<t.length()) {
            if(s.charAt(sPos)==t.charAt(tPos)) {
                sPos++;
            } else {
                tPos++;
            }
        }
        return sPos ==s.length();
    }
}
