import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static int doOp(char op, int num, int res) {
		switch (op) {
		case '+': 
			res = res + num;
			break;
		case '-':
			res = res - num;
			break;
		default: break;									
		}
		return res;
	}
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			while (sc.hasNextLine()) 
			{
				String[] line = sc.nextLine().split("\\s");
				int res = 0;
				int startIndex = 0;
				boolean first = true;
				char op = ' ';
				int num;
				for (int i = 0; i < line[1].length(); i++) {
					if (line[1].charAt(i) == '+' || line[1].charAt(i) == '-') {
						if (first) {
							op = line[1].charAt(i);
							res = Integer.parseInt(line[0].substring(0, i));
							startIndex = i;
							first = false;

						} else {
							num = Integer.parseInt(line[0].substring(startIndex, i));					
							res = doOp(op, num, res);
							op = line[1].charAt(i);
							startIndex = i;
						}
					} else {
						if (i == line[1].length() - 1) {
							num = Integer.parseInt(line[0].substring(startIndex));						
							res = doOp(op, num, res);
						}
					}
				}
				System.out.println(res);				
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
