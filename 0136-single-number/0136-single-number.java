class Solution {
    public int singleNumber(int[] nums) {
        int digit = 0;
        for(int x:nums){
            digit ^= x;
        }
        return digit;
    }
}