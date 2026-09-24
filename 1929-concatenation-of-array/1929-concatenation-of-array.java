class Solution {
    public int[] getConcatenation(int[] nums) {
       

        int n = nums.length;
        int m = 2*n;
        int[] res = new int[m];
        for(int i = 0; i < n; i++){
            res[i] = nums[i];
            res[i + n] = nums[i];
        }
        return res;
    }
}