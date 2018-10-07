package examples;

import java.util.Scanner;

public class decimalToHex {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
        String hex = Integer.toHexString(decimal);
        System.out.println(hex);
    }
}
