package simple.calculator.inheritance;

public class Divide implements MathCalculations {

	/**calculateInt method for integer calculations
	 * @param two integer numbers
	 * @return integer result of dividing parameters.
	 */
	@Override
	public int calculateInt(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("You can not divide by 0.");
		}
		return a / b;
	}

}
