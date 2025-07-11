package LeetCode.RecursionBacktracking.CombinationSum2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[] { 1, 1, 1, 2, 2 }, 4));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        generateCombinations(new ArrayList<>(), candidates, target, 0, res);
        return res;
    }

    /*
     * Backtracking approach
     * Time Complexity - 2 ^ n * k
     */
    public static void generateCombinations(List<Integer> processed, int[] unprocessed, int position, int target,
            List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(processed));
            return;
        }
        if (target < 0)
            return;
        for (int i = position; i < unprocessed.length; i++) {
            if (i > position && unprocessed[i] == unprocessed[i - 1]) {
                // curr num should not be same as prev(avoiding duplicates), we
                // don't have to check condition when picking first number for
                // nth position
                continue;
            }
            int choiceForCurrentPosition = unprocessed[i];
            processed.add(choiceForCurrentPosition);
            // current position num is locked, go and find the nums for next position,
            // that's why i + 1
            generateCombinations(processed, unprocessed, i + 1, target - choiceForCurrentPosition, res);

            // this is actual backtracking, undoing the choice that we made, we no longer
            // need this choice because we found out all the answers with this choice, now
            // go and give chance to another guys to be at this position
            processed.removeLast();
        }
    }
}
