package string;

import java.util.HashSet;

/** Longest Substring Without Repeating Characters
 *
 * Given a string s, find the length of the longest
 * substring
 *  without repeating characters.
 *
 *  Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 */
public class LongestSubString {
    public static void main(String args[]) {
        String s ="abcabcbb";
        lengthOfLongestSubString(s);

    }

    public static int lengthOfLongestSubString(String s) {
        int size = s.length();
        boolean isRepeat = true;

        while (true) {
            int start =0;
            while(start + size <= s.length()) {
                String subString = s.substring(start,start+size);
                isRepeat = hasRepeatingCharacters(subString);
                if(!isRepeat){
                    System.out.println("Sub-string without repeating char: "+subString);
                    return size;
                }
                start++;
            }
            size --;

        }
    }

    public static boolean hasRepeatingCharacters(String s) {
        HashSet<Character> set = new HashSet();
        for(int i =0; i<s.length();i++) {
            set.add(s.charAt(i));
        }
        return !(set.size() == s.length());
    }
}
