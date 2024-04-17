package com.chainsys.encapsulation;

public class Ticketbooking {

	public static void main(String[] args) {
	  Theater Ticketbooking=new Theater();
	  Ticketbooking.setName("jhon");
	  Ticketbooking.setLocation("Chennai");
	  Ticketbooking.setMoivename("Xyz");
	  Ticketbooking.setSeatnumber(43);
	  Ticketbooking.setTime(9);
	 
	  System.out.println("Name is : "+Ticketbooking.getName());
	  System.out.println("Loaction is: "+Ticketbooking.getLocation());
	  System.out.println("Movie Name is: "+Ticketbooking.getMoivename()); 
	  System.out.println("SeatNumber is: "+Ticketbooking.getSeatnumber());
	  System.out.println("Time for Moive is: "+Ticketbooking.getTime());
	 
	}

}
