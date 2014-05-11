import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				String[] numStr = sc.nextLine().split(",");
				int[] nums = new int[numStr.length];
				for (int i = 0; i < nums.length; i++) {
					nums[i] = Integer.parseInt(numStr[i]);
				}
				int res = 0;
				for (int i = 0; i < nums.length - 3; i++) {
					for (int j = i + 1; j < nums.length - 2; j++) {
						for (int k = j + 1; k < nums.length - 1; k++) {
							for (int l = k + 1; l < nums.length; l++) {
								if (nums[i] + nums[j] + nums[k] + nums[l] == 0) {
									res = res + 1;
								}
							}
						}
					}
				}
				System.out.println(res);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}