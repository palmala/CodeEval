import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			String abc = "abcdefghijklmnopqrstuvwxyz";
			while (sc.hasNextLine()) 
			{
				HashMap<Character, Integer> occurences = new HashMap<Character, Integer>();
				String line = sc.nextLine().trim().replaceAll("\\s+", "").toLowerCase();
				for (int i = 0; i < line.length(); i++) {
					char c = line.charAt(i);
					if (abc.contains(Character.toString(c))) {
						if (occurences.containsKey(c)) {
							occurences.put(c, occurences.get(c) + 1);
						} else {
							occurences.put(c, 1);
						}
					}
				}
				
				Integer[] values = new Integer[occurences.values().size()];
				occurences.values().toArray(values);
				Arrays.sort(values);
				int maxBeauty = 0;
				int actBeauty = 26 - values.length + 1;
				for (int i = 0; i < values.length; i++) {
					maxBeauty = maxBeauty + values[i] * actBeauty;
					actBeauty = actBeauty + 1;
				}
				System.out.println(maxBeauty);
				
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
