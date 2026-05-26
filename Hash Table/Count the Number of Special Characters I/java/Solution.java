class Solution {
    public int numberOfSpecialChars(String word) {
        int c=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch))
            {
                if(!map.containsKey(Character.toUpperCase(ch))&& !map.containsKey(ch))
                {
                    map.put(ch,map.getOrDefault(ch,0)+1);
                }
                else if(map.containsKey(Character.toUpperCase(ch))){
                    c++;
                }
            }
            else{
                if(!map.containsKey(Character.toLowerCase(ch)))
                {
                    map.put(ch,map.getOrDefault(ch,0)+1);
                }
                else{
                    c++;
                }
            }
        }
        return c;
       
        
    }
}