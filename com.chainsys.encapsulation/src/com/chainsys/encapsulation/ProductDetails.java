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
		if(nameofproduct.matches("^[a-zA-Z]+$")) {

			bp.setNameofproduct(nameofproduct);
		}
		else {
			System.out.println("Enter Input in Alphabets (E.g)a-z & A-Z");
			nameofproduct= sc.next();
		}
	
		
		
		
		System.out.println("Enter The Cost of product:");
		
		int costofproduct=sc.nextInt();
		//validation
		if(costofproduct>0) {
			bp.setCostofproduct(costofproduct);
			
		}
		else {
			System.out.println("Enter The value in positive Interger: ");
			costofproduct=sc.nextInt();
		}
		
		
		
		
		
		System.out.println("Enter The No.of.Users: ");
		int noofusers=sc.nextInt();
		//validation
		if(noofusers>0) {
			bp.setNoofusers(noofusers);
			
		}
		else {
			System.out.println("Enter The value in positive Interger:");
			noofusers=sc.nextInt();
		}
		
		
		
		
		System.out.println("Enter The Warranty: ");
		int noofwarranty=sc.nextInt();
		//validation
		if(noofwarranty>0) {
			bp.setNoofwarranty(noofwarranty);
		}
		else {
			System.out.println("Enter The value in positive Interger: ");
		}
		
		
		
		
		
		System.out.println("Enter the Product Rating");
		double productrating=sc.nextDouble();
		//validation
		if(productrating>0) {
			bp.setProductrating(productrating);
			
		}
		else {
			System.out.println("Enter  The value in positive Interger: ");
			productrating=sc.nextDouble();
		}
		
		ProductForm pf=new ProductForm();

		
		pf.productspecs(bp.getNameofproduct());
		ProductForm.productspecs(bp.getNameofproduct(), bp.getCostofproduct());
		ProductForm.productspecs(bp.getNameofproduct(), bp.getCostofproduct(), bp.getNoofusers());
		ProductForm.productspecs(bp.getNameofproduct(), bp.getCostofproduct(), bp.getNoofusers(), bp.getProductrating());
		ProductForm.productspecs(bp.getNameofproduct(), bp.getCostofproduct(), bp.getNoofusers(),bp.getNoofwarranty());
		
		
		
		
		
		
				

		

	}

}
