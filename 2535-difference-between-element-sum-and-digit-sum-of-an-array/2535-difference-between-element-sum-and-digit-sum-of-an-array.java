class Solution {
    public int differenceOfSum(int[] arr) {
        int sum1 = 0;
        int sum2 =0;
        for(int i = 0; i < arr.length; i++ ){
        sum1 += arr[i];

        int temp = arr[i];
        while(temp > 0){
              sum2 += temp % 10;
              temp /= 10;  
        }
        }
        int diff = Math.abs(sum1 - sum2);
        return diff;

    }
}