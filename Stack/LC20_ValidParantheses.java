class Solution {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            // If opening bracket, push to stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                // If stack empty, no matching opening bracket
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }
        return stack.isEmpty(); // All must be matched
        
    }
}