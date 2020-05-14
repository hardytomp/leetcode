package leetCode;

import java.security.AllPermission;
import java.util.Stack;

public class RemoveKDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeKdigits("1432219",3));
		System.out.println(removeKdigits("10200",1));
		System.out.println(removeKdigits("10",2));
		System.out.println(removeKdigits("100",1));
		System.out.println(removeKdigits("112",1));
		System.out.println(removeKdigits("1111111",3));
		
	}
	


    public static String removeKdigits(String num, int k) {
    	
    	int size =num.length();
    	Stack<Character> stack = new Stack<>();
    	int counter =0;
    	while ( counter < size) {
			while(k >0 && !stack.isEmpty() && stack.peek()>num.charAt(counter)) {
				stack.pop();
				k--;
			}
			stack.push(num.charAt(counter));
			counter++;
		}
    	
    	while (k > 0) {
			stack.pop();
			k--;
		}
    	
    	StringBuilder sb = new StringBuilder();
    	while (!stack.isEmpty()){
			sb.append(stack.pop());
		}
    	
    	sb.reverse();
    	
    	while (sb.length() > 1 && sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}
    	String lRet = sb.toString();
    	if(lRet.isEmpty())
    		lRet = "0";
    	
    	return lRet;
    }

}
