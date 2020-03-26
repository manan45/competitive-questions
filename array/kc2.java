/*Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
complexity O(n^2) */



class Solution {
   public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i + 2 < nums.length; i++) 
    {
        int j = i + 1, k = nums.length - 1;  
        int target = -nums[i];
        while (j < k) 
        {
            if (nums[j] + nums[k] == target) 
            {
                res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                j++;
                k--;
            } 
            else if (nums[j] + nums[k] > target) 
            {
              k--;
            } 
            else 
            {
              j++;
            }
        }
    }
    return res;
   }
}
