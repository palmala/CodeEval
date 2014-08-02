import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static String getCategory(int age) {
		if (age < 0 || age > 100) {
			return "This program is for humans";
		} else if (age <= 2) {
			return "Still in Mama's arms";
		} else if (age <= 4) {
			return "Preschool Maniac";
		} else if (age <= 11) {
			return "Elementary school";
		} else if (age <= 14) {
			return "Middle school";
		} else if (age <= 18) {
			return "High school";
		} else if (age <= 22) { 
			return "College";
		} else if (age <= 65) {
			return "Working for the man";
		} else {
			return "The Golden Years";
		}
	}
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextInt()) 
			{
				System.out.println(getCategory(sc.nextInt()));
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}