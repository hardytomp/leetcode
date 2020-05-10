package leetCode;

public class StraightLine {

	public static void main(String[] args) {
		
		int coordnates [][] = {{-3,-2},{-1,-2},{2,-2},{-2,-2},{0,-2}};
//		int coordnates [][] = {{1,2},{2,3},{3,4},{4,5},{5,6}}; 
		System.out.println("op "+checkStraightLine(coordnates));

	}
	

    

	
    public static  boolean checkStraightLine(int[][] coordinates) {
        
   	for(int i=0;i<coordinates.length;i++){
    		
    		System.out.println("x,y "+coordinates[i][0]+" "+coordinates[i][1]);
    	}
    	
    	
        boolean ret = false;
        int x1,x2;
        int y1,y2;
        float currentSlope;
        float slope;
        if(coordinates.length <= 4) {
          return true;
        }
        x2 = coordinates[1][0];
        y2 = coordinates[1][1];

        x1 = coordinates[0][0];
        y1 = coordinates[0][1];
        


        slope = findSlope(x2,x1,y2,y1);
 
        for(int i=2;i<coordinates.length;i++){
            x2 = coordinates[i][0];
            y2 = coordinates[i][1];
            
            x1 = coordinates[i-1][0];
            y1 = coordinates[i-1][1];
            currentSlope = findSlope(x2,x1,y2,y1);
             if(currentSlope != slope) {
                ret = false;
                break;
            }
            ret = true;
        }
        return ret;
    }
    
    
    public static float findSlope(int x2,int x1,int y2,int y1) {
 
    	if(y2== y1) 
    		return 0;
    //	int numerator = x2>x1? (x2-x1) : (x1-x2);
    //	int denominator = y2>y1? (y2-y1) : (y1-y2);
        float slope =(float) (x2-x1)/(y2-y1);
        System.out.println("[x2,x1]"+x2+","+x1+" [y2,y1]"+y2+","+y1+"=="+" slope "+slope);
    	return slope; 
    }

    
}
