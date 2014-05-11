import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				String[] line = sc.nextLine().split(",");
				int n = Integer.parseInt(line[0]);
				int m = Integer.parseInt(line[1]);
				if (n < m) {
					System.out.println(n);
				} else {
					int t = n - m;
					while (t >= 0) {
						t = t - m;
					}
					if (t < 0) {
						t = t + m;
					}
					System.out.println(t);
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
