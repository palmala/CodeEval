import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.StringBuilder;

public class Main {
	
	public static void moveCar(int oldPos, int newPos, StringBuilder line) {
		if (oldPos < newPos) {
			line.setCharAt(newPos, '\\');
		} else if (oldPos > newPos) {
			line.setCharAt(newPos, '/');
		} else {
			line.setCharAt(newPos, '|');
		}	
	}
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			int carPos = -1;
			boolean first = true;
			while (sc.hasNextLine()) 
			{
				StringBuilder line = new StringBuilder(sc.nextLine());
				if (first) {
					carPos = line.lastIndexOf("C");
					if (carPos == -1) {
						carPos = line.lastIndexOf("_");
					}
					line.setCharAt(carPos, '|');
					first = false;
				} else {
					int cPos = line.lastIndexOf("C");
					int gatePos = line.lastIndexOf("_");
					if (cPos != -1) {
						moveCar(carPos, cPos, line);
						carPos = cPos;
					} else {
						moveCar(carPos, gatePos, line);
						carPos = gatePos;
					}
				}
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
