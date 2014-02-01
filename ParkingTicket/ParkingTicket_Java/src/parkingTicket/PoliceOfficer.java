/*
 * PoliceOfficer class
 * Issue a ticket when necessary
 * Xuefeng Zhai
 * xzhai@andrew.cmu
 */
package parkingTicket;

public class PoliceOfficer {
	
	/*
	 * Keep info of a police officer
	 */
	private String policeName;
	private String badgeNumber;
	
	/**
	 * @param policeName
	 * @param badgeNumber
	 */
	public PoliceOfficer(String policeName, String badgeNumber) {
		super();
		this.policeName = policeName;
		this.badgeNumber = badgeNumber;
	}

	/**
	 * @return the policeName
	 */
	public String getPoliceName() {
		return policeName;
	}

	/**
	 * @return the badgeNumber
	 */
	public String getBadgeNumber() {
		return badgeNumber;
	}
	
	/*
	 * Check the parked min and purchased min
	 */
	public void examineCar(ParkedCar car, ParkingMeter meter, PoliceOfficer police){
		if(car.getParkedMin() <= meter.getParkingMin()){
			System.out.println("No ticket for this car.");

		}
		else{
			police.issueTicket(car, meter, police);
		}
	}
	
	/*
	 * Issue a ticket if the parked min is more then the purchased min
	 */
	public void issueTicket(ParkedCar car, ParkingMeter meter, PoliceOfficer police){
		System.out.println("A ticket is issued.");
		ParkingTicket ticket = new ParkingTicket();
		ticket.ReportCar(car);
		ticket.ReportFine(car, meter);
		ticket.ReportPolice(police);

	}
	
	
}
