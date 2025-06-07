package FindMissingObservations;

import java.util.Arrays;

/*
 * Created on 05 Sep 2024
 * 
 * @author Sai Sumanth
 */

final class FindMissingObservations {
    public static void main(String[] args) {
        int[] rolls = { 3, 5, 3 };
        int[] missing = missingRolls(rolls, 5, 3);
        System.out.println("Missing Rolls are: " + Arrays.toString(missing));
    }

    public static int[] missingRolls(int[] rolls, int mean, int n) {

        int rollsSum = 0;
        for (int x : rolls) {
            rollsSum += x;
        }
        int missingRollsSum = (mean * (n + rolls.length)) - rollsSum;
        if (missingRollsSum < n || missingRollsSum > (6 * n))
            return new int[0];
        int[] res = new int[n];

        // min value of all the elements in res array will be set to eachRollMin
        // then the remaining quotient will be distributed until it becomes zero
        int eachRollMin = missingRollsSum / n;
        int extra = missingRollsSum % n;
        for (int i = 0; i < n; i++) {
            res[i] = eachRollMin;
            if (extra > 0) {
                res[i] += 1;
            }
            extra--;
        }
        return res;
    }
}