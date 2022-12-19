class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum = nums[0]+nums[1]+nums[2]; //initial sum value
        int result = nums[0]+nums[1]+nums[2]; 
        Arrays.sort(nums); // We sort it so we can init a Binary Search.
        for(int i = 0; i < nums.length-2; i++)
        {
            int left = i+1; // Pointers for our Bin search
            int right = nums.length-1;
            //Implement a Binary Search for closest sum
            while(left < right)
            {
                sum = nums[i]+nums[left]+nums[right];
                if(target < sum)
                {
                    right--;
                }
                else
                {
                    left++;
                }
                if(Math.abs(sum-target) < Math.abs(result-target))
                {
                    result = sum;
                }

            }
        }
        return result;
        
    }
}
