class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int len=nums.length;
        int right=nums.length-1;
        int index=-1;
        while(left<=right) {
            int mid = left + (right-left)/2;
             if(nums[mid]>target) {
                right = mid-1;
            } else if(nums[mid]<target) {
                    left = mid+1;
            } else {
                index = mid;
                break;
            }
        }
        return index;
    }
}
