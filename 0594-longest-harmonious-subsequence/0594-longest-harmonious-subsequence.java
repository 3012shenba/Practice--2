class Solution {
    public int findLHS(int[] nums) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        for (int i = 0; i < keys.size(); i++) {
            int num = keys.get(i);
            if (map.containsKey(num + 1)) {
                int len = map.get(num) + map.get(num + 1);
                if (len > max) {
                    max = len;
                }
            }
        }
        return max;
    }
}