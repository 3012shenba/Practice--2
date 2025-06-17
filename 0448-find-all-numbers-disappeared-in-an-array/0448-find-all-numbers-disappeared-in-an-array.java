class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer>set=new HashSet();
        ArrayList<Integer>result=new ArrayList();

        for(int i=0;i<nums.length;i++)
        {
            if(!(set.contains(nums[i])))
                set.add(nums[i]);
        }
        for(int j=1;j<=nums.length;j++)
        {
            if(!(set.contains(j)))
                result.add(j);
        }
        return result;
    }
}