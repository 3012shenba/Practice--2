class Solution {
    public boolean isAnagram(String s, String t) 
    {
        s=s.replace("\\s","").toLowerCase();
        t=t.replace("\\s","").toLowerCase();
        if(s.length()!=t.length())
            return false;
        char c1[]=s.toCharArray();
        char c2[]=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}