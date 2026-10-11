class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            String s=arr[i];
            if(st.size()==0) st.push(Integer.parseInt(s));
            else{
                if(s.equals("C")) st.pop();
                else if(s.equals("D")) st.push(2*st.peek());
                else if(s.equals("+")){
                    int p1 = st.pop();
                    int p2 = st.peek();
                    st.push(p1);
                    st.push(p1+p2);
                }
                else st.push(Integer.parseInt(s));
            }
            
        }
        int sum =0;
            while(st.size()>0){
                sum+= st.pop();
            }
        return sum;
    }
}