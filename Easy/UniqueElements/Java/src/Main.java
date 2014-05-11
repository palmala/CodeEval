import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) {
				String[] numbers = sc.nextLine().split(",");
				int previous = -1;
				boolean first = true;
				for (int i = 0; i < numbers.length; i++) {
					int current = Integer.parseInt(numbers[i].trim());
					if (first) {
						previous = current;
						System.out.print(current);
						first = false;
					} else {
						if (previous != current) {
							previous = current;
							System.out.print("," + current);
						}
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
