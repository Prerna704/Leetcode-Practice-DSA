class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pref = 1;
        int suff =1;
        int[] res = new int[nums.length];
         for(int i =0; i <nums.length; i++){
            res[i] = pref;
            pref *= nums[i];

        }

        for(int i = nums.length - 1; i>=0; i--){
           res[i] *= suff;
           suff *= nums[i];
        }

       
        return res;
    }
}