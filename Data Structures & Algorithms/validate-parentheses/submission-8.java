class Solution {
    public boolean isValid(String s) {
        
        if(s.length()==0) return true;
        if(s.length()==1) return false;
        

        boolean flag=true;
        // char[] charArr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for(char ch: s.toCharArray()) {

            if(map.containsKey(ch)) {
                if(!st.isEmpty() && st.peek()==map.get(ch)){
                    st.pop();
                } else {
                    return !flag;
                }
            } else {
                st.push(ch);
            }
        }
        return st.isEmpty();

            // if(ch=='(' || ch=='[' || ch=='{') {
            //     st.push(ch);
            // } else {

            //     if(!st.isEmpty()) {
            //         if(ch==')' && st.peek()=='(') {
            //             st.pop();
            //         } else if(ch==']' && st.peek()=='[') {
            //             st.pop();
            //         } else if(ch=='}' && st.peek()=='{') {
            //             st.pop();
            //         } else {
            //             flag=false;
            //         }
            //     } else {
            //         flag=false;
            //     }
           // }
        //}

        // if(!st.isEmpty()) {
        //     flag=false;
        // }
        // return flag;

    }
}
