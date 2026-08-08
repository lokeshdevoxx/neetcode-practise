class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        boolean flag=false;
        for(int num: nums ){
            if(set.contains(num)){
                flag=true;
            } else {
                set.add(num);
            }
        }
        return flag;
    }
}