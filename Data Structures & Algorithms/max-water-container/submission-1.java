class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right = heights.length-1;
        int maxWater = 0;


        while(left<=right) {
            int l=heights[left];
            int r=heights[right];
            int currCap = Math.min(l, r)*(right-left);

         maxWater   = Math.max(currCap, maxWater);

         if(l<r) {
            ++left;
         } else if(l>r) {
            --right;
         } else {
            ++left;
            --right;
         }

        }

        return maxWater;
    }
}
