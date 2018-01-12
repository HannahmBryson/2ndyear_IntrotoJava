/*This class reads an text file and fills  property arrays */ 
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadInputPropertyFile {

	ReadInputPropertyFile () {}
	
    public static void FillArray(ArrayList<Apartment> apartmentArray,ArrayList<House> houseArray, ArrayList<Villa> villaArray) throws IOException {
    	
    	String InputFileName = "C:/COMP20010/Assignment2/textfiles/InputProperty.txt";
        File inputFile = new File(InputFileName);   
        Scanner in = new Scanner(inputFile);            
		
        while (in.hasNextLine()){ 
            String line= in.nextLine();      
            Scanner sc = new Scanner(line);   
   
            int PropertyType=Integer.parseInt(sc.next());
       		
       		if (PropertyType==1){
       			int StoreyNumber =Integer.parseInt(sc.next()); 
       			int BedsNumber= Integer.parseInt(sc.next());
       			int rentalCostPerDay= Integer.parseInt(sc.next());
       			int totalRentalDays= Integer.parseInt(sc.next());
       			int regNumber= Integer.parseInt(sc.next());
       			String ownerName= sc.next();
       			String address= sc.next();
       			apartmentArray.add (new Apartment(StoreyNumber, BedsNumber, rentalCostPerDay, totalRentalDays, regNumber,  ownerName, address ));
       		}
       		if (PropertyType==2){
       			int totalNumberStoreys = Integer.parseInt(sc.next());
           		int clearingFees= Integer.parseInt(sc.next());
           		int rentalcostPerDay=Integer.parseInt(sc.next());
           		int totalRentalDays= Integer.parseInt(sc.next());
           		int regNumber= Integer.parseInt(sc.next());
           		String ownerName= sc.next();
           		String address= sc.next();
           		int clearingNum= Integer.parseInt(sc.next());
           		houseArray.add (new House(totalNumberStoreys, clearingFees, rentalcostPerDay,totalRentalDays, regNumber, ownerName, address,clearingNum));
           	}
       		if (PropertyType==3){
           		int roomServicePerDay= Integer.parseInt(sc.next());
           		int luxuryTaxPerDay= Integer.parseInt(sc.next());
           		int rentalcostPerDay= Integer.parseInt(sc.next());
           		int totalRentalDays= Integer.parseInt(sc.next());
           		int regNumber= Integer.parseInt(sc.next());
           		String ownerName= sc.next();
           		String address= sc.next();
           		villaArray.add (new Villa(roomServicePerDay, luxuryTaxPerDay,rentalcostPerDay,totalRentalDays, regNumber, ownerName, address ));
       		}
           	sc.close(); 
        }	
        in.close();
    }    			   
}