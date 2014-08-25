import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				char[] line = sc.nextLine().toCharArray();
				int i = 0;
				int decodeVariants = 1;
				while (i < line.length) {
					if ((Character.getNumericValue(line[i]) == 1) ||
					((i < line.length - 1) && (Character.getNumericValue(line[i + 1]) <= 6))) {
						decodeVariants++;
					}
					i = i + 1;
				}
				System.out.println(decodeVariants);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}