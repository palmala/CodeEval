import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) {
				String[] line = sc.nextLine().split(":");
				String[] numbers = line[0].split("\\W");
				String[] toSwapArray = line[1].split(",");
				
				for (int k = 0; k < toSwapArray.length; k++) {
					String[] toSwap = toSwapArray[k].split("-");
					int swap1 = Integer.parseInt(toSwap[0].trim());
					int swap2 = Integer.parseInt(toSwap[1].trim());
					
					String temp = numbers[swap1];
					numbers[swap1] = numbers[swap2];
					numbers[swap2] = temp;					
				}
				
				for (int i = 0; i < numbers.length; i++) {
					System.out.print(numbers[i]);
					if (i == numbers.length - 1) {
						System.out.println();
					} else {
						System.out.print(" ");
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("No such file!");
		}
	}
}
