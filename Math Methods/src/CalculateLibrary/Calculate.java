package CalculateLibrary;

public class Calculate {
	public double pi = 3.14159;

	// returns the input to the power of 2
	public static int square(int number) {
		return number*number;
	}

	// returns the input to the power of 2
	public static double square(double number) {
		return number*number;
	}

	// returns the input to the power of 3
	public static int cube(int number) {
		return number*number*number;
	}

	// returns the average of two doubles
	public static double average(double one, double two) {
		return (one + two)/2;
	}

	// returns the average of three doubles
	public static double average(double one, double two, double three) {
		return (one + two + three)/3;
	}

	// returns the equivalent degrees given radians
	public static double toDegrees(double radians) {
		final double pi = 3.14159;
		return (radians/pi)*180;
	}

	// returns the equivalent radians given degrees
	public static double toRadians(double degrees) {
		final double pi = 3.14159;
		return (degrees/180)*pi;
	}

	// returns the discriminant 
	public static double discriminant(double a, double b, double c) {
		return -b*b - 4*a*c;
	}

	// returns an equivalent improper fraction given mixed fraction
	public static String toImproperFrac(int co, int num, int den) {
		return den*co+num + "/" + den;
	}

	// returns an equivalent mixed fraction given improper fracion
	public static String toMixedNum(int num, int den) {
		return num/den + "_" + num%den + "/" + den;
	}

	// returns a tri-nomial given a fully factored single variable expression
	public static String foil(int a, int b, int c, int d, String var) {
		String firstTerm  = a * c + var + "^2 + ";
		String secondTerm = a*d + c*b + var;
		String thirdTerm  = " + " + b*d;

		return firstTerm + secondTerm + thirdTerm;
	}

	// Returns a boolean to verify if one integer is divisible by the other
	public static boolean isDivisibleBy(int a, int b) {
		return a % b == 0;
	}

	// Returns the absValue of the input
	public static double absValue(double number) {
		if (number < 0.0) return 0.0 - number;
		return number;
	}

	// Returns the larger value of two doubles
	public static double max(double a, double b) {
		return a >= b ? a : b;
	}

	// Returns the larger value of two integers
	public static int max(int a, int b) {
		return a >= b ? a : b;
	}

	// Returns the larger value of three doubles
	public static double max(double a, double b, double c) {
		if (a >= b && b >= c) return a;
		if (b >= a && a >= c) return b;
		return c;
	}

	// Returns the smaller value of two doubles
	public static double min(double a, double b) {
		return a <= b ? a : b;
	}

	// Returns the smaller value of two integers
	public static int min(int a, int b) {
		return a <= b ? a : b;
	}

	// Returns the input rounded to the nearest 2 decimal points
	public static double round2(double number) {
		return ((int) (number * 100 + 0.5))/100;
	}

	// Returns the input to the power of a positive integer
	public static double exponent(double number, double power) {
		if (power < 0)
			throw new IllegalArgumentException("Currently does not support a power less than 0.");
		if (number == 0 && power == 0)
			throw new IllegalArgumentException("Cannot compute the power of 0 to 0.");
		int iteration = 1;
		double base = number;
		while(iteration < power){
			number *= base;
			iteration++;
		}
		return number;
	}

	// Returns the factorial of the input number
	public static int factorial(int number) {
		if (number < 0)
			throw new IllegalArgumentException("Hey! You can't compute the factoral of a negative number.");
		for (int iteration = number - 1; iteration >= 1; iteration--) {
			number *= iteration;
		}

		return number;
	}

	// Returns a boolean which True means the input is a prime number
	public static boolean isPrime(int number) {
		for (int iteration = 2; iteration < number; iteration++)
			if (isDivisibleBy(number, iteration) && iteration != number)
				return false;
		return true;
	}

	// Returns the greatest common factor of the input
	public static int gcf(int a, int b) {
		int maxFactor = min(a, b);

		for (int gcf = maxFactor; gcf > 1; gcf--)
			if (a % gcf == 0 && b % gcf == 0)
				return gcf;
		return 1;
	}

	// Returns the estimated square root of an input type double
	public static double sqrt(double number) {
		double root = number / 2;
		do {
			root = 0.5*(number/root + root);
		} while (absValue(number - square(root)) > 0.025);
		return round2(root);
	}

	// Returns the 
}