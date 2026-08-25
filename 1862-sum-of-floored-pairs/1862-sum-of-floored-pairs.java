class Solution {
    public int sumOfFlooredPairs(int[] nums) {
        int MOD = 1_000_000_000 + 7;
        int n = nums.length;
        long res = 0;
        int[] count = new int[100_000+1];
        for(int num : nums){
            count[num]++;
        }
        //preSum of counts, for getting range count
        int[] preSum =  new int[100_000 + 2];
        for(int i = 1; i < preSum.length; i++){
            preSum[i] = preSum[i-1] + count[i-1];
        }
        for(int i = 0; i < count.length; i++){
            if(count[i] == 0){
                continue;
            }
            int num = i;
            for(int p = 1; p * num <= 100_000; p++){
                int max = num * (p+1)-1;
                int min = num * p;
                //how many nums in the range
                int c = preSum[Math.min(max+1, preSum.length-1)] - preSum[Math.min(min, preSum.length-1)];
                long add = (long)c * p * count[num];
                res += add;
                res %= MOD;
            }
        }
        return (int)res;
    }
}