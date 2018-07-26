package JavaOOPSConcepts;

public class MethodOverloading {

	public static void main(String[] args) {


		MethodOverloading obj = new MethodOverloading();
	
		obj.sum();
		int m = obj.sum(20);
		System.out.println(m);
		
		obj.sum(50, 80);
		String s = obj.string("Dharsinesh");
		System.out.println(s);
		
	}
	
	public void sum() {
		System.out.println("sum value");
	}

	public int sum(int i) {
		System.out.println("sum with one argument");
		return i;
	}
	
	public void sum(int i, int j) {
		System.out.println("sum with two arguments");
	}
	
	public String string(String str) {
		System.out.println("String with single arguments");
		return str;
	}
}
