package com.chainsys.encapsulation;
import java.util.*;

public class Ticketbooking {

	public static void main(String[] args) {
	  Theater bt=new Theater();
	  Scanner sc= new Scanner (System.in);
	  
	  System.out.println("Enter The Name: ");
	  String name=sc.next();
	  if(name.matches("^[a-zA-Z]+$")) {
		  bt.setName(name);
	  }
	  else {
		  System.out.println("Enter the input in Alphabets:");
		  name=sc.next();
	  }
	  
	  System.out.println("Enter The Location:");
	  String location=sc.next();
	  if(location.matches(location)) {
		  bt.setLocation(location);
	  }
	  else {
		  System.out.println("Enter the input in Alphabets:");
		  location=sc.next();
	  }
	  
	  System.out.println("Enter The Movie Name:");
	  String moviename=sc.next();
	  if(moviename.matches("^[a-zA-Z]+$")) {
		  bt.setMoivename(moviename);
	  }
	  else {
		  System.out.println("Enter the input in Alphabets: ");
		  moviename=sc.next();
	  }
	  
	  System.out.println("Enter The Movie Time: ");
	  int time=sc.nextInt();
	  if(time>0) {
		  bt.setTime(time);
	  }
	  else {
		  System.out.println("Enter The Value in Positive Integer: ");
		  time=sc.nextInt();
	  }
	  
	  System.out.println("Enter the seat number: ");
	  int seatnumber=sc.nextInt();
	  if(seatnumber>0) {
		  bt.setSeatnumber(seatnumber);
	  }
	  else {
		  System.out.println("Enter The Value in Positive Integer: ");
		  seatnumber=sc.nextInt();
	  }
	  
	  Theaterbooking1 ttb=new Theaterbooking1();
	  ttb.username(bt.getName());
	  ttb.moviename(bt.getMoivename());
	  ttb.location(bt.getLocation());
	  ttb.seatnumber(bt.getSeatnumber());
	  ttb.time(bt.getTime());
	  ttb.rules();
	  
	  
	  
	  
	/*  Ticketbooking.setName("jhon");
	  Ticketbooking.setLocation("Chennai");
	  Ticketbooking.setMoivename("Xyz");
	  Ticketbooking.setSeatnumber(43);
	  Ticketbooking.setTime(9);
	 
	  System.out.println("Name is : "+Ticketbooking.getName());
	  System.out.println("Loaction is: "+Ticketbooking.getLocation());
	  System.out.println("Movie Name is: "+Ticketbooking.getMoivename()); 
	  System.out.println("SeatNumber is: "+Ticketbooking.getSeatnumber());
	  System.out.println("Time for Moive is: "+Ticketbooking.getTime()); */
	 
	}

}
