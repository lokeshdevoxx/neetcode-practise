class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        boolean duplicate=false;
        for(int i: nums) {
            if(!set.contains(i)) {
                set.add(i);
            } else {
                duplicate=true;
                break;
            }
        }
        return duplicate;

    }
}