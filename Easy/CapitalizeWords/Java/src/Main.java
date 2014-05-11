	import java.util.Scanner;
	import java.io.File;
	import java.io.FileNotFoundException;
	
	public class Main {
		
		private static String capitalize(String word)
		{
		  return Character.toUpperCase(word.charAt(0)) + word.substring(1);
		}
		
		public static void main(String[] args) {
			try {
				Scanner sc = new Scanner(new File(args[0]));
				while (sc.hasNextLine()) 
				{
					String[] words = sc.nextLine().trim().split(" ");
					for (int i = 0; i < words.length; i++) {
						if (i != 0) {
							System.out.print(" ");
						}
						System.out.print(capitalize(words[i]));
					}
					System.out.println();
				}
				sc.close();
			} catch (FileNotFoundException e) {
				System.out.println("File not found!");
			}
		}
	}
