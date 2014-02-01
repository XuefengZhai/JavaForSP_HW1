/*
 * Simulation class
 * To simulate a coin toss
 * Xuefeng Zhai
 * xzhai@andrew.cmu
 */
package coinToss;

public class Simulation {

	/*
	 * Used to run the coin test with the numToss
	 * to indicate the number of the coin toss.
	 */
	public void Run(int numToss) {
		Coin coin = new Coin(); //Create a new coin 

		int numHeads = 0; //Keep the number of heads during the coin toss
		int numTails = 0; //Keep the number of tails during the coin toss
		
		System.out.println("The initial side is:" + coin.getSideUp() );
		
		/*
		 *Run the tests using for loop 
		 */
		for (int i=1;i<=numToss;i++){
			coin.Toss();//Use the Toss method of coin
			if (coin.getSideUp().equals("Heads")){
				numHeads++;
				System.out.println(i+": The side is:" + coin.getSideUp() );
			}//If head then increase the numHeads and print out results
			else{
				numTails++;
				System.out.println(i+": The side is:" + coin.getSideUp() );
			}//If tail then increase the numHeads and print out results
		
		}
		System.out.println("The number of Heads are: "+numHeads);
		System.out.println("The number of Tails are: "+numTails);
		
	}
}


