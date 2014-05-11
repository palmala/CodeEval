import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Math.pow;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				String number = sc.nextLine().trim();
				int numOfDigits = number.length();
				int armNum = 0;
				for (int i = 0; i < numOfDigits; i++) {
					armNum = armNum + (int) pow(Character.getNumericValue(number.charAt(i)), numOfDigits);
				}
				if (armNum == Integer.parseInt(number)) {
					System.out.println("True");
				} else {
					System.out.println("False");
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
