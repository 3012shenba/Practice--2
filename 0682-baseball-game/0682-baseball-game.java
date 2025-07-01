class Solution {
    public int calPoints(String[] operations) 
    {
        int arr[]=new int[operations.length];
        int k=0;
        for(String ops:operations)
        {
            switch(ops)
            {
                case"+":
                    arr[k]=arr[k-1]+arr[k-2];
                    k++;
                    break;
                case"D":
                    arr[k]=2*arr[k-1];
                    k++;
                    break;
                case"C":
                    k--;
                    break;
                default:
                    arr[k]=Integer.parseInt(ops);
                   
                    k++;
                    break;
            }
            
        }
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        return sum;
        
    }
}