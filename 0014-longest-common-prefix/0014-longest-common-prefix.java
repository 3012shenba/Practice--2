class Solution {
    public String longestCommonPrefix(String[] v) {
        String ans;
        String fir=v[0];
        
        for(int i=1;i<v.length;i++)
        {
            String cur=v[i];
            ans="";
            int len=Math.min(fir.length(),cur.length());
            for(int j=0;j<len;j++)
            {
                 if(fir.charAt(j)==cur.charAt(j))
                 {
                   ans+=fir.charAt(j);
                    
                 }
                 else
                 {
                    break;
                 }
            }
            fir=ans;
            
        }
        return fir;
    }
}