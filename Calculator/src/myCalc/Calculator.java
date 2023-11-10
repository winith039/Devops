package myCalc;

import java.util.*;

public class Calculator {

	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter the first number: ");
	    int num1 = scanner.nextInt();
	    System.out.print("Enter the second number: ");
	    int num2 = scanner.nextInt();
	    Calculator calculator = new Calculator();
	    
	    int sumResult = calculator.add(num1, num2);
	    System.out.println("Sum: " + sumResult);
	    
	    System.out.println("Subtraction: " + calculator.subtract(num1, num2));
	    
	    System.out.println("Multiplication: " + calculator.multiply(num1, num2));
	    
	    double divideResult = calculator.divide(num1, num2);
	    
	    System.out.println("Division: " + divideResult);   
	}
	
	public int add(int num1, int num2) {
	        return num1 + num2;
	}
	public int subtract(int num1, int num2) {
        return num1 - num2;
    }
	public int multiply(int num1, int num2) {
        return num1 * num2;
   }
	public double divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN;
        }
        return (double) num1 / num2;
    }
}
