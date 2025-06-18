package LeetCode.IntervalProblems.InsertInterval;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    public static void main(String[] args) {
        int[][] intervals = new int[][] { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } };
        int[] newInterval = new int[] { 4, 8 };

        /*
         * Uses extra space
         */
        insertBruteForce(intervals, newInterval);

        /*
         * Optimal
         */
        insertOptimal(intervals, newInterval);
    }

    /*
     * Insert new Interval at correct place and merge overlapping intervals
     */
    public static int[][] insertBruteForce(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        for (var eachInterval : intervals) {
            if (eachInterval[0] >= newInterval[0]) {
                // put our new interval at correct place
                list.add(newInterval);
            }
            list.add(eachInterval);
        }
        if (list.size() == 0 || list.size() == intervals.length) {
            list.add(newInterval);
        }

        // now merge the overlapping intervals
        List<int[]> merged = new ArrayList<>();
        int prevStart = list.get(0)[0];
        int prevEnd = list.get(0)[1];
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i)[0] <= prevEnd) {
                prevEnd = Math.max(prevEnd, list.get(i)[1]);
            } else {
                merged.add(new int[] { prevStart, prevEnd });
                prevStart = list.get(i)[0];
                prevEnd = list.get(i)[1];
            }
        }
        merged.add(new int[] { prevStart, prevEnd });
        return merged.toArray(new int[merged.size()][]);
    }

    public static int[][] insertOptimal(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>();
        int i = 0, len = intervals.length;
        // left part
        while (i < len && intervals[i][1] < newInterval[0]) {
            merged.add(intervals[i]);
            i++;
        }

        // middle part
        while (i < len && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        merged.add(newInterval);

        // remaining right part
        while (i < len) {
            merged.add(intervals[i]);
            i++;
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
