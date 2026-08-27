class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;// find the n natural number sum
        for(int x : nums){
            sum -= x;
        }
        return sum;

    }
}