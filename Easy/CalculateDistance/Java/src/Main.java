	import java.util.Scanner;
	import java.io.File;
	import java.io.FileNotFoundException;
	
	public class Main {
		
		public static void main(String[] args) {
			try {
				Scanner sc = new Scanner(new File(args[0]));
				while (sc.hasNextLine()) 
				{
					String[] numbers = sc.nextLine().split("\\)\\s+\\(");
					numbers[0] = numbers[0].replace('(', ' ');
					numbers[1] = numbers[1].replace(')', ' ');
					String[] point1 = numbers[0].trim().split(",");
					String[] point2 = numbers[1].trim().split(",");
					int px1 = Integer.parseInt(point1[0].trim());
					int py1 = Integer.parseInt(point1[1].trim());
					int px2 = Integer.parseInt(point2[0].trim());
					int py2 = Integer.parseInt(point2[1].trim());
					System.out.println((int) Math.sqrt((px1 - px2) * (px1 - px2) + 
							(py1 - py2) * (py1 - py2)));
				}
				sc.close();
			} catch (FileNotFoundException e) {
				System.out.println("File not found!");
			}
		}
	}
