class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ans=0;
        //int max=0;
        int max=map.get(nums[0]);
        for(int i:nums)
        {
            if(!set.contains(i))
            {
                set.add(i);
              
                if(map.get(i)>=max)
                {
                    ans+=map.get(i);
                }
            }
        }
        return ans;
    }
}