class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<= 1) return 0;
        int l = 0;
        int r = 0;
       int prod = 1;
        int cnt = 0;
        int n = nums.length;
        while(r < n){
            prod = prod * nums[r];
            while(prod >= k) prod = prod / nums[l++];
            cnt = cnt + 1 + (r - l);
            r++;
        }
        return cnt;
    }
}