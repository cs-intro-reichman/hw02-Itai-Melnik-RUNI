
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */

/*

#feedback

It should be avoided using predicats and logics like: (!boy || !girl), try to use instead: (boy && girl).
because in the future when you will have to check more than 2 conditions,
some problems will come up.

*/


public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here

		boolean girl = false; 
		boolean boy = false;
		int count = 0;


		do {

			if(Math.random() < 0.5){
				System.out.print("g ");
				girl = true;
			}
			else{
				System.out.print("b ");
				boy = true;
			}
			count ++;

		}while (!boy || !girl);

		System.out.println("\nYou made it... and you now have "+count+" children.");
	}
}
