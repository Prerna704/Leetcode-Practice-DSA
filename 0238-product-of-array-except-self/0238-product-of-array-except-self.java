class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pref = 1;
        int suff =1;
        int[] right = new int[nums.length];
        int[] left = new int[nums.length];

        for(int i = nums.length - 1; i>=0; i--){
            right[i] = suff;
            suff *= nums[i];
        }

        for(int i =0; i <nums.length; i++){
            left[i] = pref * right[i];
            pref = pref * nums[i];

        }
        return left;
    }
}