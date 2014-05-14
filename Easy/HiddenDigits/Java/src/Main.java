import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static String abc = "abcdefghij";
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				String line = sc.nextLine();
				boolean digitFound = false;
				char c;
				for (int i = 0; i < line.length(); i++) {
					c = line.charAt(i);
					if (Character.isAlphabetic(c) && Character.isLowerCase(c)
							&& abc.lastIndexOf(c) >= 0) {
						System.out.print(abc.lastIndexOf(c));
						digitFound = true;
					} else if (Character.isDigit(c)) {
						System.out.print(c);
						digitFound = true;
					}
				}
				if (!digitFound) {
					System.out.println("NONE");
				} else {
					System.out.println();
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}