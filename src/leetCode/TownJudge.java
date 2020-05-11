package leetCode;

import java.util.Arrays;
import java.util.Comparator;

/*In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.

If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.
*/


public class TownJudge {

	public static void main(String[] args) {
	//	int coordnates [][] = {{-3,-2},{-1,-2},{2,-2},{-2,-2},{0,-2}};
//		int coordnates [][] = {{1,2},{2,3},{3,4},{4,5},{5,6}}; 
//		int coordnates [][] = {{1,2} ,{2,3}};
		int coordnates [][] = {{1,3},{2,3},{3,1}};
		//int coordnates [][] = {{1,3},{1,4},{2,3},{2,4},{4,3}};
		System.out.println("op "+findJudge(4,coordnates));
	}
	
	class Person {
		public int id;
		public int trustCount;
		public int myTrust ;
		
	}
	

    public static int findJudge(int N, int[][] trust) {
        int ret = -1;
        Person people[] = new Person[N+1];
        

    	TownJudge sol = new TownJudge(); 
        
    	for(int i=1;i<=N;i++) {
    		people[i] =  sol.new Person();
    		people[i].id = i;
    		people[i].myTrust = -1;
    	}
        //for ignoring
    	people[0] =  sol.new Person();
		people[0].id = 0;
		people[0].myTrust = 1;
		people[0].trustCount = 0 ;
        
    	for(int i=0;i<trust.length;i++) {
    		people[trust[i][1]].trustCount++;
    		people[trust[i][0]].myTrust = trust[i][1];
    	}
    	
    	Arrays.sort(people,(Person p1,Person p2) -> {
    							return p1.trustCount - p2.trustCount;});
    	
    	for (int i=0;i<people.length;i++) {
    		if(people[i].myTrust == -1 && (people[i].trustCount == N-1))
    			return people[i].id;
    	}
    	
        return ret;
    }
	
}
