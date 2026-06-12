class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int fsum = 0;
        int maxf = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            if (nums[i] > maxf) {
                maxf = nums[i];
            }
        }
        //int ind = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(maxf);
        int l = 0;
        int r = k;

        for (int i = k; i < n; i++) {
            int max = -1;
            if (l < n && r < n) {
                for (int j = l; j < r; j++) {
                    max = Math.max(max, nums[j]);
                }
                list.add(max);
                l++;
                r++;

            }

        }
        int[]res=new int[list.size()];
        int ind=0;

        for(int i:list)
        {
            res[ind]=i;
            ind++;
        }
        return res;

    }
}