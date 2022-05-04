//LeetCode 1679. Max Number of K-Sum Pairs

Approach 1:

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int ops = 0;
        while(start < end){
            int sum = nums[start] + nums[end];
            if(sum > k){
                end--;
            }else if(sum < k){
                start++;
            }else{
                //sum == k
                end--;
                start++;
                ops++;
            }
        }
        return ops;
    }
}

Approach 2:


class Solution {
    public int maxOperations(int[] nums, int k) {
        int ops = 0;    //operations
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int el: nums){
            if(map.containsKey(k-el)){  //if counter element is present in hashmap 
                int freq = map.get(k-el);   //compute frequency
                if(freq == 1){
                    map.remove(k-el);   //remove if present once
                }else{
                    map.put(k-el, freq - 1);    //else reduce frequence
                }
                ops++;  //increase operation counter
            }else{
                map.put(el, map.getOrDefault(el,0)+1);  //if not found, add el to the HM
            }
        }
        
        return ops;
    }
}
