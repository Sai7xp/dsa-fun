package LeetCode.Heaps.RelativeRanks;

import java.util.PriorityQueue;

class ScoreIndex {
    int score;
    int index;

    ScoreIndex(int score, int index) {
        this.score = score;
        this.index = index;
    }
}

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        int len = score.length;
        PriorityQueue<ScoreIndex> heap = new PriorityQueue<>((p1, p2) -> p2.score - p1.score);
        for (int i = 0; i < len; i++) {
            heap.add(new ScoreIndex(score[i], i));
        }
        String[] rank = new String[len];
        while (!heap.isEmpty()) {
            int position = len - heap.size() + 1;
            var top = heap.poll();
            int index = top.index;
            if (position == 1) {
                rank[index] = "Gold Medal";
            } else if (position == 2) {
                rank[index] = "Silver Medal";
            } else if (position == 3) {
                rank[index] = "Bronze Medal";
            } else {
                rank[index] = String.valueOf(position);
            }
        }

        return rank;
    }
}
