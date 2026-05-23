class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int i =0;
        int j = 0;
        int sum = 0;
        double maxSum = Integer.MIN_VALUE;
       while(j < arr.length){
        sum =sum + arr[j];
        if(j - i + 1 == k){
            maxSum = Math.max(maxSum,sum);
            sum = sum - arr[i];
            i++;
        }
        j++;
       }
      
       return (double)(maxSum / k);
    }
}