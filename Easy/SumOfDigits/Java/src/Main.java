import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) {
				String number = sc.nextLine().trim();
				int sum = 0;
				for (int i = 0; i < number.length(); i++) {
					sum = sum + Character.getNumericValue(number.charAt(i));
				}
				System.out.println(sum);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
