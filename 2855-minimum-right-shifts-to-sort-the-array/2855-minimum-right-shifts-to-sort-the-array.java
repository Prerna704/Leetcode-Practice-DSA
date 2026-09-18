class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();
        int bc = 0;
        int bidx = -1;

        for(int  i = 0; i < n - 1;++i){
            if(nums.get(i) > nums.get(i + 1)){
                bc++;
                bidx = i;
            }
        }
        if(bc == 0){
            return 0;
        }
        if(bc == 1 && nums.get(n - 1) < nums.get(0)){
            return n - 1 - bidx;
        }
        return -1;
    }
}