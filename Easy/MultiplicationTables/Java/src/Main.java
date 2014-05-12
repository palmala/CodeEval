public class Main {
	
	public static final int MAX = 12;
	public static final int TABLENGTH = 4;
	
	public static void main(String[] args) {
		for (int i = 1; i <= MAX; i++) {
			String line = "";
			for (int j = 1; j <= MAX; j++) {
				if (j > 1) {
					for (int k = 1; k <= TABLENGTH - Integer.toString(i * j).length(); k++) {
						line += " ";
					}
				}
				else {
					for (int k = 1; k <= Integer.toString(MAX).length() - Integer.toString(i).length(); k++) {
						line += " ";
					}					
				}
				line += Integer.toString(i * j);
			}
			System.out.println(line);
		}
	}
}
