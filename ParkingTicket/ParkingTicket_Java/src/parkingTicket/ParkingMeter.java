/*
 * Meter class
 * Create the property and metheods of a meter
 * Xuefeng Zhai
 * xzhai@andrew.cmu
 */

package parkingTicket;

public class ParkingMeter {
	
	/*
	 * keep the purchased parking min
	 */
	private int parkingMin;

	/**
	 * @param parkingMin
	 */
	public ParkingMeter(int parkingMin) {
		this.parkingMin = parkingMin;
	}

	/**
	 * @return the parkingMin
	 */
	public int getParkingMin() {
		return parkingMin;
	}
	
	
	
}
