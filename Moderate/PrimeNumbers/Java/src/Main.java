import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	
	public static int PRIME_CALCULATED = 0;
	
	private static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		
		boolean stillPrime = true;
		int div = 2;
		while (stillPrime && (div < (n / 2) + 1)) {
			if (n % div == 0) {
				stillPrime = false;
			}
			div++;
		}
		return stillPrime;
	}
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			Vector<Integer> primes = new Vector<Integer>(200,20);
			while (sc.hasNextInt()) 
			{
				int n = sc.nextInt();
				if (n >  PRIME_CALCULATED) {
					for (int i = PRIME_CALCULATED + 1; i <= n; i++) {
						if (isPrime(i)) {
							primes.add(i);
						}
					}
					PRIME_CALCULATED = n;
				}

				for (int p : primes) {
					if (p >= n) 
					{
						break;
					}
					if (p > 2) {
						System.out.print(",");
					}
					System.out.print(p);
				}
				System.out.println();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}		
	}
}
