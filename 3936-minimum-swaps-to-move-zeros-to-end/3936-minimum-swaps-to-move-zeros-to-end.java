class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        int zc = 0;
        int swap = 0;
        for(int i = 0; i <n; i++){
            if(nums[i] == 0){
                zc++;
            }

        }
        for(int i = n - zc; i < n; i++){
            if(nums[i] != 0)swap++;
        }
        return swap;
    }
}