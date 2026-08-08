class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==1) return true;

//        s=s.replaceAll(" ", "").replaceAll("\\?", "").replaceAll("\\,", "");
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();
        System.out.println(s);

        int left=0;
        int right=s.length()-1;
        boolean flag=true;
        while(left<=right) {
            if(s.charAt(left)==s.charAt(right)) {
                ++left;
                --right;
            } else {
                flag=false;
                break;
            }
        }
        return flag;

    }
}
