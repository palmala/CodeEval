import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	private static int fibonacci(int n) {
		if (n <= 0) {
			return 0;
		}
		
		int f1 = 1;
		int f2 = 1;
		
		if (n == 1 || n == 2) {
			return 1;
		}
		

		int curr = 3;
		int f = 1;		
		while (curr <= n) {
			f = f1 + f2;
			f1 = f2;
			f2 = f;
			curr++;
		}
		
		return f;
	}
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextInt()) {
				int i = sc.nextInt();
				System.out.println(fibonacci(i));
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			System.out.println("No such file!");
		}		
	}

}
