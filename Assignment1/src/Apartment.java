/*
 * Apartment class is a subclass of the Property
 * additional attributes (storey number and number of beds) 
 */
public class Apartment extends Property {

	/* Declaring Variables*/
	
	int StoreyNumber;
	int BedsNumber;
	
	/* Constructors */
	
	public Apartment(int StoreyNumber, int BedsNumber, int rentalCostPerDay,int totalRentalDays, int regNumber, String ownerName, String address) {
			super( rentalCostPerDay,totalRentalDays,regNumber, ownerName,  address );
			this.StoreyNumber = StoreyNumber;
	        this.BedsNumber=BedsNumber;
	    }
	
		/* Accessors  */
	
		public int getStoreyNumber(){
			return StoreyNumber;
		}
		public int getBedsNumber(){
			return BedsNumber;
		}
	
}

