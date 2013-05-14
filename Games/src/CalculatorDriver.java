
/*
 * Program: Calculator
 * Author: Sharon Davis
 * Date: 5/6/2013
 * Description: CS161 Lab 5
 * 		This program creates an object, does some addition and subtraction with the object,
 * 		and accesses static and non-static variables and methods.
 * Inputs: None
 * Outputs: Samples of the manipulation of the Calculator object. 
 */

public class CalculatorDriver {
	
	public static Calculator subtraction = new Calculator(65.5, 89.3);		//static object variable
	
	public static void main(String[] args) {
		
		Calculator addition = new Calculator(44.5, 20.3);	//creates calculator object
		
		
		System.out.println("\nThe First Number is: " + addition.getFirstNum() + "\nThe Second Number is: " + addition.getSecondNum());	
		
		System.out.println("The Sum of these Numbers are: " + addition.addTogether());		//demonstrates the calling of a non-static object method
		
		double addNewFirstNum = 10.5;				//changes the firstNum object variable
		addition.setFirstNum(addNewFirstNum);		//sets firstNum in object class
		
		double addNewSecondNum = 20.6;				//changes the secondNum object variable
		addition.setSecondNum(addNewSecondNum);		//sets secondNum in object class
		
		addition.addTogether();						//adds new firstNum to old secondNum
		
		System.out.printf("The Sum of the New Numbers are: %.2f + %.2f = %.2f ", addition.getFirstNum(), addition.getSecondNum(),
				addition.getFirstNum() + addition.getSecondNum());			//prints and formats addition of object variables
	
		System.out.println(addition.toString());			//utilizes the toString method in object
			
		System.out.printf("The Difference of the Subtraction Object Variable Numbers are: %.2f - %.2f = %.2f", 
				subtraction.getFirstNum(), subtraction.getSecondNum(), subtractNum());				//prints info from static method

	}
	
	/*
	*	Method: Static subtractNum
	*	Description: uses static object variable, accesses object variables
	*				and subtracts them.
	*	@returns: the difference of the variables
	*/
	
	public static double subtractNum(){
	
		double diff = 0;
		
		diff = subtraction.getFirstNum() - subtraction.getSecondNum();
		return diff;
		
	}

}
