package com.sclu.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.两数之和<br/>
 * 
 * 给定一个整数数组 nums 和一个目标值 target，<br/>
 * 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。<br/>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。<br/>
 * 
 * <b>examples:</b><br/>
 * 	给定 nums = [2, 7, 11, 15], target = 9<br/>
 *	因为 nums[0] + nums[1] = 2 + 7 = 9<br/>
 *  所以返回 [0, 1]<br/>
 * 
 * @author sclu
 *
 * @date 2020年5月15日
 */
public class Q_001_Two_Sum 
{
	public static void main(String[] args)
	{
		// 测试
		Solution solution = new Solution();
		int arr1[] = new int[] {2, 7, 11, 15};
		
		System.out.println("[2, 7, 11, 15], target = 9 , return [0, 1]  ===>  " + Arrays.toString(solution.twoSum(arr1, 9)));
	}
}

class Solution 
{
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
           if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i)
           {
               return new int[]{map.get(target - nums[i]), i};
           }
           map.put(nums[i], i);
        }
        return null;
    }
}


