class Solution {
    public int rob(int[] arr) {
       int x1 =0; 
       int x2 = 0;
       for(int i = 0; i < arr.length; i++){
        int temp = Math.max(x1, x2 + arr[i]);
        x2 = x1;
        x1 = temp;
       }
       return x1;
    }
}