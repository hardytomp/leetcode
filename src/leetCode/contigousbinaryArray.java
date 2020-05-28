package leetCode;

import java.util.Stack;

public class contigousbinaryArray {

	public static void main(String[] args) {
		int [] test= {0,1,0,1,2,3,2,1};
		//int [] test= {0,1};
		System.out.println(findMaxLength(test));
	}
	
    public static int findMaxLength(int[] nums) {
    	
    	Stack<Integer> incrementingStack = new Stack<>();
    	Stack<Integer> decrementingStack = new Stack<>();
    	incrementingStack.push(nums[0]);
    	decrementingStack.push(nums[0]);
    	int maxArray =1;
    	
    	for(int i=1;i<nums.length;i++) {
    		
    		maxArray = maxArray > incrementingStack.size()?maxArray:incrementingStack.size();
    		maxArray = maxArray > decrementingStack.size()?maxArray:decrementingStack.size();
    		if(!incrementingStack.isEmpty() && nums[i] - incrementingStack.peek() != 1) {
    			while(!incrementingStack.isEmpty()) {
    				incrementingStack.pop();
    			}	
    		} 
			incrementingStack.push(nums[i]);
    		
    		
    		if(!decrementingStack.isEmpty()&&decrementingStack.peek()-nums[i] != 1  ) {
    			while(!decrementingStack.isEmpty()) {
    				decrementingStack.pop();
    			}    			
    		}
			decrementingStack.push(nums[i]);
    		
    		
    	}
		maxArray = maxArray > incrementingStack.size()?maxArray:incrementingStack.size();
		maxArray = maxArray > decrementingStack.size()?maxArray:decrementingStack.size();
    	
    	return maxArray;
    	
    }

}
