import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextInt()) {
				int number = sc.nextInt();
				String numberString = Integer.toString(number);
				boolean selfDescribing = true;
				int[] digits = new int[10];
				
				for (int i = 0; i < 10; i++) {
					digits[i] = 0;
				}
				
				for (int i = 0; i < numberString.length(); i++) {
					digits[Character.getNumericValue(numberString.charAt(i))]++;
				}
				
				int i =0;
				
				while (selfDescribing && i < numberString.length()) {
					if (Character.getNumericValue(numberString.charAt(i)) != digits[i]) {
						selfDescribing = false;
					}
					i++;
				}
				
				if (selfDescribing) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
