package JavaOOPSConcepts;

public class Car {

	int model;
	int wheel;
	
	public static void main(String[] args) {

		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model = 2000;
		a.wheel = 4;
		
		b.model = 2005;
		b.wheel = 4;
		
		c.model = 2018;
		c.wheel = 4;
		
		System.out.println(b.model);
		System.out.println(c.wheel);
		System.out.println("*************************************************************************");
		
		//Assign the all value like a= b, b= c, c=a
		
		
		a=b;
		b=c;
		c=a;
		
		a.model = 10;
		b.model = 20;
		
		System.out.println(a.model);
		c.model = 40;
		System.out.println(a.model);
		System.out.println(b.model);
				
		
	}

}
