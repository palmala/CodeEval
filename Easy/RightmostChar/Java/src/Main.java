import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) {
				String[] line = sc.nextLine().split(",");
				String stringToSearch = line[0];
				String charToSearch = line[1];
				System.out.println(stringToSearch.lastIndexOf(charToSearch));
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
