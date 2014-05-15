import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				String[] numbers = sc.nextLine().split(";");
				for (String number : numbers) {
					switch (number) {
					case "one":
						System.out.print("1");
						break;
					case "two":
						System.out.print("2");
						break;
					case "three":
						System.out.print("3");
						break;
					case "four":
						System.out.print("4");
						break;
					case "five":
						System.out.print("5");
						break;
					case "six":
						System.out.print("6");
						break;
					case "seven":
						System.out.print("7");
						break;
					case "eight":
						System.out.print("8");
						break;
					case "nine":
						System.out.print("9");
						break;
					case "zero":
						System.out.print("0");
						break;						
					default:
						break;
					}
				}
				System.out.println();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
