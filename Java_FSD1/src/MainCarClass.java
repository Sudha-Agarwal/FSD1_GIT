
class Car {
	String company; //instance variables
	int speed; //instance variables
		
	//constructor overloading
	//default or no-args constructor
	Car(){
		System.out.println("contructor called");		
	}	
	//parameterized constructor
	Car(String c, int s){
		company = c;
		speed = s;
	}
	void getSpeed() {
		System.out.println("Company name:" + company + " Speed: " + speed);
	}
}


public class MainCarClass{
	
	public static void main() {
		
	}
	
	public static void main(String args[]) {
		
		Car car1 = new Car("Honda",80);//new keyword is used to create an object
		//object creation means allocating memory
		
		Car car2 = new Car();
		
		//car1.company = "Honda";//variable initialization
		//car1.speed = 80;		
		
		System.out.println(car1.company); //Output: Honda
		
		car1.getSpeed();		
		
		car2.company = "Toyota";
		car2.speed = 100;
		
		System.out.println(car2.company); //output: Toyota		
		car2.getSpeed();
		
		
		
		
	}
	
}


