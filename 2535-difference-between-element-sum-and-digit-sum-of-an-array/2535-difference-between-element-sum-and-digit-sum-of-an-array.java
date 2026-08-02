class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSumOfNums = 0;
        int digitSumOfNums = 0;
        for(int n : nums) {
            elementSumOfNums += n ;
            while (n > 0) {
                digitSumOfNums += n % 10;
                n /= 10;
            }
        }
        int value = elementSumOfNums - digitSumOfNums;
        return Math.abs(value);
    }
}