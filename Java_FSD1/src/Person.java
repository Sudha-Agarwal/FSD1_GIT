
public class Person {
	//name, age, height, weight 
	// variables
	
	//syntax for creating a variable
	//type variable_name
	
	 int age = 10;//declaring/defining a variable and assigning a
	 //value
	double weight = 60.4;
	
	boolean isHuman = true;
	
	String name = "Sudha";
	
	void print(){
		System.out.print(age);		
	}
	
	public static void main(String args[]){
		System.out.println("Hello World");
		int x =10;
		int y = 10;
		
		//Arithmetic operators:
		//+, -, *, /, %, ++, --
		
		int result = x + y;
		
		
		//Assignment Operators
		int x1 = 10;
		x1 = x1+5; //output-> 15
		
		//or
		x1 += 5; //output -> 20
		
		System.out.println(x != y);
		
		System.out.println(x == 10 || y == 10);
		
		System.out.println(!false);
		
		if(x > y) {
			System.out.println("X is greater than Y");
		}		
		else if(x == y) {
			System.out.println("X is equal to Y");
		}
		else {
			System.out.println("X is not greater than Y");
		}
		
		if(x < 10) {
			System.out.println("less");
		}
		else {
			System.out.println("more");
		}
		
		//or we can write as with Ternary operators
		
		String result1 = (x<10) ? "more": "less";
		System.out.println(result1);	
		
		double d = 10; //automatically int would be casted to double
		
		int i = (int)10.0; //explicit type casting or narrowing casting
		
		System.out.println("i: " + i); //output would be 10
		
		System.out.println("Hi" + "World"); //output:Hi World
		
		float f = (float)10.0;
		
		//or		
		float f1 = 10.0F;
		
		long l = 10L;
					
	}
	
}







