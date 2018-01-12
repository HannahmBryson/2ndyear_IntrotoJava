/* Class contains main and FillInProperties method */
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
public class Main {

	public static void main(String []args) throws IOException{

		/* Creating 5 arrays */
		ArrayList<Apartment> apartmentArray = new ArrayList<Apartment>();
		ArrayList<House> houseArray = new ArrayList<House>();
		ArrayList<Villa> villaArray = new ArrayList<Villa>();
		ArrayList<Car> carArray = new ArrayList<Car>();
		ArrayList<Truck> truckArray = new ArrayList<Truck>();
						
		/* Creating new objects*/
		PrintAllProperty print1 = new PrintAllProperty();
		PrintAllVehicle print2 = new PrintAllVehicle();
		
		/*Calling objects */
		ReadInputPropertyFile.FillArray(apartmentArray,houseArray,villaArray);
		ReadInputVehicleFile.FillArray(carArray,truckArray);
		CalIncome.CalculateTotalIncome(apartmentArray,houseArray,villaArray, carArray,truckArray);
		print1.PrintAllProperties(apartmentArray,houseArray,villaArray);
		print2.PrintAllVehicles(carArray,truckArray);
		
		/* Creating Jframe*/
		JFrame frame_parent =new JFrame("MYBnB");
        
        frame_parent.setLayout(new GridLayout(4, 3));
        frame_parent.setSize(300, 500);
        
        JButton b1= new JButton("Property") ;
    	    b1.addActionListener(new ActionListener(){
    	    	
    		  public void actionPerformed(ActionEvent e){  
    			
    			  GiveRentalProperty(apartmentArray,houseArray,villaArray);  
    		  }
    	});

    	 JButton b2= new JButton("Vehicle") ;
 	    b2.addActionListener(new ActionListener(){
 	    	
 		  public void actionPerformed(ActionEvent e){
 			  
 			 GiveRentalVehicle(carArray, truckArray); 
 		  }
 	});
 	    
 	    JLabel l1=new JLabel();
 	   
 	   	 JButton b3= new JButton("print total Income") ;
  	    b3.addActionListener(new ActionListener(){
  	    	
  		  public void actionPerformed(ActionEvent e){
  			  
  		     l1.setText("The current total income for this fiscal year is:"+ CalIncome.CalculateTotalIncome(apartmentArray,houseArray,villaArray, carArray,truckArray));
  		  }
  	    });
 	    
  	   frame_parent.getContentPane().add(b1);
  	   frame_parent.getContentPane().add(b2);
  	   frame_parent.getContentPane().add(b3);
  	   frame_parent.getContentPane().add(l1);
  	     
  	  frame_parent.setVisible(true);
  	  frame_parent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	}
	
	/* Method that rents vehicles */
public static void GiveRentalVehicle (ArrayList<Car> carArray,ArrayList<Truck> truckArray ){
		

	PrintAllVehicle print2 = new PrintAllVehicle();
	
	JFrame frame = new JFrame("MyBnB-rent");
	frame.setLayout(new GridLayout(4, 3));
	frame.setSize(200, 500);
	
	ImageIcon imageIcon = new ImageIcon(new ImageIcon("C://Users/Hannah/Downloads/MyBnb/src/a.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
								
	JButton Car =new JButton(imageIcon);
	Car.setSize(150,150);
	
	Car.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent e){
			// display/centre the jdialog when the button is pressed
				JFrame frame1 = new JFrame("MyBnB-rent-Car");
										  
				frame1.setLayout(new GridLayout(5, 0));
				frame1.setSize(300, 200);
				UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
				
				frame1.getContentPane().add(new JLabel("Car no:"));
				JTextArea t1= new JTextArea(20,10); 
				frame1.getContentPane().add(t1);
				
				frame1.getContentPane().add(new JLabel("Number of days:"));
				JTextArea t2= new JTextArea(20,10);
				frame1.getContentPane().add(t2);
				
				JButton b= new JButton("Confirm") ;
				b.addActionListener(new ActionListener(){
					
					public void actionPerformed(ActionEvent e){
						
						int carNum=Integer.parseInt(t1.getText());
						int rentD=Integer.parseInt(t2.getText());
						carArray.get(carNum).RentalItem(rentD);
						frame1.getDefaultCloseOperation();
						frame1.dispose();
					}
				});
				
			frame1.getContentPane().add(b);
			frame1.setVisible(true); 
		}
	});
		
	ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("C:/COMP20010/Assignment2/src/a11.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
						
	JButton Truck =new JButton(imageIcon1);
	Truck.setSize(150,150);
	
	Truck.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent e){
			
			JFrame frame1 = new JFrame("MyBnB-rent-Truck");
			frame1.setLayout(new GridLayout(5, 0));
			frame1.setSize(300, 200);
			UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
			
			frame1.getContentPane().add(new JLabel("Truck no:"));
			JTextArea t1= new JTextArea(20,10);
			frame1.getContentPane().add(t1);
			
			frame1.getContentPane().add(new JLabel("Number of days:"));
			JTextArea t2= new JTextArea(20,10);
			frame1.getContentPane().add(t2);
			
			JButton b= new JButton("Confirm") ;
			
			b.addActionListener(new ActionListener(){
									            	
				public void actionPerformed(ActionEvent e){
									    		  
					int truckNum=Integer.parseInt(t1.getText());
					int rentD=Integer.parseInt(t2.getText());
					truckArray.get(truckNum).RentalItem(rentD);
					truckArray.get(truckNum).getCargo();
					frame1.dispose();
				}
			});
									            
			frame1.getContentPane().add(b);
			frame1.setVisible(true);
		}
	});
																						
	JButton b3= new JButton("Output to file") ;
	b3.setSize(150,150);
	
	b3.addActionListener(new ActionListener(){
								  	    	
		public void actionPerformed(ActionEvent e){
			try {
				print2.PrintAllVehicles(carArray,truckArray);
			
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
		}
	});
	
	frame.getContentPane().add(Car);
	frame.getContentPane().add(Truck);
	frame.getContentPane().add(b3);
	
	JButton bclose= new JButton("Finish") ;
	bclose.addActionListener(new ActionListener() {
	
		public void actionPerformed(ActionEvent e){ 
			
			frame.dispose();
			}
	});
								
								
	frame.getContentPane().add(bclose);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
}	
public static void GiveRentalProperty (ArrayList<Apartment> apartmentArray,ArrayList<House> houseArray, ArrayList<Villa> villaArray ){
	
	PrintAllProperty print1 = new PrintAllProperty();
	
	JFrame frame = new JFrame("MyBnB-rent");
	frame.setLayout(new GridLayout(4, 3));
	frame.setSize(300, 500);
	
	ImageIcon imageIcon = new ImageIcon(new ImageIcon("C://Users/Hannah/Downloads/MyBnb/src/a.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
								
	JButton Apartment =new JButton(imageIcon);
	Apartment.setSize(150,150);
	
	Apartment.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent e){
	
				JFrame frame1 = new JFrame("MyBnB-rent-Apartment");
										  
				frame1.setLayout(new GridLayout(5, 0));
				frame1.setSize(300, 200);
				UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
				
				frame1.getContentPane().add(new JLabel("Apartment no:"));
				JTextArea t1= new JTextArea(20,10); 
				frame1.getContentPane().add(t1);
				
				frame1.getContentPane().add(new JLabel("Number of days:"));
				JTextArea t2= new JTextArea(20,10);
				frame1.getContentPane().add(t2);
				
				JButton b= new JButton("Confirm") ;
				b.addActionListener(new ActionListener(){
					
					public void actionPerformed(ActionEvent e){
						
						int apartmentNum=Integer.parseInt(t1.getText());
						int rentD=Integer.parseInt(t2.getText());
						apartmentArray.get(apartmentNum).RentalItem(rentD);
						frame1.getDefaultCloseOperation();
						frame1.dispose();
					}
				});
				
			frame1.getContentPane().add(b);
			frame1.setVisible(true); 
		}
	});
		
	ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("C:/COMP20010/Assignment2/src/a11.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
						
	JButton House =new JButton(imageIcon1);
	House.setSize(150,150);
	
	House.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent e){
			
			JFrame frame1 = new JFrame("MyBnB-rent-House");
			frame1.setLayout(new GridLayout(5, 0));
			frame1.setSize(300, 200);
			UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
			
			frame1.getContentPane().add(new JLabel("House no:"));
			JTextArea t1= new JTextArea(20,10);
			frame1.getContentPane().add(t1);
			
			frame1.getContentPane().add(new JLabel("Number of days:"));
			JTextArea t2= new JTextArea(20,10);
			frame1.getContentPane().add(t2);
			
			JButton b= new JButton("Confirm") ;
			
			b.addActionListener(new ActionListener(){
									            	
				public void actionPerformed(ActionEvent e){
									    		  
					int houseNum=Integer.parseInt(t1.getText());
					int rentD=Integer.parseInt(t2.getText());
					houseArray.get(houseNum).RentalItem(rentD);
					houseArray.get(houseNum).getClearing();
					frame1.dispose();
				}
			});
									            
			frame1.getContentPane().add(b);
			frame1.setVisible(true);
		}
	});
	
	JButton Villa =new JButton(imageIcon1);
	Villa.setSize(150,150);
	
	Villa.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent e){
			
			JFrame frame1 = new JFrame("MyBnB-rent-Villa");
			frame1.setLayout(new GridLayout(5, 0));
			frame1.setSize(300, 200);
			UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
			
			frame1.getContentPane().add(new JLabel("Villa no:"));
			JTextArea t1= new JTextArea(20,10);
			frame1.getContentPane().add(t1);
			
			frame1.getContentPane().add(new JLabel("Number of days:"));
			JTextArea t2= new JTextArea(20,10);
			frame1.getContentPane().add(t2);
			
			JButton b= new JButton("Confirm") ;
			
			b.addActionListener(new ActionListener(){
									            	
				public void actionPerformed(ActionEvent e){
									    		  
					int villaNum=Integer.parseInt(t1.getText());
					int rentD=Integer.parseInt(t2.getText());
					villaArray.get(villaNum).RentalItem(rentD);
					frame1.dispose();
				}
			});
									            
			frame1.getContentPane().add(b);
			frame1.setVisible(true);
		}
	});																					
	JButton b3= new JButton("Output to file") ;
	b3.setSize(150,150);
	
	b3.addActionListener(new ActionListener(){
								  	    	
		public void actionPerformed(ActionEvent e){
			try {
				print1.PrintAllProperties(apartmentArray,houseArray,villaArray);
			
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
		}
	});
	
	frame.getContentPane().add(Apartment);
	frame.getContentPane().add(House);
	frame.getContentPane().add(Villa);
	frame.getContentPane().add(b3);
	
	JButton bclose= new JButton("Finish") ;
	bclose.addActionListener(new ActionListener() {
	
		public void actionPerformed(ActionEvent e){ 
			
			frame.dispose();
			}
	});							
								
	frame.getContentPane().add(bclose);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}	
}