package ArithmeticCalculator;
import java.util.Scanner;

public class ArithmeticCalc {

	public static void main(String[] args) {
		
		System.out.println("Arithimetic Calculator");
		
		System.out.println("Enter first number: ");
		
		Scanner num1 = new Scanner(System.in);
		int number1 = num1.nextInt();
		
		System.out.println("Enter second number: ");
		
		Scanner num2 = new Scanner(System.in);
		int number2 = num1.nextInt();
		
		
		ArithmeticCalc arithCalc = new ArithmeticCalc();
		
		int addition = arithCalc.addition(number1, number2);
		
		int subtraction = arithCalc.subtraction(number1, number2);
		
		int multiplication = arithCalc.multiplication(number1, number2);
		
		int division = arithCalc.division(number1, number2);
		
		System.out.println("Addition Result of num1 and num2 : " +(addition));
		
		System.out.println("Subtraction Result of num1 and num2 : " +(subtraction));
		
		System.out.println("Multiplication Result of num1 and num2 : " +(multiplication));
		
		System.out.println("Division Result of num1 and num2 : " +(division));
			
	}

	public int addition(int num1, int num2) {
		
		return num1 + num2;
	}

	public int subtraction(int num1, int num2) {
			
		return num1 - num2;
	}

	public int multiplication(int num1, int num2) {
			
		return num1 * num2;
	}

	public int division(int num1, int num2) {
				
		return num1 / num2;
	}

}
