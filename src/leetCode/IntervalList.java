package leetCode;

public class IntervalList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        
        for(int i=0;i < A.length; i++) {
            System.out.print(A[i][0]+" ");
            System.out.print(A[i][1]+" ");            
        }
        System.out.println();
        for(int i=0;i < B.length; i++) {
            System.out.print(B[i][0]+" ");
            System.out.print(B[i][1]+" ");            
        }
        
        int startA=0;
        int startB=0;
        
        int 
        
        while(startA < A.length && startB < B.length) {
        	
        	if(A[startA][1] >= B[startB][0]) {
        		
        	}
        	
        }
        
        
        return A;
        
    }	

}
