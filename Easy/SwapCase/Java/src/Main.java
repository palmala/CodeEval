import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {	
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				char[] line = sc.nextLine().toCharArray();
				for (int i = 0;i < line.length; i++) {
					if (Character.isUpperCase(line[i])) {
						line[i] = Character.toLowerCase(line[i]);
					} else if (Character.isLowerCase(line[i])) {
						line[i] = Character.toUpperCase(line[i]);
					}					
				}
				System.out.println(String.valueOf(line));
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}