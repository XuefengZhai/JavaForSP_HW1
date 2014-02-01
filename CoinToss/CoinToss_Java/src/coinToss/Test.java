/*
 * Tests class
 * Different test cases
 * Xuefeng Zhai
 * xzhai@andrew.cmu
 */
package coinToss;

public class Test {

	public static void main(String[] args) {
		/*
		 * Test 1 Toss
		 */
		System.out.println("Test case 1: 1 Toss:");
        Simulation s1 = new Simulation();
		s1.Run(1);
		
		/*
		 * Test 20 Toss
		 */
		System.out.println();
		System.out.println("Test case 2: 20 Toss:");
        Simulation s2 = new Simulation();
		s2.Run(20);
		/*
		 * Test 50 Toss
		 */
		System.out.println();
		System.out.println("Test case 3: 50 Toss:");
        Simulation s3 = new Simulation();
		s3.Run(50);
		
	}

}
