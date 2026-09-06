class Solution {
    public boolean canJump(int[] nums) {
        int jumpL = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i > jumpL) {
                return false;
            }

            jumpL = Math.max(jumpL, i + nums[i]);

            if (jumpL >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
}