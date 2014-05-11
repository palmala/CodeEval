import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {	
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				String[] line = sc.nextLine().split("\\|");
				char[] codedWriter = line[0].toCharArray();
				String encodedWriter = "";
				Scanner code = new Scanner(line[1]);
				int actCode;
				while (code.hasNextInt()) {
					actCode = code.nextInt() - 1;
					encodedWriter = encodedWriter + codedWriter[actCode];
				}
				code.close();
				System.out.println(encodedWriter);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}