class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        List<Integer> fans = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            ans.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!ans.contains(i))
                fans.add(i);
        }
        return fans;
    }
}