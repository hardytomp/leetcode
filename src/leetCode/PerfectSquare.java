package leetCode;

public class PerfectSquare {
	
	public static void main(String[] args) {
		

		System.out.println(isPerfectSquare(25));
		System.out.println(isPerfectSquare(2147483647));



	}

	
	public static boolean isPerfectSquare(int num) {
		boolean lret = false;
		boolean exit = true;
		int start = num/2;
		while(exit) {
			if((long)start*start <= num) {
				break;
			}
			start/=2;
		}
		System.out.println("start "+start);
		long square = start*start;
		
		for(;square<num;start++) {
			System.out.println("square "+square);
			square = (long)start*start;
		}
		if(square == num) {
			lret = true;
		}
		return lret;
	}

}
