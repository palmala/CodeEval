import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				String[] numberLists = sc.nextLine().split("\\|");
				String[] list1 = numberLists[0].trim().split("\\s");
				String[] list2 = numberLists[1].trim().split("\\s");
				String res = "";
				for (int i = 0; i < list1.length; i++) {
					res = res + Integer.toString(Integer.parseInt(list1[i]) 
							* Integer.parseInt(list2[i])) + " ";
				}
				System.out.println(res.trim());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
