/*This class prints the elements of property arrays into an text file */ 
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class PrintAllProperty {

	PrintAllProperty() {}
	
	 public void PrintAllProperties(ArrayList<Apartment> apartmentArray,ArrayList<House> houseArray, ArrayList<Villa> villaArray ) throws FileNotFoundException{
		 
		 String OutputFileName="C:/COMP20010/Assignment2/textfiles/OutputProperty.txt";
		 PrintWriter out =new PrintWriter(OutputFileName);
		 int i;
	    	out.println("=============== All Apartments ============");
	    	for(i=0;i<apartmentArray.size();i++)
	    		out.println( "Reg No.: "+apartmentArray.get(i).getReg()+", Owner Name: "+apartmentArray.get(i).getOwner()+", Address: "+apartmentArray.get(i).getAddress()+", Days Rented "+apartmentArray.get(i).getRentalDays()+", Cost Per Day "+
	    				apartmentArray.get(i).getRentalCost()+", Appartment Floor "+apartmentArray.get(i).getStoreyNumber()+", Beds "+apartmentArray.get(i).getBedsNumber());
	       	out.println("=============== All Apartments ============");
	    	
	       	out.println("=============== All Houses ================");
	        for(i=0;i<houseArray.size();i++)
	        	out.println("Reg No.: "+houseArray.get(i).getReg()+", Owner Name: "+houseArray.get(i).getOwner()+", Address: "+houseArray.get(i).getAddress()+", Days Rented "+houseArray.get(i).getRentalDays()+", Cost Per Day "+
	        			houseArray.get(i).getRentalCost()+", No. Of Storeys: "+houseArray.get(i).getTotalNumberStorey()+", Clearing Fee: "+houseArray.get(i).getClearingFee());
	    	out.println("=============== All Houses ================");
	    	
	    	out.println("=============== All Villas ================");
	        for(i=0;i<villaArray.size();i++)
	        	out.println("Reg No.: "+villaArray.get(i).getReg()+" , Owner Name: "+villaArray.get(i).getOwner()+", Address: "+villaArray.get(i).getAddress()+", Days Rented "+villaArray.get(i).getRentalDays()+", Cost Per Day "+
	        			villaArray.get(i).getRentalCost()+", Cost Of Room Service: "+villaArray.get(i).getRoomServicePerDay()+", Tax Per Day: "+villaArray.get(i).getLuxuryTaxPerDay());
	        out.println("=============== All Villas ================");
	        out.close();
	 }    
}
