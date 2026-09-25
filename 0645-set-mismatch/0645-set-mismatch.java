class Solution {
    public int[] findErrorNums(int[] nums) {
        int d = -1;
        int m = -1;
        int n = nums.length;
        int[] res = new int[2];

        for(int i = 1; i <= n; i++){
            int cnt = 0;

            for(int j = 0; j < n; j++){
                if(nums[j] == i){
                    cnt++;
                }
            }
            if(cnt == 2){
                d= i;
            }
            else if(cnt == 0){
                m = i;
            }

        }
        res[0] = d;
        res[1] = m;
        return res;
    }
}