import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  

		boolean girl = false;
		boolean boy = false;
		int childCount = 0;

		double sum = 0;
		int familyOf2 = 0;
		int familyOf3 = 0;
		int familyOf4 = 0;

		int mode = 0;

		for (int i = 0; i < T; i++) {
			childCount = 0;
			boy = false;
			girl = false;

			do {
				double rnd = generator.nextDouble();
				if (rnd < 0.5) {
					girl = true;
				} else {	
					boy = true;
				}
				childCount++;

			} while (!boy || !girl);

			if (childCount == 2) {
				familyOf2++;
			} else if (childCount == 3) {
				familyOf3++;
			} else {
				familyOf4++;
			}
			sum += childCount;
		}

		mode = Math.max(Math.max(familyOf2, familyOf3), familyOf4);

		System.out.println("Average: " + (sum / T) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + familyOf2);
		System.out.println("Number of families with 3 children: " + familyOf3);
		System.out.println("Number of families with 4 or more children: " + familyOf4);
		System.out.println("The most common number of children is "
				+ ((mode == familyOf2) ? "2" : (mode == familyOf3) ? "3" : "4"));
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    
	}
}
