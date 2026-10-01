class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String token = tokens[i];
            if(!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")){
                int n=Integer.valueOf(token);
                st.push(n);
            }
            else{
                int num1=st.pop();
                int num2=st.pop();
                switch (token) {
                    case "+":
                        st.push(num2 + num1);
                        break;
                    case "-":
                        st.push(num2 - num1);
                        break;
                    case "*":
                        st.push(num2 * num1);
                        break;
                    case "/":
                        st.push(num2 / num1);
                        break;
                }
            }
        }
        return st.peek();
    }
}