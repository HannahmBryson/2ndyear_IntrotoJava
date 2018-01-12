/*
 * Apartment class is a subclass of the Property
 * additional attributes (total number of storeys and the clearing fees) 
 */
public class House extends Property {
	
	/* Declaring Variables*/
	int totalNumberStoreys; 
	int clearingFees;
	
	/* Constructors */
	public House(int totalNumberStoreys, int clearingFees, int rentalcostPerDay,int totalRentalDays, int regNumber, String ownerName, String address) {
		super( rentalcostPerDay,totalRentalDays,regNumber, ownerName,  address);
	this.totalNumberStoreys = totalNumberStoreys;
    this.clearingFees=clearingFees;
}
	
/*Accessors*/
	
public int getTotalNumberStorey(){
	return totalNumberStoreys;
}
public int getClearingFee(){
	return clearingFees;
}
	}
	
