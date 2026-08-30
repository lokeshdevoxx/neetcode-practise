class Solution {
    public int search(int[] nums, int target) {
        
        int l=0; int r=nums.length-1;
        int index=-1;

        while(l<=r) {
            int m= (l+ ((r-l)/2));
            if(nums[m]==target) {
                index= m;
                break;
            }

            if(nums[m]>=nums[l]) { //left half is sorted
                
                //now search within sorted section
                if(target>=nums[l] && target<nums[m]) {
                    r=m-1;
                } else {
                    l=m+1;
                }


            } else {
                
                if(target>nums[m] && target<=nums[r]) {
                    l=m+1;
                } else{
                    r=m-1;
                }
            }
        }
        return index;
    }
}
