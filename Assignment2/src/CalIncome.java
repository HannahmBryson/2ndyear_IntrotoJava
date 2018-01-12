/*
 * CalculateTotalIncome method: 
 * This method will calculate the total income from all properties and vehicles
 * including the additional costs and taxes  
 * */
	      
import java.util.ArrayList;
public class CalIncome {
	
	public static int CalculateTotalIncome(ArrayList<Apartment> apartmentArray,ArrayList<House> houseArray, ArrayList<Villa> villaArray,ArrayList<Car> carArray, ArrayList<Truck> truckArray ){
    	int TotalIncome=0,i;
    	
    	/* Calculating for Apartment*/
        for(i=0;i<apartmentArray.size();i++)
        	TotalIncome+=apartmentArray.get(i).getRentalDays()*apartmentArray.get(i).getRentalCost();
       
        /* Calculating for Houses adding clearing fee */
        for(i=0;i<houseArray.size();i++)
        	TotalIncome+=(houseArray.get(i).getRentalDays()*(houseArray.get(i).getRentalCost()))+( houseArray.get(i).getClearingFee()*houseArray.get(i).getClearingNum());

        /* Calculating for Villa adding room service and tax*/
        for(i=0;i<villaArray.size();i++)
        	TotalIncome+=(villaArray.get(i).getRentalCost()+villaArray.get(i).getRoomServicePerDay()+villaArray.get(i).getLuxuryTaxPerDay())*villaArray.get(i).getRentalDays();
        
        /* Calculating for Car*/
        for(i=0;i<carArray.size();i++)
        	TotalIncome+=carArray.get(i).getRentalDays()*carArray.get(i).getRentalCost();
        
        /* Calculating for Truck*/
        for(i=0;i<truckArray.size();i++)
        	TotalIncome+=truckArray.get(i).getRentalDays()*truckArray.get(i).getRentalCost()+(truckArray.get(i).getCargoNum()*truckArray.get(i).getCargoWeight()); 
        
        return TotalIncome;           
    }
}
