package practise;

import java.util.Scanner;

public class AndroidSession7_Assignment1 {
	static int num;
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integer: ");
		num = input.nextInt();
		String toConvert = new Integer(num).toString();
		System.out.println("Your converted string is: " + toConvert);
		input.close();
	}

}