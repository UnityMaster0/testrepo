package mytools;

import java.util.Scanner;

public class Circuit {

	private static int num1;
	private static int num2;
	private static int[] bin1;
	private static int[] bin2;

	/**
	 * Constructs a circuit object with num1 and num2 set to 0
	 */
	public Circuit() {
		num1 = 0;
		num2 = 0;
		setBins();
	}

	/**
	 * Constructs a circuit object with num1 and num2 set to x and y
	 * @param x Value for num1
	 * @param y Value for num2
	 */
	public Circuit(int x, int y) {
		num1 = x;
		num2 = y;
		setBins();
	}

	/**
	 * Sets bin1 and bin2 according to the current values of num1 and num2
	 */
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

	/**
	 * Sets new values of num1 and num2. Also resets bin1 and bin2 according to the new nums
	 * @param x Value for num1
	 * @param y Value for num2
	 */
	public void setNums(int x, int y) {
		num1 = x;
		num2 = y;
		setBins();
	}

	/**
	 * Asks for scanner input to set num1 and num2. Also resets bin1 and bin2 according to the new nums
	 */
	public void setNums() {
		Scanner sc = new Scanner(System.in);

		System.out.println("First number: ");
		num1 = Integer.parseInt(sc.nextLine());

		System.out.println("Second number: ");
		num2 = Integer.parseInt(sc.nextLine());

		sc.close();

		setBins();
	}

	/**
	 * Uses bin1 and bin2 to simulate a full adder circuit
	 * @return The sum of bin1 and bin2 as an integer
	 */
	public int fullAdder() {
		int length, s;
		int cin = 0;
		int counter = 0;
		StringBuilder sBuffer = new StringBuilder();
		int[] result;
		
		if (bin1.length > bin2.length) {
			
			result = new int[bin1.length];
			length = bin1.length;

			for (int i = 0; i < (bin1.length - bin2.length); i++) {
				result[counter] = 0;
				counter++;
			}

			for (int i : bin2) {
				result[counter] = i;
				counter++;
			}

			bin2 = result;

		} else if (bin2.length > bin1.length) {
			
			result = new int[bin2.length];
			length = bin2.length;

			for (int i = 0; i < (bin2.length - bin1.length); i++) {
				result[counter] = 0;
				counter++;
			}

			for (int i : bin1) {
				result[counter] = i;
				counter++;
			}

			bin1 = result;

		} else length = bin1.length;

		for (int i = 1; i <= length; i++) {
			s = bin1[length - i] ^ bin2[length - i] ^ cin;
			cin = (bin1[length - i] & bin2[length - i]) | (cin & (bin1[length - i] ^ bin2[length - i]));

			sBuffer.insert(0, s);
		}

		sBuffer.insert(0, cin);
		
		return Integer.parseInt(sBuffer.toString(), 2);
	}
}
