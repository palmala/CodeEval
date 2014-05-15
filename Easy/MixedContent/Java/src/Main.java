import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static String join(String to, String what) {
		if (to.equals("")) {
			to = what;
		} else {
			to = to + "," + what;
		}
		return to;
	}
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				String[] elements = sc.nextLine().split(",");
				String numbers = "";
				String words = "";
				for (String element : elements) {
					if (Character.isAlphabetic(element.charAt(0))) {
						words = join(words, element);
					} else {
						numbers = join(numbers, element);
					}
				}
				if (!words.equals("") && !numbers.equals("")) {
					words = words + "|";
				}
				System.out.println(words + numbers);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
