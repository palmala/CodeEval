import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				String[] line = sc.nextLine().trim().split(" ");
				int m = Integer.parseInt(line[line.length - 1]);
				if (m + 1 <= line.length) {
					System.out.println(line[line.length - m - 1]);
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}