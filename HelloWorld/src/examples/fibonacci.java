package examples;

import java.util.Scanner;

public class fibonacci {
	static int calculate (int n) {
		if (n <= 2) {
			return 1;
		} else {
			int fib = fibonacci.calculate(n-1) + calculate(n-2);
			System.out.print(fib);
			return fib;
		}
	}
	static int sum (int n) {
		if (n <= 2) {
			return n;
		} else {
			return fibonacci.calculate(n-1) + calculate(n-2);
		}
	}
	public static void main(String args[]){
//		F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
		Scanner scan = new Scanner(System.in);
        // 判断是否还有输入
        while (true) {
            int itemIndex = scan.nextInt();
            System.out.println("输入的数据为：" + itemIndex);
    		int sum = calculate(itemIndex); // 1 , 1, 2, 3, 5, 8
    		System.out.println(sum);
        }
//        scan.close();
	}

}
