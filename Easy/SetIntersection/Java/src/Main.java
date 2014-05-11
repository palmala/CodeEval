import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) {
				String[] sets = sc.nextLine().split(";");
				String[] set1 = sets[0].split(",");
				String[] set2 = sets[1].split(",");
				boolean firstMatch = true;
				
				for (int i = 0; i < set1.length; i++) {
					int num = Integer.parseInt(set1[i]);
					for (int j = 0; j < set2.length; j++) {
						if (num == Integer.parseInt(set2[j])) {
							if (!firstMatch) {
								System.out.print(",");
							} else {
								firstMatch = false;
							}
							System.out.print(num);
						}
					}
				}
				System.out.println();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
