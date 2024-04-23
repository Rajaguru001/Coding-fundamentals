package com.chainsys.encapsulation;

import java.util.*;

public class ProductForm {
	Scanner sc = new Scanner(System.in);

	public void productspecs(String nameofproduct) {
		System.out.println("---Welcome---");
		System.out.println("Name of the Product: " + nameofproduct);

	}

	public static void productspecs(String nameofproduct, int costofproduct) {

		System.out.println("The cost of the product: " + costofproduct);

	}

	public static void productspecs(String nameofproduct, int costofproduct, int noofusers) {

		System.out.println("No of Users for this product: " + noofusers);

	}

	public static void productspecs(String nameofproduct, int costofproduct, int noofusers, int noofwarranty) {
		System.out.println("Warranty Details: " + noofwarranty);

	}

	public static void productspecs(String nameofproduct, int costofproduct, int noofusers, double productrating) {
		System.out.println("Name of product :" + nameofproduct + "Cost of product :" + costofproduct + "No.of.Users :"
				+ noofusers + "Productrating: " + productrating);

	}

}
