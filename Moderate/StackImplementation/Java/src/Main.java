import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				String[] numbers = sc.nextLine().split(" ");
				Stack<Integer> stack = new Stack<Integer>();
				for (int i = 0; i < numbers.length; i++) {
					stack.push(Integer.parseInt(numbers[i]));
				}
				
				boolean first = true;
				while (!stack.isEmpty()) {
					if (first) {
						first = false;
					} else {
						System.out.print(" ");
					}
					System.out.print(stack.pop());
					if (!stack.isEmpty()) {
						stack.pop();
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