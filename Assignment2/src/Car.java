/*
 * Car class is a subclass of the Vehicle
 * additional attributes (PassengerNumber) 
 */
public class Car extends Vehicle {
	
	/* Declaring Variables*/
	int PassengerNumber; 
	
	/* Constructors */
	public Car(int PassengerNumber, int rentalcostPerDay,int totalRentalDays, int regNumber, String ownerName) {
		super( rentalcostPerDay,totalRentalDays,regNumber, ownerName);
		this.PassengerNumber = PassengerNumber;
	}
	
	/*Accessors*/
	
	public int getPassengerNumber(){
	return PassengerNumber;
	}
}
	
