package leetCode;

/*
 * An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).

Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.

To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.

At the end, return the modified image.

 */

public class FloodFill {

	public static void main(String[] args) {
		int coordnates [][] = {{1,1,1},{1,1,0},{1,0,1}};
		print2DArray(coordnates);
		print2DArray(floodFill(coordnates,1,1,2));

	}
	
	public static void print2DArray(int[][] image) {
		for(int i=0; i<image.length;i++ ) {
			for(int j=0; j<image[0].length ;j++) {
				System.out.print(image[i][j] +" ");
			}
			System.out.println();
		}
	}
		
	
    public static  int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		System.out.println(" for ["+sr+","+sc+"]");
		
		int currentColor = image[sr][sc];
		if(currentColor == newColor) 
			return image;
		image[sr][sc] = newColor;
		System.out.println("checking "+ (sr+1)+"," +sc +" for ["+sr+","+sc+"]");
    	if(sr+1 < image.length && currentColor == image[sr+1][sc]) {
    		image = floodFill(image,sr+1,sc,newColor);
    	}
    	System.out.println("checking "+ (sr-1)+"," +sc+" for ["+sr+","+sc+"]");
    	if(sr-1 >= 0 && currentColor == image[sr-1][sc]) {
    		image = floodFill(image,sr-1,sc,newColor);
    	}
    	System.out.println("checking "+ (sr)+"," +(sc+1)+" for ["+sr+","+sc+"]");
    	if(sc+1 < image[0].length && currentColor == image[sr][sc+1]) {
    		image = floodFill(image,sr,sc+1,newColor);
    	}
    	System.out.println("checking "+ (sr)+"," +(sc-1)+" for ["+sr+","+sc+"]");
    	if(sc-1 >= 0 && currentColor == image[sr][sc-1]) {
    		image = floodFill(image,sr,sc-1,newColor);
    	}
    	
    	return image;
    }

}
