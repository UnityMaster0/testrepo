import java.util.Scanner;

public class Circuit {

	private int input1;
	private int input2;

	public Circuit() {
		input1 = 0;
		input2 = 0;
	}
	
	public Circuit(int x, int y) {
		input1 = x;
		input2 = y ;
	}

	public static void fullAdder() {


	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("First number: ");
		String input1 = sc.nextLine();

		System.out.println("Second number: ");
		String input2 = sc.nextLine();

		sc.close();

	}
}
