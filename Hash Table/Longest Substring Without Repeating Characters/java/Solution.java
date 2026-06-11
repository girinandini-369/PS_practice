class Solution {
    public int lengthOfLongestSubstring(String s) {
       int[]freq=new int[26];
       int len=0;
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        if(freq[ch-'a']==0)
        {
            freq[ch-'a']++;
            len++;
        }
       }
       return len;
        
    }
}