import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				String[] words = sc.nextLine().split("\\s");
				String longest = "";
				for (int i = 0; i < words.length; i++) {
					if (words[i].length() > longest.length()) {
						longest = words[i];
					}
				}
				System.out.println(longest);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}