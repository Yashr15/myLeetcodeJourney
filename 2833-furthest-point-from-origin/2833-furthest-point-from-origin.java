class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int right = 0;
        int left = 0;
        int underscore = 0;

        for (char s : moves.toCharArray()) {
            if (s == 'R') {
                right++;
            } else if (s == 'L') {
                left++;
            } else {
                underscore++;
            }
        }
        int furthestDistance = Math.abs(right - left) + underscore;
        return furthestDistance;
    }
}