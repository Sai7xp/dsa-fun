package LC3488;

import java.util.*;

public class ClosestEqualElementQueries {
    public static void main(String[] args) {
        var res = solveQueries(new int[] { 1, 3, 1, 4, 1, 3, 2 }, new int[] { 0, 3, 5 });
        System.out.println(res);
    }

    public static List<Integer> solveQueries(int[] nums, int[] queries) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            map.putIfAbsent(x, new ArrayList<>());
            map.get(x).add(i);
        }

        for (int x : queries) {
            int num = nums[x];
            var indexesOfNum = map.get(num);
            int size = indexesOfNum.size();
            int len = nums.length;

            int indexOfIndex = Collections.binarySearch(indexesOfNum, x);
            if (size == 1) {
                res.add(-1);
            } else {
                // we need to pick the left side index of indexOfIndex,
                // when indexOfIndex is zero we need to go circular
                int leftIndex = indexesOfNum.get((indexOfIndex - 1 + size) % size);
                int backward = Math.min(Math.abs(x - leftIndex), len - Math.abs(x - leftIndex));

                // right index
                int rightIndex = indexesOfNum.get((indexOfIndex + 1) % size);
                int forward = Math.min(Math.abs(rightIndex - x), len - Math.abs(x - rightIndex));

                int queryRes = Math.min(forward, backward);
                res.add(queryRes);
            }
        }
        return res;
    }
}