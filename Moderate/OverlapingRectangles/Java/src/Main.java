import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static boolean doOverlap(int[] points) {
	    if (points[0] > points[6] || points[2] < points[4]) {
	        return false;
	    }
	 
	    if (points[1] < points[7] || points[3] > points[5]) {
	        return false;
	    }
	 
	    return true;
	}
	
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
				boolean overlap = doOverlap(nums);
				if (overlap) {
					System.out.println("True");
				} else {
					System.out.println("False");
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}