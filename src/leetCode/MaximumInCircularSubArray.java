package leetCode;

//nicely explained in https://www.youtube.com/watch?v=jP-N5v93snQ


public class MaximumInCircularSubArray {

	public static void main(String[] args) {
		int A[] = {1,-2,3,-2};
		System.out.println(maxSubarraySumCircular(A));
		//System.out.println(maxSubarraySumCircular(A));
		int B[] = {5,-3,5};
		System.out.println(maxSubarraySumCircular(B));
		int C[] = {-5,-3,-1};
		System.out.println(maxSubarraySumCircular(C));
		int D[] = {1,-6,-7,4};
		System.out.println(maxSubarraySumCircular(D));
	}
	
    public static int maxSubarraySumCircular(int[] A) {
    	if(A== null || A.length == 0) 
    		return 0;
    	int maxTillHere = A[0];
    	int maxTotal = A[0];
    	int minTillHere = A[0];
    	int minTotal = A[0];
    	int sum = A[0];
    	
    	for(int i=1;i<A.length;i++) {
    		if(maxTillHere +A[i] >A[i]) {
    			maxTillHere+=A[i];
    		} else {
    			maxTillHere=A[i];
    		}
    		
    		maxTotal = Math.max(maxTotal, maxTillHere);
    		if(minTillHere +A[i] < A[i]) {
    			minTillHere+=A[i];
    		} else {
    			minTillHere=A[i];
    		}
    		 
    		minTotal = Math.min(minTotal, minTillHere);
    		
    		sum += A[i];
    		
    	}
    	
    	if(sum == minTotal)
    		return maxTotal;
    	return Math.max(sum-minTotal, maxTotal);
    	
    }
	
	
	
}
