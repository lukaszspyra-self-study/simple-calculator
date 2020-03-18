package simple.calculator.enums;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This application will simulate simple calculator, asking user to type 2
 * integers and choose type of mathematical calculation - by using Enum class.
 */
public class CalculatorEnum {

	private static Scanner input = new Scanner(System.in);
	private static CalculationTypes calculationType;

	private static int loadNumberFromUser(Scanner userInput) {
		return userInput.nextInt();
	}

	private static void chooseCalculation() {
		System.out.println("Choose calculation type:");
		System.out.println("Type number [1] to ADD");
		System.out.println("Type number [2] to SUBTRACT");
		System.out.println("Type number [3] to MULTIPLY");
		System.out.println("Type number [4] to DIVIDE");
		int typeCalc = loadNumberFromUser(input);
		switch (typeCalc) {
		case 1:
			calculationType = CalculationTypes.ADD;
			break;
		case 2:
			calculationType = CalculationTypes.SUBTRACT;
			break;
		case 3:
			calculationType = CalculationTypes.MULTIPLY;
			break;
		case 4:
			calculationType = CalculationTypes.DIVIDE;
			break;

		default:
			throw new InputMismatchException("Wrong input, try again.");
		}

	}

	public static void main(String[] args) {
		System.out.println("This calculator will perform simple calculations on 2 integers.");
		System.out.println("Type first integer number: ");
		int a = loadNumberFromUser(input);
		System.out.println("Type second integer number: ");
		int b = loadNumberFromUser(input);
		chooseCalculation();
		System.out.println("Result of calculation: " + calculationType.calculate(a, b));

	}

}
