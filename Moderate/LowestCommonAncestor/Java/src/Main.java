import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	static class Node {
		public Node left;
		public Node right;
		public int value;
		
		public Node(int val) {
			value = val;
		}	
	}
	
	public static Node lookupValue(int val, Node root) {
		while (true) {
			if (val < root.value && root.left != null) {
				root = root.left;
			} else if (val > root.value && root.right != null) {
				root = root.right;
			} else if (val == root.value) {
				return root;
			} else {
				return null;
			}
		}
	}
	
	public static Node LCA(Node _n1, Node _n2, Node CA){
		while(true){
			if(_n1.value < CA.value & _n2.value < CA.value) {
				CA=CA.left;
			}
			else if (_n1.value > CA.value & _n2.value > CA.value) {
				CA=CA.right;
			}
			else return CA;
		 }
	}
	
	public static void main(String[] args) {
		
		Node n1 = new Node(30);
		Node n2 = new Node(8);
		Node n3 = new Node(52);
		Node n4 = new Node(3);
		Node n5 = new Node(20);
		Node n6 = new Node(10);
		Node n7 = new Node(29);
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n5.left = n6;
		n5.right = n7;
		
		try {
			Scanner sc = new Scanner(new File(args[0]));
			int num1;
			int num2;
			Node node1;
			Node node2;
			while (sc.hasNextInt()) 
			{
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				node1 = lookupValue(num1, n1);
				node2 = lookupValue(num2, n1);
				System.out.println(LCA(node1, node2, n1).value);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}