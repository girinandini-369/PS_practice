class Solution {
    public boolean checkSubarraySum(int[] arr, int k) {
        boolean ans=false;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            int len=1;
            for(int j=i;j<n;j++)
            {
              sum=sum+arr[j];
              // if(sum==k)
              //{
                if(len>=2)
                {
                    if(sum%k==0)
                    {
                        return true;
                    }
                }
              //}
              len++;
            }
        }
        return ans;
    }
}