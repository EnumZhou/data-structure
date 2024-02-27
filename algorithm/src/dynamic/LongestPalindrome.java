package dynamic;

/**
 * Given a string s, return the longest
 * palindromic
 *
 * substring
 *  in s.
 *
 *
 *  Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 */

public class LongestPalindrome {
    public static void main(String args[]) {
        String s ="babad";
        System.out.println("longest Palindrome: "+longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        int size = s.length();
        boolean isPalindrome = false;
        while(true) {
            int start =0;
            while(start+size <=s.length()) {
                String subString = s.substring(start,start+size);
                isPalindrome = isPalindrome(subString);
                if(isPalindrome)
                    return subString;
                start++;
            }
            size--;
        }
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
