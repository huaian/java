package examples;

public class SumOfArray {
	public static void main(String args[]){
		int[] array = {
			45,
			566
		};
		long sum = 0;
		for (int i: array) {
			sum +=i;
		}
		System.out.println(sum);
	}

}
