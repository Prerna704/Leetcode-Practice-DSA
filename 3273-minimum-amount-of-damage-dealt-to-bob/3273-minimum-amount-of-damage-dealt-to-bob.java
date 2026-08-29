class Solution {
        public long minDamage(int power, int[] D, int[] H) {
        Integer[]A = new Integer[D.length];
        Arrays.setAll(A, i -> i);
        for (int i = 0; i < H.length; ++i)
            H[i] = (H[i] + power - 1) / power;
        Arrays.sort(A, (i, j) -> H[i] * D[j] - H[j] * D[i]);
        long res = 0, t = 0;
        for (int i : A) {
            t += H[i];
            res += D[i] * t;
        }
        return res;
    }
}