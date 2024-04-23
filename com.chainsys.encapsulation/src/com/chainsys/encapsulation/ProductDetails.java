package com.chainsys.encapsulation;

import java.util.Scanner;

public class ProductDetails {

	public static void main(String[] args) {

		ProductPricing bp = new ProductPricing();
		Scanner sc = new Scanner(System.in);
		ProductInfo pi = new ProductInfo();

		System.out.println(" The Products Are ");
		System.out.println("-------------------------------");
		System.out.println("-->1) Amazon" + "\n" + "-->2) flipkart" + "\n" + "-->3) Ajio");
		System.out.println("-------------------------------");
		System.out.println("Please choose the Number 1,2,3");
		System.out.println("-------------------------------");
		String nameofproduct = sc.next();
		switch (nameofproduct.toLowerCase()) {
		case "1":
			int amazonwarrenty = 5;
			bp.setNameofproduct(nameofproduct);
			pi.amazon(nameofproduct, 12000, "2M", 5, amazonwarrenty);
			System.out.println("Warrenty : " + productwarranty(amazonwarrenty));
			System.out.println("------------------------------------");
			System.out.println("Thank you for purchasing our product");
			System.out.println("_                        _");
			System.out.println("Our Other Amazon products");
			amazonwarrentyy();

			break;
		case "2":
			int flipkartwarranty = 3;
			bp.setNameofproduct(nameofproduct);
			pi.flipkart(nameofproduct, 13000, "1.5M", 4.5, flipkartwarranty);
			System.out.println("Warranty :" + productwarranty(flipkartwarranty));
			System.out.println("------------------------------------");
			System.out.println("Thank you for purchasing our product");
			flipkartwarrentyy();
			break;
		case "3":
			int ajio = 4;
			bp.setNameofproduct(nameofproduct);
			pi.Ajio(nameofproduct, 14000, "500k", 4, ajio);
			System.out.println("Warranty: " + productwarranty(ajio));
			System.out.println("------------------------------------");
			System.out.println("Thank you for purchasing our product");
			ajiowarrenty();
			break;
		default:
			System.out.println("ENter valid data:");
			nameofproduct = sc.next();
			return;
		}

	}

	public static int productwarranty(int noofwarranty) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			if (noofwarranty > 0) {
				break;
			} else {
				System.out.println("Enter The value in positive Interger: ");
				noofwarranty = scn.nextInt();
			}
		}
		System.out.println("do have membership (yes/no)?");
		String m = scn.next();
		System.out.println("----------------------------------------------");
		System.out.println("*Congrats you have now 1 year !Extra warranty*");
		if (m.equalsIgnoreCase("yes")) {
			noofwarranty += 1;
			return noofwarranty;
		}
		return noofwarranty;

	}

	public static int amazonwarrentyy() {
		Scanner product = new Scanner(System.in);
		System.out.println("please choose the product App,Amazon prime,Amazon smart home");
		String product1 = product.next();
    	   
		switch (product1.toLowerCase()) {
		case "app":
			System.out.println("The cost is 400000");
			System.out.println("Date of release:Next month");
			System.out.println("pre download: 20k");
			System.out.println("Special discount for Members");
			break;
		case "amazonprime":
			System.out.println("The cost is 600000");
			System.out.println("Date of release:Next month");
			System.out.println("pre download: 10k");
			System.out.println("Special discount for Members");
			break;
		case "amazonsmarthome":
			System.out.println("The cost is 800000");
			System.out.println("Date of release:Not yet confirmed");
			System.out.println("pre download:1k");
			System.out.println("Special discount for Members");
			break;
		default:
			System.out.println("ENter the valid data");
		product1 = product.next();

		}
       
		
       
       return amazonwarrentyy();
}

	public static int flipkartwarrentyy() {
		Scanner product = new Scanner(System.in);
		System.out.println("please choose the product APP,Flipkartshow,flipkart smart home");
		String product1 = product.next();
		switch (product1.toLowerCase()) {
		case "app":
			System.out.println("The cost is 300000");
			System.out.println("Date of release:Next month");
			System.out.println("pre download: 21k");
			System.out.println("Special discount for Members");
			break;
		case "flipkartshow":
			System.out.println("The cost is 600000");
			System.out.println("Date of release:Next month");
			System.out.println("pre download: 12k");
			System.out.println("Special discount for Members");
			break;
		case "flipkart smart home":
			System.out.println("The cost is 800000");
			System.out.println("Date of release:Not yet confirmed");
			System.out.println("pre download:5k");
			System.out.println("Special discount for Members");
			break;
		default:
			System.out.println("ENter the valid data");
			product1 = product.next();

		}

		return flipkartwarrentyy();

	}

	public static int ajiowarrenty() {
		Scanner product = new Scanner(System.in);
		System.out.println("please choose the product AjioaPP,Jio Tv, Jio smart home");
		String product1 = product.next();
		switch (product1.toLowerCase()) {
		case "ajioapp":
			System.out.println("The cost is 400000");
			System.out.println("Date of release:Next month");
			System.out.println("pre download: 26k");
			System.out.println("Special discount for Members");

			break;
		case "jio tv":
			System.out.println("The cost is 500000");
			System.out.println("Date of release:Next month");
			System.out.println("pre download: 13k");
			System.out.println("Special discount for Members");
			break;
		case "jio smart home":
			System.out.println("The cost is 600000");
			System.out.println("Date of release:Not yet confirmed");
			System.out.println("pre download:5k");
			System.out.println("Special discount for Members");
			break;
		default:
			System.out.println("ENter the valid data");
			product1 = product.next();

		}

		return ajiowarrenty();
	}

}
