class Solution {
    public boolean isValid(String s) {
        
        boolean flag=true;
        char[] charArr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(char ch: charArr) {
            if(ch=='(' || ch=='[' || ch=='{') {
                st.push(ch);
            } else {

                if(!st.isEmpty()) {
                    if(ch==')' && st.peek()=='(') {
                        st.pop();
                    } else if(ch==']' && st.peek()=='[') {
                        st.pop();
                    } else if(ch=='}' && st.peek()=='{') {
                        st.pop();
                    } else {
                        flag=false;
                    }
                } else {
                    flag=false;
                }
            }
        }

        if(!st.isEmpty()) {
            flag=false;
        }
        return flag;

    }
}
