/*This class reads an text file and fills vehicle arrays */ 
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadInputVehicleFile {

	ReadInputVehicleFile () {}
	
    public static void FillArray(ArrayList<Car> carArray, ArrayList<Truck> truckArray) throws IOException {
    	
		String InputFileName = "C:/COMP20010/Assignment2/textfiles/InputVehicle.txt";
        File inputFile = new File(InputFileName);  
        Scanner in = new Scanner(inputFile);           
		
        while (in.hasNextLine()){ 
            String line= in.nextLine();     
            Scanner sc = new Scanner(line); 
   
            int VehicleType=Integer.parseInt(sc.next());
       		
       		if (VehicleType==1){
       			int PassengerNumber =Integer.parseInt(sc.next());
       			int rentalCostPerDay= Integer.parseInt(sc.next());
       			int totalRentalDays= Integer.parseInt(sc.next());
       			int regNumber= Integer.parseInt(sc.next());
       			String ownerName= sc.next();
       			carArray.add (new Car(PassengerNumber, rentalCostPerDay, totalRentalDays, regNumber,  ownerName));
       		}
       		if (VehicleType==2){
       			int CargoWeight = Integer.parseInt(sc.next());
           		int rentalcostPerDay=Integer.parseInt(sc.next());
           		int totalRentalDays= Integer.parseInt(sc.next());
           		int regNumber= Integer.parseInt(sc.next());
           		String ownerName= sc.next();
           		int CargoNum= Integer.parseInt(sc.next());
           		truckArray.add (new Truck(CargoWeight, rentalcostPerDay,totalRentalDays, regNumber, ownerName,CargoNum));
           		}
       	sc.close(); 
        }	
   	in.close();
    }    			   
}

