class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++) {

            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            
            int left=i+1;
            int right=nums.length-1;

            int targetSum = 0-nums[i];

            while(left<right) {
                if(targetSum==(nums[left]+nums[right])) {
                    System.out.println(nums[i]+","+nums[left]+","+nums[right]);
                    res.add(List.of(nums[i],nums[left],nums[right]));
                    ++left;
                    --right;

                    while(left<right && nums[left]==nums[left-1]) {
                        ++left;
                    }

                    while(left<right && nums[right]==nums[right+1]) {
                        --right;
                    }

                } else if(targetSum>(nums[left]+nums[right])) {
                    ++left;
                } else {
                    --right;
                } 
            }

        }
        return res;
    }
}
