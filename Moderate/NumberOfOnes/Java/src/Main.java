import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextInt()) 
			{
				String number = Integer.toBinaryString(sc.nextInt());
				int sum = 0;
				for (int i = 0; i < number.length(); i++) {
					if (number.charAt(i) == '1') {
						sum = sum + 1;
					}
				}
				System.out.println(sum);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}