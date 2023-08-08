package practice;

public class AddWithoutUsingLoop {

	public static int add(int number) {
		// check if the number is 0
		if (number == 0) {
			return 0;
		}
		// get the last digit of number
		int lastDigit = number % 10;
		// call this method again with the sum of digit and remaining number
		return lastDigit + add(number / 10);
	}
	public static void main(String[] args) {
		int number = 56789;
		int sum = add(number); 
		System.out.println("Sum of digits of " + number + " is "+sum);
	}

}
