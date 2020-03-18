package simple.calculator.enums;

/**
 * Enum with abstract method implemented differently for each available mathematical operations.
 * 
 */
public enum CalculationTypes {
	ADD {

		@Override
		public int calculate(int a, int b) {
			// TODO Auto-generated method stub
			return a + b;
		}

	},
	SUBTRACT {
		@Override
		public int calculate(int a, int b) {
			// TODO Auto-generated method stub
			return a - b;
		}
	},
	MULTIPLY {

		@Override
		public int calculate(int a, int b) {
			// TODO Auto-generated method stub
			return a * b;
		}
	},
	DIVIDE {

		@Override
		public int calculate(int a, int b) {
			if (b == 0 ) {
				throw new ArithmeticException("Can not divide by 0.");
			}
			return a / b;
		}
	};

	public abstract int calculate(int a, int b);
}
