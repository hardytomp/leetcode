package leetCode;

import java.util.LinkedList;
import java.util.Queue;



public class KthSmallestInBst {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int ip) {
			val = ip;
			left = null;
			right = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int kthSmallest(TreeNode root, int k) {
        Queue<Integer> outputQ = new LinkedList<>();
        kthSmallest(root,k,outputQ);
        int output = 0;
        while(!outputQ.isEmpty()){
            output = outputQ.poll();
            System.out.println("removing "+output);
        }
        	
        
        return output;     
        
    }
    
    public void kthSmallest(TreeNode root,int k,Queue<Integer> op) {
        if(root == null) 
            return;
        if(op.size() == k) 
        	return;
        kthSmallest(root.left, k,op);
        if(op.size() < k) 
            op.add(root.val);	
        kthSmallest(root.right, k,op);
        
    }
    
}
