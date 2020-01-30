/*
 * Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
public class TwoSum {
	
	    public int[] twoSum(int[] nums, int target) {
	        for(int ind=0;ind<nums.length;ind++){
	            for(int ind2=ind+1;ind2<nums.length;ind2++){
	                if(nums[ind]+nums[ind2]==target){
	                    return new int[]{ind,ind2};
	                }
	            }
	        }
	        return new int[2];
	    }
	
}
