/*This class	is	 the	superclass	of	all	 types	of	properties.	*/

public class Property {
 
	/* Declaring Variables*/
	int regNumber;
	String ownerName;
	String address;
	int rentalCostPerDay;
	int totalRentalDays;
	
	/* Constructors */
	
	public Property(int rentalCostPerDay,int totalRentalDays,int regNumber, String ownerName, String address){
		this.rentalCostPerDay = rentalCostPerDay;
		this.totalRentalDays = totalRentalDays;
		this.regNumber= regNumber;
		this.ownerName= ownerName;
		this.address = address;
	}
	
	/* Mutator */
	
	public void RentProperty (int Rentaldays){
		totalRentalDays += Rentaldays;
	}
	
	/* Accessors */
	
	public int getRentalDays(){
		return totalRentalDays;
	}
	
	public int getRentalCost(){
		return rentalCostPerDay;
	}
	
	public int getReg(){
	return regNumber;
	}
	
	public String getOwner (){
		return ownerName;
	}
	
	public String getAddress(){
		return address;
	}
	
}


