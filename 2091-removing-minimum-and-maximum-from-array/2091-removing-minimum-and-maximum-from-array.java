class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
            if(n<=2)return n;
            int min = 0;
            int max = 0;
        
            for(int i=1 ; i<n ; i++ )
            {
             if(nums[i]<nums[min])
            {
                min = i;
            }
                else if(nums[i]>nums[max])
            {
            max = i;
            }
            }
            min++;
            max++;
        int space = Math.abs(max-min);
        max = Math.min(max,Math.abs((n+1)-max));
        min = Math.min(min,Math.abs((n+1)-min));
        int count = Math.min(min,max);
        if(max<min)
        {
            space = Math.min(space,min);
        }
        else
        {
            space = Math.min(space,max);
        }
        count+=space;
        return count;
    }
}