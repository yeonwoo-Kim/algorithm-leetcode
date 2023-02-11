class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length <= 1) return true;
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if(idx == i && nums[i] == 0) return false;
            idx = Math.max(idx, nums[i] + i);
            if (idx >= nums.length - 1) return true;
        }
        return false;
    }
}