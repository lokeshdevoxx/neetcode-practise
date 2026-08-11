class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right = heights.length-1;
        int maxWater = 0;


        while(left<=right) {
            int currCap = Math.min(heights[left], heights[right])*(right-left);

         maxWater   = Math.max(currCap, maxWater);

         if(heights[left]<heights[right]) {
            ++left;
         } else if(heights[left]>heights[right]) {
            --right;
         } else {
            ++left;
            --right;
         }

        }

        return maxWater;
    }
}
