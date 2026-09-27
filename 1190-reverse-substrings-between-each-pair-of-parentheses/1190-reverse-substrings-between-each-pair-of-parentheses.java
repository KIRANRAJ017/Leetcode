class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st = new Stack<>();
        for(char i:s.toCharArray()){
            if(i==')'){
                StringBuilder res = new StringBuilder();
                while(!st.peek().equals("(")){
                    res.append(st.pop());
                }
                if(st.size()>0) st.pop();
                st.push(res.reverse().toString());
            }
            else{
                st.push(Character.toString(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(st.size()>0){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}