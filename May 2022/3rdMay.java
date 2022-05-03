//Leetcode 581. Shortest Unsorted Continuous Subarray

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int low = 0;
        int high = nums.length -1;
        
        while(low+1 < nums.length && nums[low] <= nums[low+1]){   //defining start of subarray
            low++;
        }
        
        while(high-1 >= 0 && nums[high] >= nums[high-1]){   //defining end of subarray
            high--;
        }
        
        if(low == nums.length - 1){   
            return 0;
        }
        
        int minval = Integer.MAX_VALUE;
        int maxval = Integer.MIN_VALUE;
        
        for(int i = low; i <= high; i++){
            minval = Math.min(minval, nums[i]);
            maxval = Math.max(maxval, nums[i]);
        }
        
        while(low-1 >= 0 && nums[low-1] > minval){
            low--;
        }
        while(high+1 <= nums.length-1 && nums[high+1] < maxval){
            high++;
        }
        
        return high-low+1;
    }
}
