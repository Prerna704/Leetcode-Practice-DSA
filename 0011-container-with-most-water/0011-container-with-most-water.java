class Solution {
    public int maxArea(int[] arr) {
      int l = 0; int r = arr.length -1;int maxarea = 0;

        while(l < r){
            int w = r - l;
            int h =Math.min(arr[l] , arr[r]);
            int area = w  * h;
            maxarea = Math.max(area,maxarea);

            if(arr[l] < arr[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxarea;
    }
}