package utils;

import java.util.stream.Stream;

public class Strings {
	public static void main(String args[]){
		String testString = "testString测试字符串";
		for (int i = 0; i < testString.length(); i++) {
			System.out.println(testString.charAt(i));
		}
		String incomeString = "tom,jack,amily";
		String[] incomeKeys = incomeString.split(",");
		Stream.of(incomeKeys).forEach((key) -> {
			System.out.println(key);
		});
	}

}
