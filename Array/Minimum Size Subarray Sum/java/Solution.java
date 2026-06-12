class Solution {
    public int minSubArrayLen(int t, int[] nums) {
        int l=0;
        int len=Integer.MAX_VALUE;
        int sum=0;

        for(int r=0;r<nums.length;r++)
        {
          sum+=nums[r];
          while(sum>=t)
          {
              len=Math.min(len,r-l+1);
              sum=sum-nums[l];
              l++;
          }
          
        }
        if(len==Integer.MAX_VALUE)
        {
            return 0;
        }
        return len;
        
    }
}