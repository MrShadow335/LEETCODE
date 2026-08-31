class Solution {

    public int getMaxArea(int[] arr) {
        int n = arr.length;

        int[] nse = new int[n];
        nse[n - 1] = n;

        Stack<Integer> st = new Stack<>();
        st.push(n - 1);

        // NSE
        for (int i = n - 2; i >= 0; i--) {

            while (st.size() > 0 && arr[i] <= arr[st.peek()])
                st.pop();

            if (st.size() == 0)
                nse[i] = n;
            else
                nse[i] = st.peek();

            st.push(i);
        }

        st.clear();

        int[] pse = new int[n];
        pse[0] = -1;
        st.push(0);

        // PSE
        for (int i = 1; i < n; i++) {

            while (st.size() > 0 && arr[st.peek()] >= arr[i])
                st.pop();

            if (st.size() == 0)
                pse[i] = -1;
            else
                pse[i] = st.peek();

            st.push(i);
        }

        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int area = arr[i] * (nse[i] - pse[i] - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public int maximalRectangle(char[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int[] heights = new int[n];

        int max = 0;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                // Convert char '1' to integer 1
                // Convert char '0' to integer 0
                int val = mat[i][j] - '0';

                if (val == 1)
                    heights[j] += val;
                else
                    heights[j] = 0;
            }

            int area = getMaxArea(heights);
            max = Math.max(max, area);
        }

        return max;
    }
}