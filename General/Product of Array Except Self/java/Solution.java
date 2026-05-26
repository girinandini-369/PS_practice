1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n=nums.length;
4        int pre=1;
5        int post=1;
6        int[]res=new int[n];
7        for(int i=0;i<n;i++)
8        {
9            res[i]=1;
10        }
11        for(int i=0;i<n;i++)
12        {
13            res[i]*=pre;
14            pre*=nums[i];
15        }
16        for(int i=n-1;i>=0;i--)
17        {
18            res[i]*=post;
19            post*=nums[i];
20        }
21        return res;
22
23    }
24}