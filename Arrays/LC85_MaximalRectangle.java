
class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int n = matrix[0].length;
        int[] heights = new int[n];
        int maxArea = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }
        return maxArea;
    }
    private int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] previousSmaller = new int[n];
        int[] nextSmaller = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() &&
                heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                previousSmaller[i] = -1;
            } else {
                previousSmaller[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() &&
                   heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nextSmaller[i] = n;
            } else {
                nextSmaller[i] = st.peek();
            }
            st.push(i);
        }
        int maxArea = 0;
        for(int i=0;i<n;i++){
            int width=nextSmaller[i]- previousSmaller[i]-1;
            int area=heights[i]*width;
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
}