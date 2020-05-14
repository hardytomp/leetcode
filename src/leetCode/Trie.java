package leetCode;

public class Trie {
	
	Node root;
	public Trie() {
		root = new Node();

	}
	
	class Node {
		Node children[] = new Node[26];
		boolean isWord[] = new boolean[26];
		public Node() {
			for(int i =0;i < 26;i++) {
				isWord[i] = false;
			}
		}
	}
	
	public void insert(String input) {
		insert(input, root);
	}
	
	public void insert(String input,Node rootNode) {
		if(input == null) 
			return; 
		if(rootNode.children[input.charAt(0)-'a'] == null) {
			Node child = new Node();	
			rootNode.children[input.charAt(0)-'a'] = child;			
		}
		if(input.length() > 1) {
			insert(input.substring(1), rootNode.children[input.charAt(0)-'a']);
		} else {
			rootNode.isWord[input.charAt(0)-'a'] = true;
		}
		
	}
	
	public boolean  search(String input,Node rootNode) {
		if(input == null) 
			return true;
		int pos = input.charAt(0) -'a';
		if(input.length() == 1) {
			if(rootNode.children[pos] != null && rootNode.isWord[pos])
				return true;
			return false;
		}
		if(rootNode.children[pos] != null ) 
			return search(input.substring(1), rootNode.children[pos]);
		return false;
	}

	public boolean  startsWith(String input,Node rootNode) {
		
		if(input == null) 
			return true;
		int pos = input.charAt(0) -'a';
		if(input.length() == 1) {
			if(rootNode.children[pos] != null )
				return true;
			return false;
		}
		if(rootNode.children[pos] != null ) {
			
			return startsWith(input.substring(1), rootNode.children[pos]);
		}
		return false;
	}	
	
	
	public static void main(String[] args) {
		Trie test = new Trie();
		test.insert("hardy");
		test.insert("zeta");
		System.out.println(test.search("h"));
		System.out.println(test.search("har"));
		System.out.println(test.search("hardy"));
		System.out.println(test.search("zeta"));
		System.out.println(test.startsWith("h"));
		System.out.println(test.startsWith("har"));
		System.out.println(test.startsWith("zet"));
	}

	public boolean search(String string) {
		return search(string,root);
	}

	public boolean startsWith(String string) {
		return startsWith(string,root);
	}	
}
