class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = 0;
        int min = nums[0];
        for( int j = 1; j < nums.length; j++){
                if(nums[j] < min){
                    min = nums[j];
                }
            }
        for(int i = 0; i < nums.length; i++) {
            
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] != min){        
                int instabilityScore = max - min;
                if( instabilityScore <= k) return i;
                
            }else{
                int instabilityScore = max - min;
                if( instabilityScore <= k) return i;
                if(i < nums.length - 1)min = nums[i+1];
                for( int j = i+1; j < nums.length; j++){
                    if(nums[j] < min){
                        min = nums[j];
                    }
                }
            }          
        }
        return -1;
    }
}