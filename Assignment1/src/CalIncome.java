/*
 * CalculateTotalIncome method: 
 * This method will calculate the total income from all properties 
 * including the additional costs and taxes . 
 */
import java.util.ArrayList;
public class CalIncome {
	
	public static int CalculateTotalIncome(ArrayList<Apartment> apartmentArray,ArrayList<House> houseArray, ArrayList<Villa> villaArray ){
    	int TotalIncome=0,i;
    	
    	/* Calculating for Apartment*/
        for(i=0;i<apartmentArray.size();i++)
        	TotalIncome+=apartmentArray.get(i).getRentalDays()*apartmentArray.get(i).getRentalCost();
       
        /* Calculating for Houses adding clearing fee */
        for(i=0;i<houseArray.size();i++)
    	TotalIncome+=houseArray.get(i).getRentalDays()*(houseArray.get(i).getRentalCost())+houseArray.get(i).getClearingFee();;
    	
      
        /* Calculating for Villa adding room service and tax*/
        for(i=0;i<villaArray.size();i++)
        	TotalIncome+=(villaArray.get(i).getRentalCost()+villaArray.get(i).getRoomServicePerDay()+villaArray.get(i).getLuxuryTaxPerDay())*villaArray.get(i).getRentalDays();
        System.out.println("Total Income of Season "+TotalIncome);
         return TotalIncome;
       
    }


}
