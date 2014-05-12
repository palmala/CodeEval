import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine().toLowerCase());
			}
		} catch (FileNotFoundException e) {
			System.out.println("No such file!");
		}
	}

}
