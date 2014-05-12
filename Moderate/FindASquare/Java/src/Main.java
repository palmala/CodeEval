import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {	
	private static class Point {
		public double x;
		
		public double y;
		
		Point() {
			x = 0;
			y = 0;
		}
		
		Point(double px, double py) {
			x = px;
			y = py;
		}
		
		static boolean isSquare2(Point p1, Point p2, Point p3, Point p4)
		{
		  return p2.y - p1.y == p3.y - p4.y &&
		         p2.x - p1.x == p3.x - p4.x &&
		         p2.y - p1.y == p3.x - p2.x;
		}
	}
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				String[] pointsString = sc.nextLine().split(", ");
				Point[] points = new Point[pointsString.length];
				for (int i = 0; i < pointsString.length; i++) {
					pointsString[i] = pointsString[i].trim().replaceAll("\\(","").replaceAll("\\)", "");
					points[i] = new Point(Double.parseDouble(pointsString[i].split(",")[0])
							,Double.parseDouble(pointsString[i].split(",")[1]));
				}
				boolean square = Point.isSquare2(points[0], points[1], points[2], points[3])
						|| Point.isSquare2(points[0], points[1], points[3], points[2])
						|| Point.isSquare2(points[0], points[2], points[1], points[3]);
				System.out.println(square);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}