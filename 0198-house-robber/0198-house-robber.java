class Solution {
    public int rob(int[] nums) {
        int p1 =0;
        int p2 = 0;
        int n = nums.length;
        for(int i =0; i < n; i++){
            int temp = Math.max(p1,p2 + nums[i]);
            p2 = p1;
            p1 = temp;
        }
        return p1;
    }
}