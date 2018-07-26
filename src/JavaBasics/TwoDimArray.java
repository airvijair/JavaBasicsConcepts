package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {


		String x[][] = new String[4][5];
		
		System.out.println(x.length);
		System.out.println(x[0].length);
		
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		
		x[1][0] = "a";
		x[1][1] = "b";
		x[1][2] = "c";
		x[1][3] = "d";
		x[1][4] = "e";
		
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";
		
		x[3][0] = "A3";
		x[3][1] = "B3";
		x[3][2] = "C3";
		x[3][3] = "D3";
		x[3][4] = "E3";
	
		
		System.out.println(x[3][0]);
		
		for(int row= 0; row <x.length; row++) {
			for(int col =0; col<x[0].length; col ++) {
				System.out.println(x[row][col]);
			}
		}
	}

}
