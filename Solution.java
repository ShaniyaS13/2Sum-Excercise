public class Solution {

	public int[] twoSum(int[] nums, int target) 
	{
     nums = new int[4];
     target = 0;
     nums[0] = nums[2];
     nums[1] = nums[7];
     nums[2] = nums[11];
     nums[3] = nums[15];
     
     for(int i = 0; i < nums.length; i++)
     {
    	 if(i + nums[i] == target)
    	 {
    		 return nums;
    	 }
     }
	return nums;
	}

    /* int i = 0;
	while(true) {
	if(i + nums[] == target ) 
	{break;}
	
	num++;
			
	return System.out.println(" ");
		
    }
*/
	public static void main(String[] args)
	{
		twoSum(null, 9);
		   }
}

