package LeetCode.Heaps.LC347;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    /*
     * Sort keys by freq
     */
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));

        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    /*
     * Max Heap Approach - slightly better compared to prev sorting approach
     */
    public int[] topKFrequentMaxHeap(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p2.freq - p1.freq);
        map.forEach((key, val) -> {
            pq.add(new Pair(key, val));
        });

        for (int i = 0; i < k; i++) {
            res[i] = pq.poll().num;
        }

        return res;
    }

    class Pair {
        int num;
        int freq;

        Pair(int a, int b) {
            this.num = a;
            this.freq = b;
        }
    }

    /*
     * 😎 Optimal - Bucket Sort
     */
    public int[] topKFrequentBucketSort(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        List<Integer>[] bucket = new List[nums.length + 1];

        map.forEach((key, freq) -> {
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        });
        int pointer = 0;
        for (int i = bucket.length - 1; i >= 0 && pointer < k; i--) {
            if (bucket[i] != null) {
                for (int x : bucket[i]) {
                    if (pointer < k) {
                        res[pointer++] = x;
                    }
                }
            }
        }

        return res;
    }

}
