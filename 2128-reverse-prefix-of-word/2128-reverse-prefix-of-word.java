class Solution {
    public String reversePrefix(String word, char ch) 
    {
        char wc[]=word.toCharArray();
        int st=0;
        int end=-1;
        
        for(int i=0;i<wc.length;i++)
        {
            if(ch==wc[i])
            {
                end=i;
                break;
            }
        }
        while(st<end)
        {
            char temp=wc[st];
            wc[st]=wc[end];
            wc[end]=temp;
            st++;
            end--;
        }
           
        String coo=new String(wc);
        return coo;
    }
}
       