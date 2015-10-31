import java.io.File;
import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) {
				String[] words = sc.nextLine().split("\\ ");
				String results = "";
				for (String word : words) {
					results += " " + word.charAt(word.length() - 1) + word.substring(1, word.length() - 1) + word.charAt(0);
				}
				System.out.println(results.trim());
			}
			sc.close();
		} catch (Exception e) {
			System.out.println("Something went wrong!\n" + e);
		}
	}

}
