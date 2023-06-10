/*Semi-Ordered Permutation
You are given a 0-indexed permutation of n integers nums.
A permutation is called semi-ordered if the first number equals 1 and the last number equals n. You can perform the below operation as many times as you want until you make nums a semi-ordered permutation:
Pick two adjacent elements in nums, then swap them.
Return the minimum number of operations to make nums a semi-ordered permutation.
A permutation is a sequence of integers from 1 to n of length n containing each number exactly once.

Explanation-
In this question we need to tell the number of operations performed to make a given permutation a semi-ordered permutation that is 0th index should be equal to 1 and nth index should be equal to the length of the given permutation.
There are many techniques to this. In this we will initialise 2 variables with the name indexOne and indexN , then we will iterate through the permutation using for loop , then we will check the if conditions , if the conditions are satisfied the values will be stored in the variables which we initialised in the starting. 
Then we will initialise a variable count which will tell us the number of operations to make permutation a semi-ordered permutation. If the condition is satisfied update the value of count and return its value, we will get min operations performed.



 Java Code-*/

class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int indexOne = 0;
        int indexN = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1)
                indexOne = i;
            if(nums[i] == nums.length)
                indexN = i;
        }
        
        int count = 0;
        if(indexOne > indexN)
            count--;
            count =count+ indexOne + (nums.length - 1 - indexN);
            return count;
    }
   
}
