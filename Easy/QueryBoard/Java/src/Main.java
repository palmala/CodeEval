import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	private static class Board {
		
		private static final int SIZE = 256;
		private byte[][] board;		
		
		public Board() {
			board = new byte[SIZE][SIZE];
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					board[i][j] = 0;
				}
			}
		}
		
		public void SetRow(int i, byte x) {
			for (int j = 0; j < SIZE; j++) {
				board[i][j] = x;
			}
		}
		
		public void SetCol(int i, byte x) {
			for (int j = 0; j < SIZE; j++) {
				board[j][i] = x;
			}
		}
		
		public int QueryRow(int i) {
			int sum = 0;
			for (int j = 0; j < SIZE; j++) {
				sum += board[i][j];
			}
			return sum;
		}		

		public int QueryCol(int i) {
			int sum = 0;
			for (int j = 0; j < SIZE; j++) {
				sum += board[j][i];
			}
			return sum;
		}
	}	
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			Board currentBoard = new Board();
			while (sc.hasNextLine()) 
			{
				String[] command = sc.nextLine().split(" ");
				int i;
				byte x;
				switch (command[0].toLowerCase()) {
				case "setcol": 
					i = Integer.parseInt(command[1]);
					x =  Byte.parseByte(command[2]);
					currentBoard.SetCol(i, x);
					break;
				case "setrow":
					i = Integer.parseInt(command[1]);
					x =  Byte.parseByte(command[2]);
					currentBoard.SetRow(i, x);
					break;
				case "queryrow":
					i = Integer.parseInt(command[1]);
					System.out.println(currentBoard.QueryRow(i));
					break;					
				case "querycol":
					i = Integer.parseInt(command[1]);
					System.out.println(currentBoard.QueryCol(i));
					break;					
				}				
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}