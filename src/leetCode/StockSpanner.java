package leetCode;

import java.util.Stack;

public class StockSpanner {
	
	class Share {
		int price;
		int day;
		Share(int price,int day){
			this.price = price;
			this.day = day;
		}
	}
	int currentDay = 0;
	Stack<Share> span;

	public static void main(String[] args) {
		StockSpanner test = new StockSpanner();
		System.out.println(test.next(100));
		System.out.println(test.next(80));
		System.out.println(test.next(60));
		System.out.println(test.next(70));
		System.out.println(test.next(60));
		System.out.println(test.next(75));
		System.out.println(test.next(85));
		System.out.println(test.next(100));
		System.out.println(test.next(105));
		System.out.println(test.next(80));
		
	}
	
    public StockSpanner() {
        span = new Stack<>();
    }
    
    public int next(int price) {
    	int lRet =1;

		while(!span.isEmpty() && span.peek().price <= price) {
			span.pop();
		}
		if(!span.isEmpty()){
			lRet = currentDay-span.peek().day;
		} else {
			if(currentDay > 0) {
				lRet = currentDay+1;
			}
		}
		
		span.push(new Share(price, currentDay));
		currentDay++;
    		    	
    	return lRet;
    }	

}
