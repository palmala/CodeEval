import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Vector;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				String line = sc.nextLine();
				Scanner lineScanner = new Scanner(line);
				lineScanner.useLocale(Locale.US);
				Vector<Float> v = new Vector<Float>();
				while (lineScanner.hasNextFloat()) {
					Float num = lineScanner.nextFloat();
					v.add(num);
				}
				Collections.sort(v);
				for(int i=0; i < v.size(); i++) {
					if (i > 0) {
						System.out.print(" ");
					}
					String num = String.format(Locale.US, "%.3f", v.get(i));
					System.out.print(num);
				}
				System.out.println();
				lineScanner.close();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
