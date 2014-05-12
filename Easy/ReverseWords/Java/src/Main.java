import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] words = line.split(" ");

				for (int i = 0; i < words.length; i++) {
					if (i > 0) {
						System.out.print(" ");
					}
					System.out.print(words[words.length - 1 - i]);
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
