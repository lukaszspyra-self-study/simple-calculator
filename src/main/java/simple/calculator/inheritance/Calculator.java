package simple.calculator.inheritance;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This application will simulate simple calculator, asking user to type 2
 * integers and choose type of mathematical calculation.
 */
public class Calculator {

	private int calType;
	private MathCalculations mathCalculations;
	private static Scanner input = new Scanner(System.in);

	public static int loadNumberFromUser(Scanner userInput) {
		return userInput.nextInt();
	}

	private void chooseCalculation() {
		System.out.println("Choose calculation type:");
		System.out.println("Type number [1] to ADD");
		System.out.println("Type number [2] to SUBTRACT");
		System.out.println("Type number [3] to MULTIPLY");
		System.out.println("Type number [4] to DIVIDE");
		calType = loadNumberFromUser(input);
		switch (calType) {
		case 1:
			mathCalculations = new Add();
			break;
		case 2:
			mathCalculations = new Subtract();
			break;
		case 3:
			mathCalculations = new Multiply();
			break;
		case 4:
			mathCalculations = new Divide();
			break;
		default:
			throw new InputMismatchException("Wrong Input");
		}

	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println("This calculator will perform simple calculations on 2 integers.");
		System.out.println("Type first integer number: ");
		int a = loadNumberFromUser(input);
		System.out.println("Type second integer number: ");
		int b = loadNumberFromUser(input);
		calculator.chooseCalculation();
		System.out.println("Result of calculation: " + calculator.mathCalculations.calculateInt(a, b));

	}

}
