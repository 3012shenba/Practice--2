class Solution {
    public String longestCommonPrefix(String[] v) {
        String ans;
        String fir=v[0];//flower//flow//fl
        
        for(int i=1;i<v.length;i++)
        {
            String cur=v[i];//flow//flight
            ans="";
            int len=Math.min(fir.length(),cur.length());
            for(int j=0;j<len;j++)
            {
                 if(fir.charAt(j)==cur.charAt(j))
                 {
                   ans+=fir.charAt(j);//flow//fl
                    
                 }
                 else
                 {
                    break;
                 }
            }
            fir=ans;//fir=flow//fl
            
        }
        return fir;//fl
    }
}