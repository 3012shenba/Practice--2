class Solution {
    public int strStr(String h, String n) {
      for(int i=0;i<h.length();i++)
      {
        for(int j=i+1;j<=h.length();j++)
        {
            String sub=h.substring(i,j);
            if(ans(sub,n))
            {
                return i;   
            }
        }
      }
      return -1;
    }
    public static boolean ans(String h,String n)
    {
        if(h.equals(n))
        {
            return true;
        }
        return false;
    }
}