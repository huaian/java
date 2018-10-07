package utils;

import java.util.Scanner;

public class InputOutput {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int inputInt = scanner.nextInt();
		System.out.println(inputInt);
		scanner.close();
	}
}
