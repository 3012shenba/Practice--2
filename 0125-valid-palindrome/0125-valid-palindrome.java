class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                res.append(Character.toLowerCase(c));
            }
        }
        int st=0;
        int end=res.length()-1;
        while(st<end)
        {
            if(res.charAt(st)!=res.charAt(end))
            {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}