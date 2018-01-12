/*This class should displays the contain of all ArrayLists */ 
import java.util.ArrayList;
public class PrintAllProperty {

	 public static void PrintAllProperties(ArrayList<Apartment> apartmentArray,ArrayList<House> houseArray, ArrayList<Villa> villaArray ){
	    	int i;
	    	System.out.println("=============== All Apartments ============");
	    	for(i=0;i<apartmentArray.size();i++)
	    		System.out.println( "Reg No.: "+apartmentArray.get(i).getReg()+", Owner Name: "+apartmentArray.get(i).getOwner()+", Address: "+apartmentArray.get(i).getAddress()+", Days Rented "+apartmentArray.get(i).getRentalDays()+", Cost Per Day "+
	    				apartmentArray.get(i).getRentalCost()+", Appartment Floor "+apartmentArray.get(i).getStoreyNumber()+", Beds "+apartmentArray.get(i).getBedsNumber());
	       	System.out.println("=============== All Apartments ============");
	    	
	       	System.out.println("=============== All Houses ================");
	        for(i=0;i<houseArray.size();i++)
	        	System.out.println("Reg No.: "+houseArray.get(i).getReg()+", Owner Name: "+houseArray.get(i).getOwner()+", Address: "+houseArray.get(i).getAddress()+", Days Rented "+houseArray.get(i).getRentalDays()+", Cost Per Day "+
	        			houseArray.get(i).getRentalCost()+", No. Of Storeys: "+houseArray.get(i).getTotalNumberStorey()+", Clearing Fee: "+houseArray.get(i).getClearingFee());
	    	System.out.println("=============== All Houses ================");
	    	
	    	System.out.println("=============== All Villas ================");
	        for(i=0;i<villaArray.size();i++)
	        	System.out.println("Reg No.: "+villaArray.get(i).getReg()+" , Owner Name: "+villaArray.get(i).getOwner()+", Address: "+villaArray.get(i).getAddress()+", Days Rented "+villaArray.get(i).getRentalDays()+", Cost Per Day "+
	        			villaArray.get(i).getRentalCost()+", Cost Of Room Service: "+villaArray.get(i).getRoomServicePerDay()+", Tax Per Day: "+villaArray.get(i).getLuxuryTaxPerDay());
	        System.out.println("=============== All Villas ================");
	    }    
}
