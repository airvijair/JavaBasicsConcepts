package JavaBasics;

public class LoopConcepts {

	public static void main(String[] args) {

		
		//While loop
		//1. print 1 to 10
		
//		int i =1;
//		while(i<=100) {
//			System.out.println("The i value is:  " + i);
//			i++; }
		
		//For loop
		
		for(int i = 0; i<=10; i++) {
			System.out.println(i);
		}
		
	System.out.println("_____________________________________________");
		
		//10...0
	
		
		for(int j=10; j>=0; j--) {
			System.out.println(j);
		}

		int k =2;
		int l  = k++;
		System.out.println("The value of K is :::"+k);
		System.out.println("The value of L is :::"+l);
	}

}
