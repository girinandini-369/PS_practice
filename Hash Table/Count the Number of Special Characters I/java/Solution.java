class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character>set1=new HashSet<>();
         HashSet<Character>set2=new HashSet<>();
         for(int i=0;i<word.length();i++)
         {
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch))
            {
                set1.add(ch);
            }
            if(Character.isUpperCase(ch))
            {
                set2.add(ch);
            }
         }
         int c=0;
         for(char cr:set1)
         {
            if(set2.contains(Character.toUpperCase(cr)))
            {
                c++;
            }
         } 
                 return c;
        
       
      
        
    }
}