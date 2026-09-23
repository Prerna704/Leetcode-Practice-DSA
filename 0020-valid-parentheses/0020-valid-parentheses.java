class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();

        for (char ch : arr) {

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    char t = st.pop();

                    if (ch == ')' && t != '(' || ch == '}' && t != '{' || ch == ']' && t != '[') {
                        return false;
                    }
                }

            }
        }
        return st.isEmpty();

    }
}