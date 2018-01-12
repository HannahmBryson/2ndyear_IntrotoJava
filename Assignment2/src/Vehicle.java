/*This class	is	 the	superclass	of	all	 types	of	Vehicles	*/

public class Vehicle {
 
	/* Declaring Variables*/
	int regNumber;
	String ownerName;
	String address;
	int rentalCostPerDay;
	int totalRentalDays;
	
	/* Constructors */
	
	public Vehicle(int rentalCostPerDay,int totalRentalDays,int regNumber, String ownerName){
		this.rentalCostPerDay = rentalCostPerDay;
		this.totalRentalDays = totalRentalDays;
		this.regNumber= regNumber;
		this.ownerName= ownerName;
	}
	
	/* Mutator */
	
	public void RentalItem (int Rentaldays){
		totalRentalDays += Rentaldays-1;
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
}