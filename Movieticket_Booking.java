package project;

import java.util.Scanner;

public class Movieticket_Booking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Booking book = new seatBooking();

        int choice;

        do {

            System.out.println("-----Movie Booking-----");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch(choice) {

            case 1:
                book.selectcinemaname();
                book.selectmoviename();
                book.selectshowtiming();
                book.selectticketQuantity();
                book.bookticket(0, 1);
                break;

            case 2:
                book.printTicket();
                break;

            case 3:
                book.cancelticket();
                break;

            case 4:
                System.out.println("THANK YOU!");
                break;

            default:
                System.out.println("Invalid choice!");
            }

        } while(choice != 4);

        sc.close();
    }
}