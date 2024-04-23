package com.chainsys.encapsulation;
import java.util.*;
//String nameofproduct;
//int costofproduct;
//int noofusers;
//int noofwarranty;
//double productrating;

public class ProductDetails {

	public static void main(String[] args) {
		
		ProductPricing bp= new ProductPricing();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Name of the Product: ");
		String nameofproduct=sc.next();
		while(true) {
		if(nameofproduct.matches("^[a-zA-Z]+$")) {

			bp.setNameofproduct(nameofproduct);
			break;
		}
		else {
			System.out.println("Enter Input in Alphabets (E.g)a-z & A-Z");
			nameofproduct= sc.next();
		}
		}
	
		
		
		
		System.out.println("Enter The Cost of product:");
		
		int costofproduct=sc.nextInt();
		//validation
		while(true) {
		if(costofproduct>0) {
			bp.setCostofproduct(costofproduct);
			break;
			
		}
		else {
			System.out.println("Enter The value in positive Interger: ");
			costofproduct=sc.nextInt();
		}
		}
		
		
		
		
		
		System.out.println("Enter The No.of.Users: ");
		int noofusers=sc.nextInt();
		while(true) {
		if(noofusers>0) {
			bp.setNoofusers(noofusers);
			break;
			
		}
		else {
			System.out.println("Enter The value in positive Interger:");
			noofusers=sc.nextInt();
		}
		}
		
		
		
		
		System.out.println("Enter The Warranty: ");
		int noofwarranty=sc.nextInt();
		while(true) {
		if(noofwarranty>0) {
			bp.setNoofwarranty(noofwarranty);
			break;
		}
		else {
			System.out.println("Enter The value in positive Interger: ");
		}
		}
		
		
		
		
		
		System.out.println("please Enter Product Rating (0 to 5)");
		double productrating=sc.nextDouble();
		while(true) {
		if(productrating>0) {
			bp.setProductrating(productrating);
			break;
			
		}
		else {
			System.out.println("Enter  The value in positive Interger: ");
			productrating=sc.nextDouble();
		}
		}
		
		ProductForm pf=new ProductForm();

		
		pf.productspecs(bp.getNameofproduct());
		ProductForm.productspecs(bp.getNameofproduct(), bp.getCostofproduct());
		ProductForm.productspecs(bp.getNameofproduct(), bp.getCostofproduct(), bp.getNoofusers());
		ProductForm.productspecs(bp.getNameofproduct(), bp.getCostofproduct(), bp.getNoofusers(), bp.getProductrating());
		ProductForm.productspecs(bp.getNameofproduct(), bp.getCostofproduct(), bp.getNoofusers(),bp.getNoofwarranty());
		
		
		
		
		
		
				

		

	}

}
