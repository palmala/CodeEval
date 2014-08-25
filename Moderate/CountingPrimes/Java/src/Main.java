import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
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
			while (sc.hasNextLine()) {
				String[] line = sc.nextLine().split(",");
				int countFrom = Integer.parseInt(line[0]);
				int countTo = Integer.parseInt(line[1]);
				int count = 0;
				for (int i = countFrom; i <= countTo; i++) {
					if (isPrime(i)) {
						count++;
					}
				}
				System.out.println(count);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("No such file!");
		}
	}
} 