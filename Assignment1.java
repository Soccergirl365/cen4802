/* @author Isabella Mazza
	*/

public class Assignment1 {
	/** Class to calculate the nth term of the Fibonacci sequence recursively
  	*
	* @param n The position of the term being calculated
	* @return The nth term in the Fibonacci sequence
	*/
	
	public static int calculateFibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		
		return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
	}

	public static void main(String[] args) {
		int n = 10;
		int fibonacciTerm = calculateFibonacci(n);
		System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibonacciTerm);

	}

}

