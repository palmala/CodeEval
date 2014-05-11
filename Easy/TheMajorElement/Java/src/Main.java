import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		try {
			HashMap<String, Integer> nums = new HashMap<String, Integer>();
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
                nums.clear();
				String[] numStr = sc.nextLine().split(",");
				int major = -1;
				for (int i = 0; i < numStr.length; i++) {
					if (nums.containsKey(numStr[i])) {
						nums.put(numStr[i], (nums.get(numStr[i]) + 1));
						if (nums.get(numStr[i]) > numStr.length / 2) {
							major = i;
						}
					} else {
						nums.put(numStr[i], 1);
					}
				}
				if (major > -1) {
					System.out.println(numStr[major]);
				} else {
					System.out.println("None");
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}