class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count=0;
        int res[]=new int[nums.length];
        int ri=0;
       for(int i=0;i<nums.length;i++)
       {
        count=0;
        
        for(int j=0;j<nums.length;j++)
        {
            if(nums[i]>nums[j])
            {               
                 count++;
            }  
           
        }
        {res[ri]=count;
                 ri++;}
        
       }
       
       return res;    
    }

}