/*Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place and use only constant extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.

1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1 */

class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-1;
        while (i>0 && nums[i] <= nums[i-1])
            i--;
        if (i==0)
            reverse(nums,0,nums.length-1);
        else{
            int j=nums.length-1;
            while (j>=i && nums[j] <= nums[i-1])
                j--;
            int temp = nums[i-1];
            nums[i-1] = nums[j];
            nums[j] = temp;
            reverse(nums,i,nums.length-1);
        }
    }
    
    private void reverse(int[] nums, int left, int right){
        while (left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
