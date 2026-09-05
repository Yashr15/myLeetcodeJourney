class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;

        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIdx]) minIdx = i;
            if (nums[i] > nums[maxIdx]) maxIdx = i;
        }

        int lo = Math.min(minIdx, maxIdx);
        int hi = Math.max(minIdx, maxIdx);

        int cutPrefix = hi + 1;
        int cutSuffix = n - lo;
        int cutBoth   = (lo + 1) + (n - hi);

        return Math.min(cutPrefix, Math.min(cutSuffix, cutBoth));
    }
}