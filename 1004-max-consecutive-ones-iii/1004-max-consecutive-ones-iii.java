class Solution {
    public int longestOnes(int[] nums, int k) {
         int left = 0;
        int maxLength = -1;

        
        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                k--;
            }

            
            while (k == -1) {
                if (nums[left++] == 0) {
                    k++;
                }
            }

            int windowSize = right - left;
            if (windowSize > maxLength) {
                maxLength = windowSize;
            }
        }

        return maxLength + 1;
    }
}