/*
 * Car class
 * Create the property and metheods of a car
 * Xuefeng Zhai
 * xzhai@andrew.cmu
 */
package parkingTicket;

public class ParkedCar {

	/*
	 * properties to keep the info of a car 
	 */
	private String carMake;
	private String carModel;
	private String carColor;
	private String carLicense;
	private int parkedMin;
	
	/**
	 * @param carMake
	 * @param carModel
	 * @param carColor
	 * @param carLicense
	 * @param parkedMin
	 */
	public ParkedCar(String carMake, String carModel, String carColor,
			String carLicense, int parkedMin) {
		super();
		this.carMake = carMake;
		this.carModel = carModel;
		this.carColor = carColor;
		this.carLicense = carLicense;
		this.parkedMin = parkedMin;
	}
	
	/**
	 * @return the carMake
	 */
	public String getCarMake() {
		return carMake;
	}
	/**
	 * @return the carModel
	 */
	public String getCarModel() {
		return carModel;
	}
	/**
	 * @return the carColor
	 */
	public String getCarColor() {
		return carColor;
	}
	/**
	 * @return the carLicense
	 */
	public String getCarLicense() {
		return carLicense;
	}

	/**
	 * @return the parkedMin
	 */
	public int getParkedMin() {
		return parkedMin;
	}

	

}
