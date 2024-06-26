package arraystring.permutationdifference;

/*
You are given two strings s and t such that every character occurs at most once in s and t is a permutation of s.

The permutation difference between s and t is defined as the sum of the absolute difference between the index of the
occurrence of each character in s and the index of the occurrence of the same character in t.

Return the permutation difference between s and t.
"abcde"
"edbac"
 */

import java.util.HashMap;
import java.util.Map;

public class PermutationDifference {

    public static int findPermutationDifference(String s, String t) {
        int absSum = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), i);
        }
        for (int i = 0; i < s.length(); i++) {
            absSum += Math.abs(i - map.get(s.charAt(i)));
        }
        return absSum;
    }

    public static int findPermutationDifference2(String s, String t) {
        int absSum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    absSum += Math.abs(i - j);
                }
            }
        }
        return absSum;
    }

    public static int findPermutationDifference3(String s, String t) {
        int absSum = 0;
        for (int i = 0; i < s.length(); i++) {
            absSum += Math.abs(i - t.indexOf(s.charAt(i)));
        }
        return absSum;
    }



}
