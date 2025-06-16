class Solution {
    public int removeDuplicates(int[] nums) {
ArrayList<Integer>list=new ArrayList();
for(int i=0;i<nums.length;i++)
{
    if(!list.contains(nums[i]))
    
        list.add(nums[i]);
    }
    for(int j=0;j<list.size();j++)
    
        nums[j]=list.get(j);
    
    return list.size();
}
    
}