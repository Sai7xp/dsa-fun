package LeetCode.Strings.LC451;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharsByFreq {
    public static void main(String[] args) {
        // custom comparator
        System.out.println(frequencySortUsingCustomComparator("cccaaa"));

        // priority queue
        System.out.println(frequencySortUsingPriorityQueue("cccaaa"));

        // Bucket sort
        System.out.println(frequencySortUsingBucketSort("cccaaa"));
    }

    public static String frequencySortUsingCustomComparator(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        List<Character> chars = new ArrayList<>(freq.keySet());
        chars.sort((a, b) -> freq.get(b) - freq.get(a));
        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            sb.repeat(ch, freq.get(ch));
        }
        return sb.toString();
    }

    public static String frequencySortUsingPriorityQueue(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> freq.get(b) - freq.get(a));
        pq.addAll(freq.keySet());

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            sb.repeat(pq.peek(), freq.get(pq.peek()));
            pq.poll();
        }
        return sb.toString();
    }

    public static String frequencySortUsingBucketSort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        List<Character>[] bucket = new List[s.length() + 1];
        freq.forEach((key, val) -> {
            if (bucket[val] == null) {
                bucket[val] = new ArrayList<>();
            }
            bucket[val].add(key);
        });
        for (int i = bucket.length - 1; i >= 0; i--) {
            var charsAtBucket = bucket[i];
            if (charsAtBucket == null)
                continue;
            for (char ch : charsAtBucket) {
                sb.repeat(ch, i);
            }
        }
        return sb.toString();
    }

}
