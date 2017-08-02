import java.util.*;

public class twoSum{

	public static int[] twoSum(int[] nums, int target){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

		for(int i = 0; i < nums.length; i++){
			map.put(nums[i], i);
		}

		for(int i = 0; i < nums.length; i++){
			int complement = target - nums[i];
			if(map.get(complement) != i && map.containsKey(complement))
				return new int[]{i, map.get(complement)};
		}
		throw new IllegalArgumentException("No Solution");
	}

	public static void main(String[] args){
		int[] nums = {3, 4, 3};
		int target = 6;

		int[] answer = twoSum(nums, target);
		for(int num:answer)
			System.out.print(num+" ");
	}
}
