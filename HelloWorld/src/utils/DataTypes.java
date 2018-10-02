package utils;

import java.util.Scanner;

public class DataTypes {
	static boolean isPositive(int testValue){
		if (testValue > 0) {
			return true;
		} else {
			return false;
		}
	}
	boolean isNegative(int testValue){
		if (testValue < 0) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int testValue = scan.nextInt();
		scan.close();
		System.out.println(isPositive(testValue)?"positive":"negative");
	}

}
