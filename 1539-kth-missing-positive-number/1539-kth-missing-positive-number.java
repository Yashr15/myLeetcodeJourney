class Solution {
    public int findKthPositive(int[] arr, int k) {

        int limit = Math.max(k + arr.length, arr[arr.length - 1]);

        int[] arr2 = new int[limit + 1];

        for (int i = 0; i < arr.length; i++) {
            arr2[arr[i]] = 1;
        }

        int point = 0;

        for (int i = 1; i < arr2.length; i++) {

            if (arr2[i] == 0) {
                point++;

                if (point == k) {
                    return i;
                }
            }
        }

        return -1;
    }
}