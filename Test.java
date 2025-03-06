package Exception_1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start");
		System.out.println("Enter a number");
		int a = sc.nextInt();

		System.out.println("enter b number ");
		int b = sc.nextInt();

		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("not devided by zero");
		}

		System.out.println("close");
	}
}
