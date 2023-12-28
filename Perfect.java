/**
 * Gets a command-line argument (int), and chekcs if the given number is
 * perfect.
 */
public class Perfect {
	public static void main(String[] args) {
		//// Put your code here

		int num = Integer.parseInt(args[0]);
		int sum = 1;
		String outputString = num + " is a perfect number since " + num + " = 1";

		//loop 1 less than the number
		for (int i = 2; i <num; i++) {

			if (num % i == 0) {
				sum += i;
				outputString = outputString + " + " + i;
			}

		}

		if (sum == num){
			System.out.println(outputString);
		}
		else{
			System.out.println(num + " is not a perfect number");
		}
	}
}
