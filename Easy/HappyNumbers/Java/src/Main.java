import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextInt()) {
				long number = sc.nextInt();
				long m = 0;
				int digit = 0;
				HashSet<Long> cycle = new HashSet<Long>();
				while(number != 1 && cycle.add(number)){
					m = 0;
					while(number > 0){
						digit = (int)(number % 10);
						m += digit*digit;
						number /= 10;
					}
					number = m;
				}
				if (number == 1) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
