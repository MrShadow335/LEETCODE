class Solution {
    public int calPoints(String[] op) {
       int n = op.length;
       Stack<Integer> st = new Stack<>();
       for(int i=0; i<n; i++){
        String s = op[i];
        if(s.equals("C")) st.pop();
        else if(s.equals("D")){
            st.push(2*st.peek());
        }
        else if(s.equals("+")){
            int top = st.pop();
            int sTop = st.peek();
            int sum = top + sTop;
            st.push(top);
            st.push(sum);
        }
        else{
            st.push(Integer.parseInt(s));
        }
       }
       int result =0;
       while(st.size() > 0){
        result += st.pop();
       }
       return result;
    }
}