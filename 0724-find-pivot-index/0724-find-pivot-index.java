class Solution {
    public int pivotIndex(int[] nums) {
        int tot = 0;
        for(int num : nums){
            tot += num;
        }
        int leftTot =0;
        for(int i =0; i < nums.length; i++){
            int rightTot = tot - leftTot - nums[i];
            if(rightTot == leftTot){
                return i;
            }
            leftTot += nums[i];
        }
        return -1;
    }
}