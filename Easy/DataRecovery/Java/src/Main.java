import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) {
				String[] line = sc.nextLine().split(";");
				String[] words = line[0].split("\\s");
				String[] sentence = new String[words.length];
				String[] numbersString = line[1].split("\\s");
				int[] numbers = new int[numbersString.length];
				
				for (int i = 0; i < numbersString.length; i++) {
					numbers[i] = Integer.parseInt(numbersString[i]) - 1;
				}
				
				for (int i = 0; i < numbers.length; i++) {
					if (i < numbers.length) {
						sentence[numbers[i]] = words[i];
					} 
				}
				
				for (int j = 0; j < sentence.length; j++) {
					if (sentence[j] == null) {
						sentence[j] = words[words.length - 1];
					}
				}
				
				for (int i = 0; i < sentence.length; i++) {
					if (i > 0) {
						System.out.print(" ");
					}
					System.out.print(sentence[i]);					
				}
				System.out.println();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("No such file!");
		}
	}
}