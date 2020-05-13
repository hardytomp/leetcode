package leetCode;

/*
 * 
 * You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. 
 * Find this single element that appears only once.
 */

public class SingleElementInSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int coordnates [] = {1,1,2,2,3,4,4,5,5};
		int coordnates [] = {1,1,2,2,4,4,5,5,6,6,7,7};
		System.out.println(coordnates[singleNonDuplicate(coordnates)]);
	}
	
    public static int singleNonDuplicate(int[] nums) {
        return find(0,nums.length-1,nums);
    }
    
    public static int find(int start,int end,int[] nums) {
    	System.out.println("start "+start+" end "+end);
    	if( start < 0 || end > nums.length-1 )
    		return -1;
    	int mid = (start+end)/2;
    	if((mid == 0  && nums[mid] != nums[mid+1]) || 
    			(mid == (nums.length-1) && nums[mid] != nums[mid-1])) {
    		return mid;
    	} 
    	
    	if(mid == start && mid == end)
    		return -1;
    	
    	
    	if((nums[mid] != nums[mid+1]) &&  (nums[mid] != nums[mid-1]) ) {
    		return mid;
    	}
    	
    	int left = find(start,mid,nums);
    	
    	if(left != -1) 
    		return left;
    	
    	int right = find(mid+1,end,nums);
    	return right;
    }

}
