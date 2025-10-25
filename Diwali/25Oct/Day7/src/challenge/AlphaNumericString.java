package challenge;

import java.util.Scanner;

public class AlphaNumericString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String");
		String str = sc.nextLine();
		boolean status = false;
		if (!str.isEmpty() && str.matches(".*[0-9].*") && str.matches(".*[a-zA-Z].*")) {
			status = true;
		}

		if (status)
			System.out.println("The String is AlphaNumeric");
		else
			System.out.println("The String is not AlphaNumeric");

	}

}
