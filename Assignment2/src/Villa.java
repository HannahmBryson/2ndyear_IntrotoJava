/*
 * Villa class is a subclass of the Property
 * additional attributes (the room service cost per day and luxury tax per day) 
 */
public class Villa extends Property {

	/* Declaring Variables*/
	int roomServicePerDay; 
	int luxuryTaxPerDay;
	
	/* Constructors */
	
	public Villa(int roomServicePerDay, int luxuryTaxPerDay, int rentalcostPerDay,int totalRentalDays, int regNumber, String ownerName, String address) {
		super( rentalcostPerDay,totalRentalDays,regNumber, ownerName,  address );
		this.roomServicePerDay = roomServicePerDay;
        this.luxuryTaxPerDay= luxuryTaxPerDay;
    }
	/* Accessors */
	
	public int getRoomServicePerDay(){
		return roomServicePerDay;
	}
	public int getLuxuryTaxPerDay(){
		return luxuryTaxPerDay;
	}
	
}