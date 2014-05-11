import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {	
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				String[] line = sc.nextLine().split(";");
				String[] center = line[0].replaceAll("Center: \\(", "").replaceAll(" ", "").replaceAll("\\)", "").split(",");
				double radius = Double.parseDouble(line[1].trim().replaceAll("Radius: ", "").replaceAll(" ", ""));
				String[] point = line[2].replaceAll("Point: \\(", "").replaceAll(" ", "").replaceAll("\\)", "").split(",");				
				double pointx = Double.parseDouble(point[0]);
				double pointy = Double.parseDouble(point[1]);
				double centerx = Double.parseDouble(center[0]);
				double centery = Double.parseDouble(point[1]);
				double distance = (pointx - centerx) * (pointx - centerx) 
						+ (pointy - centery) * (pointy - centery);
				System.out.println(distance <= (radius * radius));
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}