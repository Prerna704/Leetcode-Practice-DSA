class Solution {
    public int maxProfit(int[] arr) {
        int buy = arr[0];
        int profit = 0;
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
                if(arr[i] < buy){
                    buy = arr[i];
                    
                }else if(arr[i] - buy > profit){
                    profit = arr[i] - buy;
                }
        }
        return profit;

    }
}