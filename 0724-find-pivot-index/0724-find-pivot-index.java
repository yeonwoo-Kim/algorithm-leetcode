class Solution {
    public int pivotIndex(int[] nums) {
        int answer = -1;

        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                if (left(i - 1, nums) == right(i + 1, nums)) {
                    answer = i;
                    break;
                }
            } else {
                if(0 == right(i + 1, nums)) {
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }
    
    static int left(int end, int[] nums) {
        int result = 0;
        for (int i = 0; i <= end; i++) {
            result += nums[i];
        }
        return result;
    }

    static int right(int start, int[] nums) {
        int result =0;
        for (int i = start; i < nums.length; i++) {
            result += nums[i];
        }
        return result;
    }
}