class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];
            if (map.containsKey(c)) {
                res[0] = map.get(c);
                res[1] = i;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
