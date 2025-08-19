/*
* Created on 26 Oct 2024
* 
* @author Sai Sumanth
*/
package LC76;

public abstract class MinimumWindowSubstring {

    // Brute Force Solution
    // O(N^2) TC and O(58) SC
    public String minWindowBruteForce(String s, String t) {
        int firstIndex = -1, minLength = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int[] hash = new int[58];

            // increase freq for t string
            for (int k = 0; k < t.length(); k++)
                hash[t.charAt(k) - 'A']++;
            int count = 0;
            for (int j = i; j < s.length(); j++) {
                // if freq is positive then that char is from string t
                if (hash[s.charAt(j) - 'A'] > 0)
                    count++;
                // decrease freq for s string
                hash[s.charAt(j) - 'A']--;
                if (count == t.length()) {
                    if ((j - i + 1) < minLength) {
                        minLength = j - i + 1;
                        firstIndex = i;
                    }
                    break;
                }
            }
        }
        if (minLength == Integer.MAX_VALUE)
            return "";
        return s.substring(firstIndex, firstIndex + minLength);
    }

    /*
     * Slightly Better Time Complexity - ACCEPTED
     */
    public static boolean areFrequenciesEqual(int[] sm, int[] tm) {
        // System.out.println(Arrays.toString(sm));
        // System.out.println(Arrays.toString(tm));
        for (int i = 0; i < tm.length; i++) {
            if (tm[i] > sm[i])
                return false;
        }
        return true;
    }

    public String minWindow(String s, String t) {
        if (t.length() > s.length())
            return "";
        String minSubstring = s;
        int leftPointer = 0;
        int[] tm = new int[58];
        int[] sm = new int[58];
        for (int i = 0; i < t.length(); i++) {
            tm[t.charAt(i) - 'A']++;
        }
        boolean frequenciesNeverMatched = true;
        for (int i = 0; i < s.length(); i++) {
            sm[s.charAt(i) - 'A']++;
            if (areFrequenciesEqual(sm, tm)) {
                frequenciesNeverMatched = false;
                // we found the substring, now get the min by shrinking
                while (areFrequenciesEqual(sm, tm)) {
                    if (i - leftPointer + 1 < minSubstring.length()) {
                        minSubstring = s.substring(leftPointer, i + 1);
                    }
                    char leftMost = s.charAt(leftPointer++);
                    sm[leftMost - 'A']--;
                }
            }
        }
        if (frequenciesNeverMatched)
            return "";

        return minSubstring;
    }

    // 😎 Most Optimal
    class Solution {
        public String minWindow(String s, String t) {
            if (t.length() > s.length())
                return "";
            int firstIndex = -1, minLen = Integer.MAX_VALUE;
            int[] hash = new int[58];
            for (int i = 0; i < t.length(); i++)
                hash[t.charAt(i) - 'A']++;
            int count = 0, leftPointer = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (hash[ch - 'A'] > 0)
                    count++;
                hash[ch - 'A']--;
                // window is found where the window contains all chars of t
                // now we need to check if we can minimize the window by shrinking it
                while (count == t.length()) {
                    int len = i - leftPointer + 1;
                    if (len < minLen) {
                        minLen = len;
                        firstIndex = leftPointer;
                    }
                    // while shrinking keep increasing the counter of chars
                    char leftMost = s.charAt(leftPointer++);
                    hash[leftMost - 'A']++;
                    if (hash[leftMost - 'A'] > 0)
                        count--;
                }
            }
            if (minLen == Integer.MAX_VALUE)
                return "";
            return s.substring(firstIndex, firstIndex + minLen);
        }
    }

}
