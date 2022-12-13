class Solution {
    public int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];
        int value = 0;

        for (int i = 0; i < nums.length; i++) {
            value += nums[i];
            answer[i] = value;
        }

        return answer;
    }
}