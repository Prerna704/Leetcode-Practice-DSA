class Solution {
    public int dominantIndex(int[] nums) {
        int l = -1;
        int sl = -1;
        int idx = -1;
        int n = nums.length;
        for(int i = 0; i < n; i++){

            //find largest
            if(nums[i] > l){
                sl = l;
                l = nums[i];
                idx = i;

                }// agar largets se chhota hua but second largest se bada hua to second largest ko update krenge
                else if(nums[i] > sl && nums[i] != l){
                    sl = nums[i];
                }


        }

        if(l >= 2 * sl){
            return idx;
        }

        return -1;


    }
}