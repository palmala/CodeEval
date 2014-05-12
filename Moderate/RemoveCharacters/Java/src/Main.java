import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {	
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				String[] line = sc.nextLine().split(", ");
				for (char c : line[1].toCharArray()) {
					line[0] = line[0].replaceAll(String.valueOf(c), "");
				}
				System.out.println(line[0]);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}