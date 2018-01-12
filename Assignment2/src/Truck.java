/*
 * Truck class is a subclass of the Vehicle
 * additional attributes (CargoWeight and CargoNum) 
 */
public class Truck extends Vehicle{
	
	/* Declaring Variables*/
	int  CargoWeight; 
	int CargoNum;
	
	/* Constructors */
	public Truck(int  CargoWeight, int rentalcostPerDay,int totalRentalDays, int regNumber, String ownerName, int CargoNum) {
		super( rentalcostPerDay,totalRentalDays,regNumber, ownerName);
		this. CargoWeight =  CargoWeight;
		this.CargoNum= CargoNum;
	}
	
	/* Mutator */
	
	public int getCargo(){
		return CargoNum +=1;
	}
	
	/*Accessors*/
	
	public int getCargoWeight(){
		return CargoWeight;
	}
	public int getCargoNum(){
		return CargoNum;
	}
}
	
