class Solution {
    public boolean isPalindrome(String s) {
       int l = 0;
       int r = s.length() - 1;
       String str = s.toLowerCase();
       while(l < r){
        //for left
            while(l < r && !Character.isLetterOrDigit(str.charAt(l))){
                l++;
            }
            //for right
            while(l < r && !Character.isLetterOrDigit(str.charAt(r))){
                r--;
            }
            //check left or right cahracter
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            else{
                l++;
                r--;
            }

       }
       return true;
    }
}