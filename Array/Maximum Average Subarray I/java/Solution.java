class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double wsum=0;
        for(int i=0;i<k;i++)
        {
            wsum+=nums[i];
        }
        double maxsum=wsum;
        for(int j=k;j<n;j++)
        {
            wsum=wsum+nums[j]-nums[j-k];
            maxsum=Math.max(maxsum,wsum);

        }
        return maxsum/k;
        
    }
}