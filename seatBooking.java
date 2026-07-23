package project;

import java.util.Scanner;

public class seatBooking extends Moviedetails implements Booking{
	
	Scanner sc = new Scanner(System.in);
	int seats[][] = new int[5][5];
	int row;
	int col;

	@Override
	public void selectcinemaname() {
		// TODO Auto-generated method stub
		super.selectcinemaname();
		
	}

	@Override
	public void selectmoviename() {
		// TODO Auto-generated method stub
		super.selectmoviename();
	}

	@Override
	public void displayseats() {
		// TODO Auto-generated method stub
		System.out.println("-------Seat Layout-------");
		for(int i = 0; i < 5 ; i++) {
			for(int j = 0; j < 5; j ++) {
				if(seats[i][j] == 0) {
					System.out.print("[A]" + " ");
				}
				else {
					System.out.print("[B]" + " ");
				}
			}
			System.out.println();
		}
	}

	@Override
	public void selectticketQuantity() {
		// TODO Auto-generated method stub
		super.Selectticketquantity();
	}

	@Override
	public void selectshowtiming() {
		// TODO Auto-generated method stub
		super.selectshowtiming();
		
	}

	@Override
	public void bookticket(int i, int j) {
		// TODO Auto-generated method stub
		displayseats();
		
		System.out.println("Enter Row : ");
		row = sc.nextInt();
		
		System.out.println("Enter Column");
		col = sc.nextInt();
		
		if(seats[row -1][col -1] == 1) {
			System.out.println("Seats Already Booked !!");
			return;
		}
		else {
			seats[row -1][col -1]=1;
			System.out.println("Seats booked successfully!!!");
		}
	}

	@Override
	public void cancelticket() {
		// TODO Auto-generated method stub
		displayseats();
		
		System.out.println("Enter Row : ");
		row = sc.nextInt();
		
		System.out.println("Enter Column : ");
		col = sc.nextInt();
		
		if(seats[row -1][col -1] == 0) {
			seats[row-1][col -1] = 1;
			System.out.println("Ticket cancel successfully!!!");
		}else {
			System.out.println("Seats Available(:");
		}
	}
	@Override
	public void printTicket() {
		// TODO Auto-generated method stub
		System.out.println("\n==================================");
        System.out.println("        MOVIE TICKET               ");
        System.out.println("==================================");
        System.out.println("Cinema Name   : " + cinemaname);
        System.out.println("Movie Name    : " + moviename);
        System.out.println("Show Timing   : " + showtiming);
        System.out.println("Seat          : Row " + row + " Column " + col);
        System.out.println("Ticket Quantity : " + quantity);
        System.out.println("Ticket price : Rs." + totalprice);
        System.out.println("----------------------------------");
        System.out.println("Total Amount  : Rs." + totalamount);
        System.out.println("==================================");
        System.out.println("Enjoy Your Movie!");
    
	}

	
	

}
