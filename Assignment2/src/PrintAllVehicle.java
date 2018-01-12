/*This class prints the elements of Vehicle arrays into an text file */ 
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class PrintAllVehicle {
	
	PrintAllVehicle(){}
	
	 public void PrintAllVehicles(ArrayList<Car> carArray,ArrayList<Truck> truckArray ) throws FileNotFoundException{
		 
		 String OutputFileName = "C:/COMP20010/Assignment2/textfiles/OutputVehicle.txt";
		 PrintWriter out =new PrintWriter(OutputFileName);
		 int i;
		
		out.println("=============== All Cars ============");
		  for(i=0;i<carArray.size();i++  ) 		
			  out.println( "Reg No.: "+carArray.get(i).getReg()+", Owner Name: "+carArray.get(i).getOwner()+", Days Rented "+carArray.get(i).getRentalDays()+", Cost Per Day "+
		    				carArray.get(i).getRentalCost()+", PassengersNumber "+carArray.get(i).getPassengerNumber());
	    out.println("=============== All Cars ============");
	        
	   out.println("=============== All Trucks ================");
	        for(i=0;i<truckArray.size();i++ )	 
	        	out.println( "Reg No.: "+truckArray.get(i).getReg()+", Owner Name: "+truckArray.get(i).getOwner()+", Days Rented "+truckArray.get(i).getRentalDays()+", Cost Per Day "+
		    				truckArray.get(i).getRentalCost()+", CargoWeight "+truckArray.get(i).getCargoWeight());
	   out.println("=============== All Trucks ================");    
	   out.close();
	 }
}