/* Class contains main and FillInProperties method */
import java.util.*;
public class Main {

	public static void main(String[] args){

		/* Creating 3 arrays */
		ArrayList<Apartment> apartmentArray = new ArrayList<Apartment>();
		ArrayList<House> houseArray = new ArrayList<House>();
		ArrayList<Villa> villaArray = new ArrayList<Villa>();

		/* Calling method*/
		FillInProperties(apartmentArray,houseArray,villaArray);
		
		/*Calling objects */
		CalIncome.CalculateTotalIncome(apartmentArray,houseArray,villaArray);
		PrintAllProperty.PrintAllProperties(apartmentArray,houseArray,villaArray);
		

	}
	
	/* Method that fills array and rents properties */
	public static void FillInProperties(ArrayList<Apartment> apartmentArray,ArrayList<House> houseArray, ArrayList<Villa> villaArray ){
		
		/* Filling Arrays*/
		
		/* StoreyNumber, BedsNumber, rentalCostPerDay, totalRentalDays, regNumber,  ownerName, address*/
		apartmentArray.add(new Apartment(1,2,20,0,1,"Tom Smith","1B Thomond Appartments"));
		apartmentArray.add(new Apartment(3,6,80,0,2,"John Farow","3C Melclose Place"));
		apartmentArray.add(new Apartment(4,4,50,0,3,"Lorna Bryson","4A Thomas Flats"));
		
		/*totalNumberStoreys, clearingFees, rentalcostPerDay,totalRentalDays, regNumber, ownerName, address */
		houseArray.add(new House(1,15,30,0,4,"Jane Brown","13 Brairwood Place"));
        houseArray.add(new House(2,10,60,0,5,"George Town","14 Bray Road"));
        houseArray.add(new House(4,20,100,0,6,"James Cross","20 Stillorgan Way"));
        
        /*roomServicePerDay, luxuryTaxPerDay,rentalcostPerDay,totalRentalDays, regNumber, ownerName, address*/
        villaArray.add(new Villa(5,5,15,0,7,"Lorna Bryson","Sunny Villa, Spain Road"));
        villaArray.add(new Villa(4,10,10,0,8,"Tom Smith","Red Villa, James Way"));
        villaArray.add(new Villa(8,15,20,0,9,"Sara Red","14 Villa Place"));
        
        /* Filling RentProperty renting each property 3 times*/
        apartmentArray.get(0).RentProperty(6);
        apartmentArray.get(0).RentProperty(25);                
        apartmentArray.get(0).RentProperty(3);
        apartmentArray.get(1).RentProperty(6);
        apartmentArray.get(1).RentProperty(8);                
        apartmentArray.get(1).RentProperty(27);
        apartmentArray.get(2).RentProperty(5);
        apartmentArray.get(2).RentProperty(4);                
        apartmentArray.get(2).RentProperty(23);
        
        houseArray.get(0).RentProperty(6);
        houseArray.get(0).RentProperty(2);                
        houseArray.get(0).RentProperty(25);
        houseArray.get(1).RentProperty(5);
        houseArray.get(1).RentProperty(14);                
        houseArray.get(1).RentProperty(20);
        houseArray.get(2).RentProperty(5);
        houseArray.get(2).RentProperty(10);                
        houseArray.get(2).RentProperty(18);
        
        villaArray.get(0).RentProperty(5);
        villaArray.get(0).RentProperty(16);                
        villaArray.get(0).RentProperty(20);
        villaArray.get(1).RentProperty(7);
        villaArray.get(1).RentProperty(14);                
        villaArray.get(1).RentProperty(21);
        villaArray.get(2).RentProperty(4);
        villaArray.get(2).RentProperty(30);                
        villaArray.get(2).RentProperty(20);

	}
}