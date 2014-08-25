import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void printArray(Object[] arr, String separator) {
		for (int i = 0; i < arr.length; i++) {
			if (i != 0) {
				System.out.print(" ");
			}
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public static String[] InterruptedBubbleSort(String[] arr, int rounds) {
		String[] current = new String[arr.length];
		for (int i = 0;i < arr.length; i++) {
			current[i] = arr[i];
		}
		
		String temp;
		int currRound = 0;
		while (currRound < rounds) {
			for (int j = 0; j < current.length - 1; j++) {
				if (Integer.parseInt(current[j]) > Integer.parseInt(current[j + 1])) {
					temp = current[j];
					current[j] = current[j + 1];
					current[j + 1] = temp;
				}
			}
			currRound++;
		}
		return current;
	}
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			double round;
			while (sc.hasNextLine()) 
			{
				String[] line = sc.nextLine().split("\\|");
				String[] orig = line[0].split("\\ ");
				round = Double.parseDouble(line[1].trim());
				if (round > orig.length) {
					round = orig.length;
				}
				String[] sorted = InterruptedBubbleSort(orig, (int) round);
				printArray(sorted, " ");
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}