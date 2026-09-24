class Solution {

    public int minimumDifference(int[] nums) {

        int n = nums.length / 2;
        int total = 0;

        for (int x : nums) {
            total += x;
        }

        // Left and right subset sums
        ArrayList<Integer>[] left = new ArrayList[n + 1];
        ArrayList<Integer>[] right = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            left[i] = new ArrayList<>();
            right[i] = new ArrayList<>();
        }

        // Generate all subsets
        for (int mask = 0; mask < (1 << n); mask++) {

            int count = 0;
            int sum1 = 0;
            int sum2 = 0;

            for (int i = 0; i < n; i++) {

                if ((mask & (1 << i)) != 0) {
                    count++;
                    sum1 += nums[i];
                    sum2 += nums[i + n];
                }
            }

            left[count].add(sum1);
            right[count].add(sum2);
        }

        // Sort right side
        for (int i = 0; i <= n; i++) {
            Collections.sort(right[i]);
        }

        int ans = Integer.MAX_VALUE;

        // Try every left subset
        for (int count = 0; count <= n; count++) {

            int need = n - count;

            for (int sum1 : left[count]) {

                int target = total / 2 - sum1;

                // Find closest sum in right
                int index = Collections.binarySearch(
                    right[need], target
                );

                if (index < 0) {
                    index = -index - 1;
                }

                // Check current position
                if (index < right[need].size()) {

                    int sum = sum1 + right[need].get(index);

                    ans = Math.min(
                        ans,
                        Math.abs(total - 2 * sum)
                    );
                }

                // Check previous position
                if (index > 0) {

                    int sum = sum1 + right[need].get(index - 1);

                    ans = Math.min(
                        ans,
                        Math.abs(total - 2 * sum)
                    );
                }
            }
        }

        return ans;
    }
}