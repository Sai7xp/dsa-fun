package LeetCode.Sorting.LC1636;

import java.util.*;

class CustomComparator implements Comparator<Map.Entry<Integer, Integer>> {
    @Override
    public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2) {
        if (m1.getValue() == m2.getValue()) {
            return Integer.compare(m2.getKey(), m1.getKey());
        }
        return Integer.compare(m1.getValue(), m2.getValue());
    }
}

public class SortArrayByIncreasingFreq {
    public static void main(String[] args) {
        // by writing a custom comparator
        System.out.println("Solution 1: " + Arrays.toString(frequencySort(new int[] { 1, 1, 2, 2, 2, 3 })));

        // comparator using lamba expression. short and simple
        System.out.println("Solution 2: " + Arrays.toString(frequencySort2(new int[] { 1, 1, 2, 2, 2, 3 })));

        /*
         * Using Custom Comparators
         */
        int[] arr = new int[] { 1, 2, 4, 2, 2, 0 };
        Integer[] arrPro = new Integer[] { 1, 2, 4, 2, 2, 0 };
        // Collections.sort(arr);
        Arrays.sort(arr);
        Arrays.sort(arrPro, (a, b) -> {
            return a - b;
        });

        System.out.println("arr: " + Arrays.toString(arr));

        List<Integer> lis = new ArrayList<>(Arrays.asList(1, 6, 4, 0, 2, 999, 777));
        Collections.sort(lis, Collections.reverseOrder());
        // lis.sort((a, b) -> b - a);
        // lis.sort(null);
        System.out.println("lis: " + lis);
    }

    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int x : nums) {
            hmap.put(x, hmap.getOrDefault(x, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hmap.entrySet());
        int[] res = new int[nums.length];
        Collections.sort(list, new CustomComparator());
        int resPointer = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                res[resPointer++] = entry.getKey();
            }
        }
        return res;
    }

    public static int[] frequencySort2(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        Integer[] numsObject = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsObject[i] = nums[i];
        }

        // custom comparator
        Arrays.sort(numsObject, (a, b) -> {
            if (freq.get(a).equals(freq.get(b))) {
                return b - a;
            }
            return freq.get(a) - freq.get(b);
        });

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = numsObject[i];
        }
        return res;

    }

}
