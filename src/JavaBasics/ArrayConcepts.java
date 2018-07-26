package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {


//		int i[] = new int[4];
//		
//		i[0] = 10;
//		i[1] = 20;
//		i[2] = 30;
//		i[3] = 40;
//		
//		System.out.println(i[1]);
//		System.out.println(i.length);
//		//System.out.println(i.toString());
//		
//		for(int j =0; j<=i.length; j++) {
//			System.out.println(i[j]);
//		}
//		
		char c[] = new char[3];
		
		c[0] = 'e';
		c[1] = 't';
		c[2] = 'u';
		System.out.println(c.length);
		System.out.println(c[2]);
		
		 //object arry
		
		Object obj[] = new Object[4];
		
		obj[0] = "Vijay";
		obj[1] = 43;
		obj[2] = 23.45;
		obj[3] = "c";
		
		System.out.println(obj[1]);
		System.out.println("-----------------------------------------------");
		
		for(int m = 0; m<=obj.length; m++) {
			System.out.println(obj[m]);
		}
	}

}
