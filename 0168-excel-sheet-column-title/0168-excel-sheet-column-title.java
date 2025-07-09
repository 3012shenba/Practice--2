class Solution {
    public String convertToTitle(int col) 
    {
       String res="";
       while(col>0)
       {
        col--;
        int rem=col%26;
        char c=(char)('A'+rem);
        res=c+res;
        col/=26;
       }
       return res;
         
    }
}