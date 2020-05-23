package leetCode;

import java.util.Arrays;
import java.util.Comparator;

public class FrequencySort {
	
	class CharNode {
		public char val;
		int count;
		boolean isInitialized;
		public CharNode(char val) {
			this.val = val;
			this.count = 0;
			isInitialized = true;
		}
		
		public CharNode() {
			isInitialized = false;
			count = 0;
		}
		
		public String toString() {
			String ret = "";
			for(int i=0; i<count;i++) {
				ret+=val;
			}
			return ret;
		}
	}
	
	CharNode count[] = new CharNode[128];
	
	public static void main(String []args) {
		System.out.println('9' - 0);
		
		FrequencySort test = new FrequencySort();
		System.out.println(test.frequencySort("treeAaaa222233/////@@@"));
	}

    public String frequencySort(String s) {
    	
    	int start = 0;
    	int isUpperCase =0;
    	int pos = 0;
    	
    	for(int i=0;i<count.length;i++) {
    		count[i] = new CharNode();
    	}
    	
    	for(int i=0;i<s.length();i++) {
    		
    		
    		
    	/*	if(s.charAt(i)-0 >= 97) {
    			start = 'a';
    			isUpperCase =26;
    		} else {
    			start = 'A';
    			isUpperCase = 0;
    		}
    		pos = s.charAt(i)-start+isUpperCase;*/
    		
    		pos = s.charAt(i)-0;
    	//	System.out.println(pos);
    		if(!count[pos].isInitialized) {
    			count[pos] = new CharNode(s.charAt(i));	
    		}
    		count[pos].count++;
    	}
    		
		Arrays.sort(count,(arg0,arg1) ->{ 
				return arg1.count-arg0.count;
		});
		
		StringBuilder build = new StringBuilder();
		
		for(CharNode nd:count) {
			if(!nd.isInitialized)
				break;
			build.append(nd.toString());
    	}
        return build.toString();
    }	
	

}
