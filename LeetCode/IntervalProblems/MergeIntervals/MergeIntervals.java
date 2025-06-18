package LeetCode.IntervalProblems.MergeIntervals;

import java.util.*;

class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 4 }, { 0, 4 } };
        merge(intervals);
    }

    public static int[][] merge(int[][] intervals) {
        // Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        // Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        Arrays.sort(intervals, new IntervalsComparator());

        List<int[]> merged = new ArrayList<>();
        int prevStart = intervals[0][0];
        int prevEnd = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= prevEnd) {
                prevEnd = Math.max(prevEnd, intervals[i][1]);
            } else {
                merged.add(new int[] { prevStart, prevEnd });
                prevStart = intervals[i][0];
                prevEnd = intervals[i][1];
            }
        }

        merged.add(new int[] { prevStart, prevEnd });

        return merged.toArray(new int[merged.size()][]);
    }
}

class IntervalsComparator implements Comparator<int[]> {

    @Override
    public int compare(int[] o1, int[] o2) {
        return o1[0] - o2[0];
    }

}