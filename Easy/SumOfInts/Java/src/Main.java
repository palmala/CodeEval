import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			int sum = 0;
			while (sc.hasNextInt()) {
				sum += sc.nextInt();
			}
			System.out.println(sum);
		} catch (FileNotFoundException e) {
			System.out.println("No such file!");
		}
    
	}
}
