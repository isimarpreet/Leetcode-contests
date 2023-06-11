

/*
Question-
Given an integer array nums containing distinct positive integers, find and 
return any number from the array that is neither the minimum nor the maximum value in the array, or -1 if there is no such number.
Return the selected integer.

Explanation-
In this question we need to return a value which is neither minimum nor maximum. For this first we will sort the given array. Then we will
initialise 2 variable say minNum and maxNum and store first and last value of array in it. 
Then we will iterate through array using for loop. Then we will check if the if condition is satisfied then return the value otherwise if
condition is not satisfied return -1.

Code-
*/
import java.util.Arrays;
class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        
        int minNum = nums[0];
        int maxNum = nums[nums.length - 1];
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != minNum && nums[i] != maxNum) {
                return nums[i];
            }
        }
        
        return -1;
        
    }
}