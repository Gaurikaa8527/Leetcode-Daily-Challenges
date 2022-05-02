//Leetcode 905. Sort Array By Parity

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] freshnums = new int[nums.length]; //new array to store values
        int i,j, k; //iterators
        for(i = 0, j = 0; i < nums.length; i++){
            if(nums[i]%2 == 0){   //adding even elements
                freshnums[j] = nums[i];
                j++;
            }
        }
        
        for(i = 0, k = j; i < nums.length; i++){
            if(nums[i]%2 != 0){   //second loop for odd elements
                freshnums[k] = nums[i];
                k++;
            }
        }
        
        return freshnums;
    }
}
