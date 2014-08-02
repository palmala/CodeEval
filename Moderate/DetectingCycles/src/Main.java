import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) {
				String[] items = sc.nextLine().split(" ");
				int[] nums = new int[items.length];
				for (int i = 0; i < nums.length; i++) {
					nums[i] = Integer.parseInt(items[i]);
				}
				int begin = 0;
				int end = 1;
				int length;
				while (begin < nums.length - 1) {
					length = 1;
					end = begin + 1;
					while (end < nums.length && nums[begin] != nums[end]) {
						end++;
					}
					if (end == nums.length) {
						begin++;
					} else {
						System.out.println("begin: " + begin + ", end: " + end);
						System.out.println("nums[begin]: " + nums[begin] + ", nums[end]: " + nums[end]);						
						while ((begin + length < end) 
								&& (end + length < nums.length) 
								&& (nums[begin+length] == nums[end + length])) {
							length++;
						}
						if (begin + length == end) {
							for (int i = begin; i < end; i++) {
								if (i > begin) {
									System.out.print(" ");
								}
								System.out.print(nums[i]);
							}
						}
						break;
					}
					begin++;
				}
				System.out.println();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
