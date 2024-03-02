package string;

/**
 * 28. Find the Index of the First Occurrence in a String
 *
 * Given two strings needle and haystack,
 * return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 *
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 */

public class FirstOccurrence {
    public static void main (String args[]) {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(needle+ " first occurs at index: "+ firstIndexOfOccurrence(haystack,needle));
    }

    public static int firstIndexOfOccurrence(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
