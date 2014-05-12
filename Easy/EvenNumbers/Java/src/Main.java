import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	private static int isEven(int i) {
		if (i % 2 == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextInt()) {
				System.out.println(isEven(sc.nextInt()));
			}
		} catch (FileNotFoundException e) {
			System.out.println("No such file!");
		}		
	}
}
