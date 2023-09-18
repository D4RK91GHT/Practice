import java.util.HashMap;
import java.util.Map;

class Solution{
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                // return new int[] { numMap.get(complement), i};
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two numbers add up to the target.");
    }

    public static void main(String args[]){
        Solution sl = new Solution();
    
        int[] nums = {2,7,11,15};
        int target = 9;
    
        int[] result = sl.twoSum(nums, target);
        System.out.println(result[0] +", "+ result[1]);
    
    }
}

