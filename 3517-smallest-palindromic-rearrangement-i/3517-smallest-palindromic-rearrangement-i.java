class Solution {
    public String smallestPalindrome(String s) {
        char[] arr = s.toCharArray();

        int mid = arr.length / 2;

        // Only the left half (excluding middle)
        char[] firstHalf = new char[mid];

        for (int i = 0; i < mid; i++) {
            firstHalf[i] = arr[i];
        }

        Arrays.sort(firstHalf);

        // Copy sorted left half back
        for (int i = 0; i < mid; i++) {
            arr[i] = firstHalf[i];
        }

        // Mirror
        for (int i = 0; i < mid; i++) {
            arr[arr.length - 1 - i] = arr[i];
        }

        return new String(arr);
    }
}