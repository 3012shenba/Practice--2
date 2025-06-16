class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer>ans=new HashSet();
        int num=0;
        for(int i=0;i<nums.length;i++)
        {
            ans.add(nums[i]);
        }
        for(int i=0;i<=nums.length;i++)
        {
            if(!ans.contains(i))
                num=i;
        }
        return num;
    }
}