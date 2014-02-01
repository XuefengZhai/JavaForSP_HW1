/*
 * ParkingTicket class
 * Report a ticket
 * Xuefeng Zhai
 * xzhai@andrew.cmu
 */

package parkingTicket;

public class ParkingTicket {
	
	/*
	 * Report the information of the car
	 */
	public void ReportCar(ParkedCar car){
		System.out.println("The make of the car is: "+car.getCarMake());
		System.out.println("The model of the car is: "+car.getCarModel());
		System.out.println("The color of the car is: "+car.getCarColor());
		System.out.println("The license number of the car is: "+car.getCarLicense());
		
	}
	
	/*
	 * Report the fine of the ticket
	 */
	public void ReportFine(ParkedCar car, ParkingMeter meter){
		
		int fine; //Used to keep the fine
		
		if(car.getParkedMin() - meter.getParkingMin()<=60){
			System.out.println("The fine is $25.00.");
		} // if less then an hour
		else{
			fine = ((car.getParkedMin() - meter.getParkingMin()) / 60 )* 10 + 25;
			if(((car.getParkedMin() - meter.getParkingMin()) % 60) == 0){
				fine = fine -10;
			}//when more then an hour
		
		System.out.println("The fine is $"+fine+".00).");
		}
		
	}
	
	/*
	 * Report the information of the police officer
	 */
	public void ReportPolice(PoliceOfficer police){
		System.out.println("The name of the police is: "+police.getPoliceName());
		System.out.println("The badge number of the police is: "+police.getBadgeNumber());
	}
}
