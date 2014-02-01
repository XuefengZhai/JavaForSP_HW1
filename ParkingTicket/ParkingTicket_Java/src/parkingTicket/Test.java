package parkingTicket;

public class Test {

	public static void main(String[] args) {
		/*
		 * Test case 1, the car is in the parking time purchased
		 */
		System.out.println("Test Case 1:");

		ParkedCar car1 = new ParkedCar("VW","EOS","Black","12345",40);
		ParkingMeter meter1 = new ParkingMeter(60);
		PoliceOfficer police1 = new PoliceOfficer("Jason Wu", "A2");
		police1.examineCar(car1, meter1, police1);
		
		System.out.println();
		System.out.println("Test Case 2:");

		/*
		 * Test case 2, the car is just in the parking time purchased
		 */
		ParkedCar car2 = new ParkedCar("Mazda","3","Red","33345",60);
		ParkingMeter meter2 = new ParkingMeter(60);
		PoliceOfficer police2 = new PoliceOfficer("Alexandar Wang", "B4");
		police1.examineCar(car2, meter2, police2);
		
		System.out.println();
		System.out.println("Test Case 3:");

		/*
		 * Test case 3, the car is out of parking time purchased and under 1 hour
		 */
		ParkedCar car3 = new ParkedCar("Benz","SLS","Yellow","44425",85);
		ParkingMeter meter3 = new ParkingMeter(60);
		PoliceOfficer police3 = new PoliceOfficer("Miucci Prada", "C3");
		police1.examineCar(car3, meter3, police3);
		
		System.out.println();
		System.out.println("Test Case 4:");

		/*
		 * Test case 4, the car is out of parking time purchased and more then 1 hour
		 */
		ParkedCar car4 = new ParkedCar("Audi","A4","Pink","33365",181);
		ParkingMeter meter4 = new ParkingMeter(60);
		PoliceOfficer police4 = new PoliceOfficer("Dolce Gobbana", "D5");
		police1.examineCar(car4, meter4, police4);

		
		

	}

}
