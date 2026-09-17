class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int left = 1;
    int right = 0;
    
    // Find the maximum pile size to set the upper bound for binary search
    for (int pile : piles) {
        if (pile > right) {
            right = pile;
        }
    }
    
    // Binary search for the minimum valid speed k
    while (left < right) {
        int mid = left + (right - left) / 2;
        long totalHours = 0;
        
        // Calculate total hours needed with the current eating speed (mid)
        for (int pile : piles) {
            totalHours += (pile + mid - 1) / mid; // Equivalent to Math.ceil((double)pile / mid)
        }
        
        // If Koko can finish within h hours, try a slower speed
        if (totalHours <= h) {
            right = mid;
        } else { // Otherwise, Koko needs to eat faster
            left = mid + 1;
        }
    }
    
    return left;
    }
}