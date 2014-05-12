public class Main {

	private static final int PRIMES_TO_COUNT = 1000;
	
	private static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		
		boolean stillPrime = true;
		int div = 2;
		while (stillPrime && (div < (n / 2))) {
			if (n % div == 0) {
				stillPrime = false;
			}
			div++;
		}
		return stillPrime;
	}
	
	public static void main(String[] args) {
		int currentNumber = 2;
		int primesFound = 1;
		int sum = 0;
		
		while (primesFound <= PRIMES_TO_COUNT) {
			if (isPrime(currentNumber)) {
				sum += currentNumber;
				primesFound++;				
			}
			currentNumber++;
		}
		System.out.println(sum);
	}
}
