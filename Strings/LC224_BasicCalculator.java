import java.util.*;

class Solution {

    public static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        }
        return 0;
    }

    public static String infixToPostfix(String s) {

        Stack<Character> st = new Stack<>();
        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (Character.isDigit(ch)) {

                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    ans += s.charAt(i);
                    i++;
                }

                ans += " ";
                i--;

            } 
            else if (ch == '(') {

                st.push(ch);

            } 
            else if (ch == ')') {

                while (st.peek() != '(') {
                    ans += st.pop();
                    ans += " ";
                }

                st.pop();

            } 
            else {

                while (!st.isEmpty()
                        && st.peek() != '('
                        && precedence(st.peek()) >= precedence(ch)) {

                    ans += st.pop();
                    ans += " ";
                }

                st.push(ch);
            }
        }

        while (!st.isEmpty()) {
            ans += st.pop();
            ans += " ";
        }

        return ans;
    }

    public static int evaluatePostfix(String s) {

        Stack<Integer> st = new Stack<>();

        String[] tokens = s.trim().split("\\s+");

        for (String token : tokens) {

            if (Character.isDigit(token.charAt(0))) {

                st.push(Integer.parseInt(token));

            } 
            else {

                int b = st.pop();
                int a = st.pop();

                if (token.charAt(0) == '+') {
                    st.push(a + b);
                } 
                else {
                    st.push(a - b);
                }
            }
        }

        return st.peek();
    }

    public int calculate(String s) {

        String postfix = infixToPostfix(s);

        return evaluatePostfix(postfix);
    }
}