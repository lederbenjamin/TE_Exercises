package com.techelevator.projects.view;

public class Kata {
	
	public static int[] swapEnds(int[] original) {
		int[] newArray = new int[] {};
		newArray[0] = original[original.length-2];
		for(int i = 1; i < original.length-2; i++ ) {
			newArray[i] = original[i];
		}
		newArray[original.length-1] = original[0];
		return original;
	}
	
	public static int greenTicket(int[] nums) {
		if(nums[0] == nums[1] && nums[1] == nums[2]) {
			return 20;
		}
		else if(nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
			return 10;
		}
		else
			return 0;
		
	}
	

}
