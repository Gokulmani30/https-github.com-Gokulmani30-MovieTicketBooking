package project;

import java.util.Scanner;

public class Moviedetails  {
	
	Scanner sc = new Scanner(System.in);
	
	protected String moviename;
	
	protected String cinemaname;
	
	protected double totalprice;
	
	protected double totalamount;
	
	protected String showtiming;
	
	protected int quantity;
	
	
	 void selectcinemaname() {
		
		System.out.println("1. PVR");
		System.out.println("2. ROHINI");
		System.out.println("3. VETRI");
		System.out.println("4. IMAS");
		
		System.out.print("Enter the choice : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			cinemaname = "PVR";
			totalprice = 280;
			break;
		case 2:
			cinemaname = "ROHINI";
			totalprice = 250;
			break;
		case 3:
			cinemaname = "vetri";
			totalprice = 190;
			break;
		case 4:
			cinemaname = "IMAS";
			totalprice = 150;
			break;
			
			default:
				System.out.println("Invalid cinemas!!!!");
		}
	}
	void selectmoviename() {
		
		System.out.println("1. jailer-2");
		System.out.println("2. Master");
		System.out.println("3. karupu");
		System.out.println("4. remo");
		
		System.out.print("Enter the choice : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			moviename = "jailer-2";
			break;
		case 2:
			moviename = "Master";
			break;
		case 3:
			moviename = "karupu";
			break;
		case 4:
			moviename = "remo";
			break;
			
			default:
				System.out.println("Invaild movies!!!!");
		}
	}
	
	void selectshowtiming() {
		
		System.out.println("-----Show Timing-----");
		System.out.println("1. 9:30 Am");
		System.out.println("2. 12:20 Pm");
		System.out.println("3. 6:30 Pm");
		System.out.println("4. 10:40 Pm");
		
		System.out.print("Enter the choice : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			showtiming = "9:30 Am";
			break;
		case 2:
			showtiming = "12:20 Pm";
			break;
		case 3:
			showtiming = "6:30 Pm";
			break;
		case 4:
			showtiming = "10:40 Pm";
			break;
			
			default:
				System.out.println("Invaild ShowTiming!!!!");
		}
	}
	
	void Selectticketquantity() {
		System.out.println("Enter the ticketQuantity : ");
		 quantity = sc.nextInt();
		
		if(quantity <= 0) {
			System.out.println("Invalid quantity!!!");
			quantity = 1;
		}
		totalamount = quantity * totalprice;
	}
	

}
