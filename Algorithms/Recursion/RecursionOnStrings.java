/*
* Created on 24 Aug 2024
* 
* @author Sai Sumanth
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RecursionOnStrings {
    /*
     * Declaring one global array which will be used by generate subsequences method
     * to store each subsequence of a string after finding out inside the recursive
     * function
     */
    private static List<String> subSequences = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s: ");
        String s = sc.next();

        /*
         * Remove a specific char
         */
        System.out.println("String before removing 'a' " + s);
        String newS = removeSpecificChar(s, 0, "");
        System.out.println("String after removing 'a' " + newS);

        /*
         * Remove a specific char (without passing res in arg version)
         */
        System.out.println("String before removing 'a' " + s);
        String newString = removeSpecificCharWithoutPassingRes(s, 0);
        System.out.println("String after removing 'a' " + newString);

        /*
         * Find all subsequences of a string "abc"
         */
        subSequences.clear();
        findAllSubsequencesOfString("", "abc");
        System.out.println("Total length : " + subSequences.size() + " -> " + subSequences.toString());

        /*
         * Generate all subsequences or subsets of string
         * No need of any global or class-level array to store the
         * results, creates a list inside fn and returns it
         */
        List<String> generatedSubsequences = generateAllSubsequences("", s);
        System.out.println("All subsequences of " + s + " :" + generatedSubsequences.toString());

        /*
         * Generate all subsets of array using Iterative Approach
         */
        var allSubsets = generateAllSubsetsOfArray(new ArrayList<>(Arrays.asList(1, 2, 3)));
        System.out.println("All subsets of an array : " + allSubsets);

        List<List<Integer>> subsetsOfArr = new ArrayList<>();
        subsetsOfArrayRec(new ArrayList<>(), new ArrayList<>(Arrays.asList(3, 1, 2)), 0, subsetsOfArr);
        System.out.println("All subsets of an array(Recursion) : " + subsetsOfArr);

        subsetsOfArr.clear();
        subsetsOfArr = subsetsOfArrayRecWithoutPassingRes(new ArrayList<>(), new ArrayList<>(Arrays.asList(1, 2, 3)),
                0);
        System.out.println("All subsets of an array(Recursion - without passing res in params) : " + subsetsOfArr);

        sc.close();
    }

    /*
     * Removes all 'a' chars from the given string
     */
    public static String removeSpecificChar(String s, int currentIndex, String res) {
        if (currentIndex == s.length())
            return res;

        char c = s.charAt(currentIndex);
        if (c != 'a')
            res += c;

        return removeSpecificChar(s, currentIndex + 1, res);
    }

    /*
     * Removes all 'a' chars from the given string, without passing result in
     * argument
     */
    public static String removeSpecificCharWithoutPassingRes(String s, int currentIndex) {
        if (currentIndex == s.length())
            return "";
        char c = s.charAt(currentIndex);
        if (c != 'a') {
            return c + removeSpecificCharWithoutPassingRes(s, currentIndex + 1);
        }
        return removeSpecificCharWithoutPassingRes(s, currentIndex + 1);
    }

    /*
     * Subsets, Subsequence ft.Strings
     */

    /*
     * Generate all subsequences of a string,
     * This fn doesn't return anything, stores each substring in class-level array
     * `subSequences` declared at the top.
     * 
     * Algorithm: Take two strings processed and unprocessed.
     * Unprocessed string will be the given string.
     * Processed string will be empty initially
     * 
     * In each step(draw recursive tree) chop off the first char of unProcessed and
     * do two things
     * 1. Add that char to processed string
     * 2. On the other side ignore that char
     * 
     * Repeat the above two steps until unprocessed string becomes empty. when it's
     * empty then consider the processed string as one sub-sequence
     */
    static void findAllSubsequencesOfString(String processedString, String unProcessedString) {
        if (unProcessedString.isEmpty()) {
            /*
             * If unprocessed string is empty then consider processed string as result
             */
            subSequences.add(processedString);
            return;
        }
        // every time we are taking first char because we are trimming the first char
        // every time this fn is called again. instead of modifying the given string,
        // you can add currentIndex as argument
        char firstChar = unProcessedString.charAt(0);

        // consider first char
        findAllSubsequencesOfString(processedString + firstChar, unProcessedString.substring(1));

        // ignore first char
        findAllSubsequencesOfString(processedString, unProcessedString.substring(1));
    }

    /*
     * For string "abc" the list of all sub sequences [abc, ab, ac, a, bc, b, c, ]
     * along with the empty string
     */
    static List<String> generateAllSubsequences(String current, String s) {
        if (s.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(current);
            return list;
        }
        char firstChar = s.charAt(0);

        // consider firstChar in subsequence
        List<String> leftTreeList = generateAllSubsequences(current + firstChar, s.substring(1));

        // ignore firstChar in subsequence
        List<String> rightTreeList = generateAllSubsequences(current, s.substring(1));

        // you can add into right list as well, we just have to return both lists
        // contents to parent node in recursion tree
        leftTreeList.addAll(rightTreeList);
        return leftTreeList;
    }

    /*
     * ▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂
     * ▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂
     * ▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂ Array Subsets ▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂
     * ▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂
     * ▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂
     */

    /*
     * Generate all subsets of an array using iterative approach
     */
    static List<List<Integer>> generateAllSubsetsOfArray(List<Integer> list) {
        List<List<Integer>> res = new ArrayList<>();
        // add the empty list first
        res.add(new ArrayList<>());

        //
        for (int num : list) {
            int prevListsSize = res.size();
            for (int i = 0; i < prevListsSize; i++) {
                var eachInternal = new ArrayList<>(res.get(i));
                eachInternal.add(num);
                res.add(eachInternal);
            }
        }
        return res;
    }

    /*
     * Generate all subsets of array using recursion
     * LC 78 Subsets https://leetcode.com/problems/subsets/description/
     */
    static void subsetsOfArrayRec(List<Integer> processed, List<Integer> given, int currIndex,
            List<List<Integer>> res) {

        if (currIndex == given.size()) {
            res.add(new ArrayList<>(processed));
            return;
        }
        // take first num
        int num = given.get(currIndex);
        processed.add(num);
        subsetsOfArrayRec(processed, given, currIndex + 1, res);

        // ignore first num
        processed.removeLast();
        // remember this removeLast is not backtracking. there is diff between
        // "i = i + 1 and then calling fn(i)" vs directly calling fn(i+1)
        subsetsOfArrayRec(processed, given, currIndex + 1, res);

    }

    /*
     * 😎 generate all subsets without passing result in parameters
     */
    static List<List<Integer>> subsetsOfArrayRecWithoutPassingRes(List<Integer> processed, List<Integer> given,
            int currIndex) {

        if (currIndex == given.size()) {
            List<List<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<>(processed));
            return res;
        }
        // take first num
        int num = given.get(currIndex);
        processed.add(num);
        List<List<Integer>> leftSubsets = subsetsOfArrayRecWithoutPassingRes(processed, given, currIndex + 1);

        // ignore first num
        processed.removeLast();
        List<List<Integer>> rightSubsets = subsetsOfArrayRecWithoutPassingRes(processed, given, currIndex + 1);

        rightSubsets.addAll(leftSubsets);
        return rightSubsets;
    }

}
