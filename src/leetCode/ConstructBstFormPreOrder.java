package leetCode;

public class ConstructBstFormPreOrder {

	
	public static void main(String []args) {
		ConstructBstFormPreOrder test = new ConstructBstFormPreOrder();
		int pre[] = {8,2,5,1,7,10,12};
		test.preOderTraversal(test.bstFromPreorder(pre));
	}
	
	
	 // Definition for a binary tree node.
	 public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	 
	 boolean addNewNode(TreeNode root,TreeNode newNode) {
		 boolean ret =false;
		 if(root == null) 
			 return false;
		 if(root.val > newNode.val) {
			 ret =addNewNode(root.left, newNode);
		 }else  {
			 ret=addNewNode(root.right, newNode);
		 }
		 
		 if(!ret) {
			 if(root.val > newNode.val) {
				 root.left = newNode;
			 } else {
				 root.right = newNode;
			 }
			 return true;
		 }
		 return ret;
	 }
	 
	    public TreeNode bstFromPreorder(int[] preorder) {
	    	
	    	TreeNode root = new TreeNode(preorder[0],null,null);
	    	for(int i=1; i<preorder.length ; i++) {
	    		addNewNode(root, new TreeNode(preorder[i],null,null));
	    	}
	        return root;
	    }
	    
	    public void preOderTraversal(TreeNode root) {
	    	if(root == null) {
	    		System.out.print("null ");
	    		return;
	    	}
	    		
	    	System.out.print(root.val+" ");
	    	preOderTraversal(root.left);
	    	preOderTraversal(root.right);
	    }
	
}
