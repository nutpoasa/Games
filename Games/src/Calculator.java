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

public class Calculator {
	private double firstNum = 0;
	private double secondNum = 0;
	private double sum = 0;
	
	/* constructor method for creating Calculator objects
	* @param firstNum, first number to manipulate
	* @param secondNum, first number to manipulate
	*/
	
	public Calculator(double nextFirstNum, double nextSecondNum){
		firstNum = nextFirstNum;
		secondNum = nextSecondNum;
	}
	
	/* accessor method for getting a Calculator object's name
	* @return firstNum, first number to manipulate
	*/
	
	public double getFirstNum(){
		return firstNum;
	}
	
	/* accessor method for getting a Calculator object's name
	* @return secondNum, second number to manipulate
	*/
	
	public double getSecondNum(){
		return secondNum;
	}
	
	/* mutator method for setting a Calculator object's firstNum
	* @param firstNum, first number to manipulate
	*/
	
	public void setFirstNum(double firstNum){
		this.firstNum = firstNum;
	}
	
	/* mutator method for setting a Calculator object's secondNum
	* @param secondNum, second number to manipulate
	*/
	
	public void setSecondNum(double secondNum){
		this.secondNum = secondNum;
	}
	
	/*
	*	Method: non static addTogether
	*	Description: finds the sum of first and second number.
	*	@returns: the sum of the variables
	*/
	
	public double addTogether(){
		this.sum = this.firstNum + this.secondNum;
		return sum;
	}

	/* toString method for getting a String representation of a Calculator object
	* @return result, the two numbers, equation and answer
	*/
	public String toString(){
		String result = "\nThe first new number is: " + firstNum + 
				"\nThe second new number is: " + secondNum + 
				"\nAdding them together: " + firstNum + " + " + secondNum +
				" = " + sum; 
		return result;
	}
}
