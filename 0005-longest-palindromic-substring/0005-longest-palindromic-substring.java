class Solution {
    public String longestPalindrome(String s) {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                String sub=s.substring(i,j);
                if(palin(sub))
                {
                    if(res.length()<sub.length())
                    {
                        res=sub;
                    }
                }
            }
        }
        return res;
    }
    public static boolean palin(String s)
    {
        boolean flag=false;
        int st=0;
        int end=s.length()-1;
        while(st<end)
        {
            if(s.charAt(st)!=s.charAt(end))
            {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}