/**
 * Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int n = Integer.parseInt(args[0]);
		String outpuString = "";

		for (int i = 1; i <= n; i++) {
			outpuString = "";
			for (int j = 1; j <= n; j++) {

				if (i % 2 != 0) { // i is odd
					outpuString = outpuString + "* ";
				} else {
					outpuString = outpuString + " *";
				}
			}

			System.out.println(outpuString);
		}

	}
}
