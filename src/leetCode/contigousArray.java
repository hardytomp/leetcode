package leetCode;

import java.util.Stack;

public class contigousArray {

	public static void main(String[] args) {
		int [] test= {0,1};
		//int [] test= {0,1};
		System.out.println(findMaxLength(test));
	}
	
    public static int findMaxLength(int[] nums) {
    	
    	Stack<Integer> incrementingStack = new Stack<>();
    	
    	incrementingStack.push(nums[0]);
    	
    	int maxArray =1;
    	
    	for(int i=1;i<nums.length;i++) {
    		
    		maxArray = maxArray > incrementingStack.size()?maxArray:incrementingStack.size();
    	
    		if(!incrementingStack.isEmpty() && nums[i] == incrementingStack.peek() ) {
    			while(!incrementingStack.isEmpty()) {
    				incrementingStack.pop();
    			}	
    		} 
			incrementingStack.push(nums[i]);
    		
    		
    	}
		maxArray = maxArray > incrementingStack.size()?maxArray:incrementingStack.size();
    	
    	return maxArray%2 == 0 ? maxArray : maxArray-1;
    	
    }

}
