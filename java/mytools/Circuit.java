package mytools;

import java.util.Scanner;

public class Circuit {

	private static int num1;
	private static int num2;
	private static int[] bin1;
	private static int[] bin2;

	public Circuit() {
		num1 = 0;
		num2 = 0;
		setBins();
	}

	public Circuit(int x, int y) {
		num1 = x;
		num2 = y;
		setBins();
	}

	private static void setBins() {
		// For bin1
		String binString = Integer.toBinaryString(num1);
		bin1 = new int[binString.length()];
		for (int i = 0; i < binString.length(); i++)
			bin1[i] = Integer.parseInt(binString.substring(i, i + 1));

		// For bin2
		binString = Integer.toBinaryString(num2);
		bin2 = new int[binString.length()];
		for (int i = 0; i < binString.length(); i++)
			bin2[i] = Integer.parseInt(binString.substring(i, i + 1));
	}

	public void setNums(int x, int y) {
		num1 = x;
		num2 = y;
		setBins();
	}

	public void setNums() {
		String input1, input2;

		Scanner sc = new Scanner(System.in);

		System.out.println("First number: ");
		input1 = sc.nextLine();

		System.out.println("Second number: ");
		input2 = sc.nextLine();

		num1 = Integer.parseInt(input1);
		num2 = Integer.parseInt(input2);

		sc.close();

		setBins();
	}

	public int fullAdder() {
		int s = 0;
		int cin = 0;
		int length;
		StringBuilder sBuffer = new StringBuilder();

		if (bin1.length >= bin2.length)
			length = bin2.length - 1;
		else
			length = bin1.length - 1;

		for (int i = 0; i <= length; i++) {
			s = bin1[length - i] ^ bin2[length - i] ^ cin;
			cin = (bin1[length - i] & bin2[length - i]) | (cin & (bin1[length - i] ^ bin2[length - 1]));

			sBuffer.insert(0, s);
		}

		sBuffer.insert(0, cin);
		return Integer.parseInt(sBuffer.toString(), 2);
	}
}
