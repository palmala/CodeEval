import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				String line = sc.nextLine();
				int period = 0;
				for (int i = 0; i < line.length(); i++) {
					if (line.replaceAll(line.substring(0, i), "").equals("")) {
						period = i;
						break;
					}
				}
				if (period == 0) {
					period = line.length();
				}
				System.out.println(period);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}