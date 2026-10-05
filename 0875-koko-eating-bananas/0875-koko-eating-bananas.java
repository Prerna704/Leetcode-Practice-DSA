class Solution {
    public int minEatingSpeed(int[] piles, int hrs) {
     int l = 1;
     int h = 0;
     for(int x: piles){
        h = Math.max(h,x);
     }
     while(l<=h){
        int mid = l + (h - l) / 2;
        long hr = 0;
        for(int x: piles){
            hr += (x + mid - 1) / mid;
        }

        if(hr <= hrs){
            h = mid - 1;
        }else{
            l = mid + 1;
        }

     }
     return l;
    }
}