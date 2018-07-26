package JavaOOPSConcepts;

public class MethodConcepts {

	public static void main(String[] args) {
		
		MethodConcepts obj = new MethodConcepts();
		
		obj.direct();
		
		int av = obj.addValue();
		System.out.println(av);
		
	String val = obj.stringvalue();
	System.out.println(val);

	
	int div = obj.divvalue(50, 5);
	System.out.println(div);
	
		
	}

	public void direct() {
		System.out.println("No input and no out");
	}
	
	public int addValue() {
		System.out.println("No input but adding int output");
		
		int p = 10;
		int q = 30;
		int s = p+q;
		
		return s;
	}
	
	public String stringvalue() {
		System.out.println("No input but adding string output");
		String str = "Rithanya";
		return str;
	}
	
	public int divvalue(int x, int y) {
		System.out.println("Add input and out with div");
		int d=x/y;
		return d;
		
		
	}
	
}
