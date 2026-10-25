
   class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        String vowels = "aeiou";
        
        for (int i = 0; i < word.length(); i++) {
            String current = "";
            for (int j = i; j < word.length(); j++) {
                char ch = word.charAt(j);
                
                
                if (vowels.indexOf(ch) == -1) break;
                
                
                if (!current.contains(String.valueOf(ch))) current += ch;
                if (current.length() == 5) count++;
            }
        }
        return count;
    }
}
