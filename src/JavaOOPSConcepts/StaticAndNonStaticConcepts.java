package JavaOOPSConcepts;

public class StaticAndNonStaticConcepts {
	String name = "Gomathi";
	static int age = 100;
	
	public static void main(String[] args) {
		
		sstring();
		StaticAndNonStaticConcepts.sstring();

		StaticAndNonStaticConcepts sas = new StaticAndNonStaticConcepts();
		sas.nssum();
	}
	
	public void nssum() {
		System.out.println("Non static sum");
	}
	
	public static void sstring() {
		System.out.println("Static string");
	}

}
