/*
 * Coin class
 * Create the property and metheods of a coin
 * Xuefeng Zhai
 * xzhai@andrew.cmu
 */

package coinToss;

import java.util.Random;

public class Coin {

	private String sideUp; //Used to record the side
	
	/*
	 * A no-arg constructor 
	 * that randomly determines the side of the coin
	 * that is facing up ("heads" or "tails") 
	 * and initializes the sideUp fieldaccordingly
	 */
	public Coin()
	{
		Random rand = new Random(); 
		int value = rand.nextInt(2); //Generate a random number between 0 and 1
		if (value == 1)
			sideUp = "Heads"; //If random number is 1 then its heads
		else
			sideUp = "Tails";//If random number is 0 then its tails
	}
	
	/*
	 *  A void method named toss 
	 *  that simulates the tossing of a coin
	 */
	public void Toss()
	{
		Random rand = new Random(); 
		int value = rand.nextInt(2);//Generate a random number between 0 and 1
		if (value == 1)
			sideUp = "Heads";//If random number is 1 then its heads
		else
			sideUp = "Tails";//If random number is 0 then its tails	
	}
	
	/*
	 * Used to return the side of a coin
	 */
	public String getSideUp()
	{
		return sideUp;
	}
}
