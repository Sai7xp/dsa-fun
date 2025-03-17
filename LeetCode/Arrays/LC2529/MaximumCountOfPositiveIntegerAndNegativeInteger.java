package LC2529;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public static void main(String[] args) {
        int[] nums = new int[] { -3, -2, -1, 0, 0, 1, 2 };
        // Brute force is dead easy, since the array is sorted we can apply BS

        // Check whether mid is +ve or -ve and move left pointers based on that
        System.out.println(maximumCountOptimal(nums));

        // Upper Bound and Lower Bound approach
        System.out.println(maximumCountAlsoOptimal(nums));
    }

    public static int maximumCountOptimal(int[] nums) {
        int len = nums.length;
        int left = 0, right = len - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int middle = nums[mid];
            if (middle == 0) {
                int negEnds = mid, posStarts = mid;
                while (negEnds >= 0 && nums[negEnds] == 0)
                    negEnds--;
                while (posStarts < len && nums[posStarts] == 0)
                    posStarts++;
                return Math.max(negEnds + 1, len - posStarts);
            } else if (middle > 0) {
                // middle is pos
                if (mid > 0 && nums[mid - 1] < 0) {
                    return Math.max(mid, len - mid);
                } else {
                    right = mid - 1;
                }
            } else {
                // middle is neg
                if (mid < len - 1 && nums[mid + 1] > 0) {
                    return Math.max(mid + 1, len - mid - 1);
                } else {
                    left = mid + 1;
                }

            }
        }
        return len;
    }

    /*
     * Solution 2 : finding upper and lower bound
     */
    public static int maximumCountAlsoOptimal(int[] nums) {
        int len = nums.length;
        return Math.max(len - upperBound(nums), lowerBound(nums) + 1);
    }

    public static int upperBound(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int middle = nums[mid];
            if (middle <= 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;

    }

    public static int lowerBound(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int middle = nums[mid];
            if (middle >= 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
