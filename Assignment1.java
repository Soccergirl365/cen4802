

public class Assignment1 {
	
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
