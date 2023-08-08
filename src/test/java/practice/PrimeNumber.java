package practice;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 5;
		boolean flag = true;
		for (int i = 2; i <num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("prime no");
		} else {
			System.out.println("not a prime no");
		}
	}

}
