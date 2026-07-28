class Solution {
    public String smallestPalindrome(String s) {
        char[] arr = s.toCharArray();

        int mid = arr.length / 2;
        int[] freq = new int[26];

        // Count only left half
        for (int i = 0; i < mid; i++) {
            freq[arr[i] - 'a']++;
        }

        int index = 0;

        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                arr[index] = (char) ('a' + i);
                index++;
                freq[i]--;
            }
        }

        for (int i = 0; i < mid; i++) {
            arr[arr.length - 1 - i] = arr[i];
        }

        return new String(arr);
    }
}