class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n <= 2) return n;
        int minIndex = 0 ;
        int maxIndex = 0 ;
        

        for ( int i = 1 ; i < n ; i++) {
            if(nums[i] < nums[minIndex]) {
                minIndex = i;
            }else if( nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        int hmm = Math.max(minIndex, maxIndex);
        int han = Math.min(minIndex, maxIndex);
        int umm = n - hmm - 1;
        int wmm = n - han - 1;
        
            int nana = Math.min((hmm+1), ((han+1)+(umm+1)));
            int nanana = Math.min( nana, wmm+1);
            return nanana;

    }
}