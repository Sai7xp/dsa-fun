/*
 * Created on 17 Aug 2024
 *
 * @author Sai Sumanth
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursionOnArrays {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };

        /*
         * Check if array is sorted or not
         */
        boolean isSorted = isArrSorted(nums, 0);
        System.out
                .println(
                        isSorted ? "✅ Nums array is sorted. " + Arrays.toString(nums)
                                : "❌ Nums array is not sorted. " + Arrays.toString(nums));

        /*
         * Reverse the given array using recursion
         */
        System.out.println("Nums before reversing: " + Arrays.toString(nums));
        reverseArray(nums, 0, nums.length - 1);
        System.out.println("Nums afterr reversing: " + Arrays.toString(nums));

        /*
         * Linear Search using Recursion
         */
        int target = 3;
        int foundIndex = linearSearch(nums, target, nums.length - 1);
        System.out.print(target);
        System.out
                .println((foundIndex != -1 ? " found at index " + foundIndex : " Not found in the given array") + " "
                        + Arrays.toString(nums));

        int[] repeatedNums = { 1, 24, 3, 5, 4, 3, 3, 3 };
        /*
         * Find all indices of a number in array
         */
        List<Integer> list = new ArrayList<>();
        list = findAllIndices(repeatedNums, target, 0, list);
        System.out.printf("All indexes of %d in the given list %s are: %s\n", target, Arrays.toString(repeatedNums),
                list.toString());

        /*
         * 💎💎 Recursive Fn returns list without accepting any list in arguments
         */
        list = findAllIndicesWithoutPassingList(repeatedNums, target, 0);
        System.out.printf("😎 NOW WITHOUT PASSING A LIST AS ARG. \nAll indexes of %d in the given list %s are: %s\n",
                target,
                Arrays.toString(repeatedNums),
                list.toString());

        /*
         * Search in Rotated Sorted Array
         */
        int[] sorted = new int[] { 4, 5, 6, 1, 2, 3 };
        int searchRotatedArrTarget = 2;
        int searchIndex = searchInRotatedSortedArray(sorted, searchRotatedArrTarget, 0, sorted.length - 1);
        System.out.println(searchRotatedArrTarget + " found at index: " + searchIndex);
    }

    // Reverse the given array
    public static void reverseArray(int[] nums, int start, int end) {
        if (start >= end)
            return;
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        reverseArray(nums, ++start, --end);
    }

    // check if arr is sorted or not
    private static boolean isArrSorted(int[] nums, int i) {
        /*
         * Below line is Off-topic not related to sort logic
         * nums = new int[] { 3, 4, 5 };
         * here we are re-assigning a new array object to nums, and it will NOT modify
         * the original array. but nums[0] = 999 will modify the original array
         */
        if (i >= nums.length - 1)
            return true;

        if (nums[i] > nums[i + 1])
            return false;

        return isArrSorted(nums, i + 1);

        /*
         * Above single line can be written in below 3 lines as well
         */
        // if (nums[i] < nums[i + 1])
        // return isArrSorted(nums, ++i);
        // return false;
    }

    // linear search from end to start
    private static int linearSearch(int[] nums, int target, int endIndex) {
        if (endIndex == -1)
            return -1;
        if (nums[endIndex] == target)
            return endIndex;
        return linearSearch(nums, target, endIndex - 1);
    }

    /*
     * Returning List from a Recursive Function
     *
     * Even though multiple 'list' variables gets created in each recursive fn, all
     * the ref variables point to same object.
     *
     * Perform dry run to understand this example clearly
     */
    private static List<Integer> findAllIndices(int[] repeatedNums, int target, int index, List<Integer> list) {
        if (index >= repeatedNums.length)
            return list;
        if (repeatedNums[index] == target)
            list.add(index);
        return findAllIndices(repeatedNums, target, index + 1, list);
    }

    private static List<Integer> findAllIndicesWithoutPassingList(int[] repeatedNums, int target, int index) {
        List<Integer> res = new ArrayList<>();
        if (index >= repeatedNums.length)
            return res;

        if (repeatedNums[index] == target)
            res.add(index);

        res.addAll(findAllIndicesWithoutPassingList(repeatedNums, target, index + 1));
        return res;
    }

    private static int searchInRotatedSortedArray(int[] nums, int target, int start, int end) {

        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;
        int middle = nums[mid];

        if (middle == target)
            return mid;

        if (nums[start] <= middle) {
            // left part of array is sorted
            if (target >= nums[start] && target < middle) {
                return searchInRotatedSortedArray(nums, target, start, mid - 1);
            } else {
                return searchInRotatedSortedArray(nums, target, mid + 1, end);
            }
        } else {
            if (target > middle && target <= nums[end]) {
                return searchInRotatedSortedArray(nums, target, mid + 1, end);
            } else {
                return searchInRotatedSortedArray(nums, target, start, mid - 1);
            }
        }
    }
}
