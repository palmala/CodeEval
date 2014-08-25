import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static int getIntValue(char ch) {
		switch (ch) {
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'D': return 500;
		case 'M': return 1000;
		default: return 0;
		}
	}
	
	public static void main(String[] args) {
		try {
			int prevBase = -1;
			int sum;
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				sum = 0;
				char[] line = sc.nextLine().toCharArray();
				int i = line.length - 1;
				prevBase = -1;
				while (i > 0) {
					int currBase = getIntValue(line[i]);
					int currNum = Character.getNumericValue(line[i - 1]);
					if (prevBase == -1) {
						sum = currBase * currNum;
						prevBase = currBase;
					} else {
						if (prevBase > currBase) {
							sum = sum - currBase * currNum;
						} else {
							sum = sum + currBase * currNum;
						}
						prevBase = currBase;
					}
					i = i - 2;
				}
				System.out.println(sum);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}