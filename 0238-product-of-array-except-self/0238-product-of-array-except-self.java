class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] right = new int[n];
        int left[] = new int[n];
        int suff = 1;
        int pref = 1;
        for(int i = n -1; i >=0; i--){
            right[i] = suff;
            suff = suff* nums[i];
        }

        for(int i = 0; i <n;i++){
            left[i] = pref * right[i];
            pref = pref * nums[i];
        }
        return left;
    }
}