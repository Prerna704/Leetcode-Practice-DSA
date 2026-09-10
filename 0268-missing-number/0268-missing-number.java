class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;// find the n natural number sum
        int sum1 = 0;
        for(int x : nums){
            sum1 += x;
        }
        return (sum - sum1);

    }
}