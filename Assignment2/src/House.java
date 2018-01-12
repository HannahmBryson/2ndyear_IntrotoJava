/*
 * Apartment class is a subclass of the Property
 * additional attributes (total number of storeys, the clearing fees and clearing num) 
 */
public class House extends Property {
	
	/* Declaring Variables*/
	int totalNumberStoreys; 
	int clearingFees;
	int clearingNum;
	
	/* Constructors */
	public House(int totalNumberStoreys, int clearingFees, int rentalcostPerDay,int totalRentalDays, int regNumber, String ownerName, String address, int clearingNum) {
		super( rentalcostPerDay,totalRentalDays,regNumber, ownerName,  address);
		this.totalNumberStoreys = totalNumberStoreys;
		this.clearingFees=clearingFees;
		this.clearingNum = clearingNum;
	}
	
	/*Accessors*/
	
	public int getTotalNumberStorey(){
		return totalNumberStoreys;
	}
	
	public int getClearingFee(){
		return clearingFees;
	}
	public int getClearingNum(){
		return clearingNum;
	}

	/* Mutator */
	
	public int getClearing(){
		return clearingNum +=1;
	}
}