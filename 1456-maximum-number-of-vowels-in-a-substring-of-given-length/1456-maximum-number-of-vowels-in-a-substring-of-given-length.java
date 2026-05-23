class Solution {

    public boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }

    public int maxVowels(String s, int k) {

        int l = 0;
        int r = 0;

        int countvol = 0;
        int maxvol = 0;

        while(r < s.length()) {

            char ch = s.charAt(r);

            if(isVowel(ch))
                countvol++;

            // window size becomes k
            if(r - l + 1 == k) {

                maxvol = Math.max(maxvol, countvol);

                char ch2 = s.charAt(l);

                if(isVowel(ch2))
                    countvol--;

                l++;
            }

            r++;
        }

        return maxvol;
    }
}