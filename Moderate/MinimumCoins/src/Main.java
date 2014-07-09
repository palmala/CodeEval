import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			int[] coins = new int[]{1, 3, 5};
			int currentCoin;
			while (sc.hasNextInt()) 
			{
				currentCoin = coins.length - 1;
				int target = sc.nextInt();
				int pieces = 0;
				while (target != 0) {
					if (target - coins[currentCoin] >= 0) {
						target -= coins[currentCoin];
						pieces++;
					} else {
						currentCoin--;
					}
				}
				System.out.println(pieces);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}