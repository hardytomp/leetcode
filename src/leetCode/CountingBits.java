package leetCode;


import java.util.Map;
import java.util.TreeMap;

public class CountingBits {

	
	public static void main(String []args) {
		CountingBits test = new CountingBits();
		
		int out[] = test.countBits(100);
		for(int val:out) {
			System.out.println(val);
		}
		
	}
    public int[] countBits(int num) {
    	count.put(0, 0);
    	count.put(1, 1);
    	
    	for(int i=0;i<=num;i++) {
    		countBit(i);
    	}
    	
    	int[]ret = new int[num+1];
    	for(int i=0 ; i<=num; i++) {
    		ret[i]= count.get(i);
    	}
    	return ret;
    }
    
    Map<Integer,Integer> count = new TreeMap<>();
    
    public int countBit(int num) {
    	if(count.containsKey(num)) {
    		return count.get(num);
    	}
    	if(count.containsKey(num/2)) {
    		int ret = num % 2 + count.get(num/2);
    		count.put(num,ret);
    		return ret;
    	}
    	
    	return (num % 2 == 0) ? 1 : 1 + countBit(num/2);
    }

}
