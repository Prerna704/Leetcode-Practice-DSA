class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res = new ArrayList<>();

        int winsize = p.length();

        if(s.length() < p.length())return res;

        int[] pcount = new int[26];
        int [] scount = new int[26];

        for(char ch : p.toCharArray()){
            pcount[ch - 'a']++;

        }
        
        for(int i = 0;i < s.length(); i++){
            scount[s.charAt(i) - 'a']++;

            if(i >= winsize){
                scount[s.charAt(i - winsize) - 'a']--;
            }

            if(Arrays.equals(pcount,scount)){
                res.add(i - winsize + 1);
            }
        }
        return res;
    }
}