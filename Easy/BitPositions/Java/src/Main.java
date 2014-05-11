import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] numbers = line.split(",");
				String bitNumber = Integer.toBinaryString(Integer.parseInt(numbers[0]));
				int bit1 = Integer.parseInt(numbers[1]);
				int bit2 = Integer.parseInt(numbers[2]);
				System.out.println(bitNumber.charAt(bitNumber.length() - bit1) == 
						bitNumber.charAt(bitNumber.length() - bit2));
				
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}

	}
}
