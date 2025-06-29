class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int pre=1;
        for(int i=0;i<nums.length;i++)
        {
           ans[i]=pre;//1
           System.out.print(ans[i]+" ");
            pre= pre*nums[i]; //
              
        }
        int suff=1;
        for(int i=nums.length-1;i>=0;i--)
        {
           ans[i]*=suff;//1
           System.out.print(ans[i]+" ");
            suff= suff*nums[i]; //
              
        }
        return ans;
            
        
    }
}