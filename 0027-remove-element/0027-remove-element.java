class Solution {
    public int removeElement(int[] nums, int val) {
     ArrayList<Integer>cl=new ArrayList();
     for(int i=0;i<nums.length;i++)
     {
        if(nums[i]!=val)
        {
           cl.add(nums[i]);
        }
     }
     for(int i=0;i<cl.size();i++)
     {
       nums[i]= cl.get(i); 
       
     }
     return cl.size();     

    }
}