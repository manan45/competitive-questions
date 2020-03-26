/* 
Problem 167 in leet code

Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
*/

//Time Complexity: O(n)

//Code

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length - 1;
        while(i<j){
            int sum = numbers[i]+numbers[j]; 
            if(sum==target){
                return new int[] {i+1,j+1};
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }
        }
        throw new IllegalArgumentException("There is no solution");
    }
}
