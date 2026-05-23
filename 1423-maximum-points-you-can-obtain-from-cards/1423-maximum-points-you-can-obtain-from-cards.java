class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int n = cardPoints.length;
        int total = 0;

        for(int x : cardPoints)
            total += x;

        // size of middle subarray
        int windowSize = n - k;

        // if taking all cards
        if(windowSize == 0)
            return total;

        int windowSum = 0;

        // first window
        for(int i = 0; i < windowSize; i++)
            windowSum += cardPoints[i];

        int minSum = windowSum;

        // sliding window
        for(int i = windowSize; i < n; i++) {
            windowSum += cardPoints[i] - cardPoints[i - windowSize];
            minSum = Math.min(minSum, windowSum);
        }

        return total - minSum;
    }
}