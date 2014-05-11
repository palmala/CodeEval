import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				String[] numbers = sc.nextLine().split(" ");
				String compressedLine = "";
				int prev = -1;
				int count = 0;
				boolean firstNumber = true;
				for (int i = 0; i < numbers.length; i++) {
					if (i == 0) {
						prev = Integer.parseInt(numbers[i]);
						count = 1;
					} else {
						int currentNumber = Integer.parseInt(numbers[i]);
						if (currentNumber == prev) {
							count++;
						} else {
							if (!firstNumber) {
								compressedLine = compressedLine + " ";
							}
							compressedLine = compressedLine + count + " " + prev;
							prev = currentNumber;
							count = 1;
							firstNumber = false;
						}
					}
				}
				if (!firstNumber) {
					compressedLine = compressedLine + " ";
				}
				compressedLine = compressedLine + count + " " + prev; 
				System.out.println(compressedLine);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
