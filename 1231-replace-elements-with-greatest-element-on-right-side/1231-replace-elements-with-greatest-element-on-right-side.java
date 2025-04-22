class Solution {
    public int[] replaceElements(int[] arr) {
        int ri=0;
        int res[]=new int[arr.length];
       
       for(int i=0;i<arr.length;i++)
       {
       int max=Integer.MIN_VALUE;
        for(int j=i+1;j<arr.length;j++)
        {
            if(max<arr[j])
              { 
                max=arr[j];    
              }
        }
        res[ri++]=max;
        res[arr.length-1]=-1;
        
       } 
       return res;
    }
}