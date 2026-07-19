class Solution {
    public boolean isValid(String s) {
         Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            // If opening bracket, push to stack
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                // If stack empty, no matching opening bracket
                if (st.isEmpty()) return false;
                char top = st.pop();
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }
        return st.isEmpty(); // All must be matched
        
    }
}