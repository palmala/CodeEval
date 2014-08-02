import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			int[] results = new int[15];
			int num;
			while (sc.hasNextLine()) 
			{	
				num = 0;
				String[] line = sc.nextLine().split("\\|");
				String[] whole = line[0].replaceAll("\\[|\\]", "").replaceAll(","," ").split(" ");
				String[] bricks = line[1].split(";");
				int wholex = Math.abs(Integer.parseInt(whole[0]) - Integer.parseInt(whole[2]));
				int wholey = Math.abs(Integer.parseInt(whole[1]) - Integer.parseInt(whole[3]));
				for (String brick : bricks) {
					String[] b = brick.replaceAll("\\(|\\)|\\[|\\]", "").replaceAll(",", " ").split(" ");
					int brickid = Integer.parseInt(b[0]);
					int brickx = Math.abs(Integer.parseInt(b[1]) - Integer.parseInt(b[4]));
					int bricky = Math.abs(Integer.parseInt(b[2]) - Integer.parseInt(b[5]));
					int brickz = Math.abs(Integer.parseInt(b[3]) - Integer.parseInt(b[6]));
					if ((brickx <= wholex && bricky <= wholey)
						|| (bricky <= wholex && brickx <= wholey)
						|| (brickz <= wholex && bricky <= wholey)
						|| (bricky <= wholex && brickz <= wholey)
						|| (brickz <= wholex && brickx <= wholey)
						|| (brickx <= wholex && brickz <= wholey)) {
						results[num] = brickid;
						num++;
					}
				}
				if (num == 0) {
					System.out.println("-");
				} else {
					Arrays.sort(results, 0, num);
					String delim = "";
					for (int i = 0; i <= num - 1; i++) {
						System.out.print(delim+results[i]);
						delim = ",";
					}
					System.out.println();
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}