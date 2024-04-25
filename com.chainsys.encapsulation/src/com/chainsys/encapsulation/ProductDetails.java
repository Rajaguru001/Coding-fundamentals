package com.chainsys.encapsulation;

import java.util.Scanner;

public class ProductDetails {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		ProductInfo pi = new ProductInfo();
		User u=new User();
		ProductSpecs ps = new ProductSpecs();
		ProductPricing gps= new ProductPricing("gps", 60000, 10, 4,4);
		ProductPricing gaming= new ProductPricing("Gaming", 70000, 10, 4,4);
		ProductPricing theater= new ProductPricing("Theater", 50000, 10, 4,4);
		
		int total=0;

		System.out.println("Do you have a account (y/n):");
		String acc = sc.next();
		while (true) {
			if (acc.equals("y") || acc.equals("Y")) {
				System.out.println("Great! you have a account");
				System.out.println("-------LOGIN PAGE--------");

				System.out.printf("Enter The User Name:");
				String username = sc.next();
				while (true) {
					if (username.matches("^[a-zA-Z]+$")) {
						u.setUsername(username);
						break;
					} else {
						System.out.println("Enter the valid data");
						username = sc.next();
					}
				}
				System.out.printf("Enter The Password :");
				String password = sc.next();
				while (true) {
					if (password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$")) {

						u.setPassword(password);
						break;
					} else {
						System.out.println("Use_one uppercase-[A-Z]" + "\n" + "use_one lowercase-[a-z]" + "\n"
								+ "Special character-[!@#$%]");
						password = sc.next();

					}

				}
				break;
			}

			while (true) {
				if (acc.equals("n") || acc.equals("N")) {
					System.out.println("SIGNUP PAGE");
					System.out.println("First Name:");
					String firstname = sc.next();
					while (true) {
						if (firstname.matches("^[a-zA-Z]+$")) {
							u.setUsername(firstname);
							break;
						} else {
							System.out.println("Enter the valid data");
							firstname = sc.next();
						}
					}

					System.out.println("Last Name:");
					String lastname = sc.next();
					System.out.println("Password:");
					String pwd = sc.next();
					while (true) {
						if (pwd.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$")) {
							u.setPassword(pwd);
							break;

						} else {
							System.out.println(
									"Use_one uppercase[A-Z]\"+\"\\n\"+\"use_one lowercase[a-z]\"+\"\\n\"+\"Special character(!@#$%)");
							pwd = sc.next();
						}
					}

					System.out.println("phone number:");
					int phonenumber = sc.nextInt();
					if (phonenumber > 0) {
					   u.setPhonenumber(phonenumber);
					} else {
						System.out.println("Enter the Positive Interger:");
						phonenumber = sc.nextInt();
					}

				}

				break;

			}
		}

		System.out.println("Your user ID:" + u.getUsername());
		// System.out.println("Phone Number :" + bp.getPhonenumber());

		System.out.println(" The Products Are ");
		System.out.println("-------------------------------");
		System.out.println("-->1) gps console" + "\n" + "-->2) gaming console" + "\n" + "-->3) smart home theater");
		System.out.println("-------------------------------");
		System.out.println("Please choose the Number 1,2,3");
		System.out.println("-------------------------------");
		boolean b = true;
		while (b) {
			String nameofproduct = sc.next();
			switch (nameofproduct.toLowerCase()) {
			case "1":
			
			
				System.out.println("product: "+gps.getNameofproduct());
                 gps.display();
				System.out.println("------------------------------------");
				System.out.println("do you want to purchase your product(yes/no)? ");
				String s = sc.next();
				if (s.equals("yes")) {
					gps.setNoofwarranty(ProductSpecs.productwarranty( gps.noofwarranty));
					System.out.println("Thank you for purchasing our product:50000");
					System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
					
					System.out.println("Warrenty : " + gps.getNoofwarranty());
					//System.out.println("checking"+ gps.getCostofproduct());
					System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
					System.out.println("|Our Other Maps products|");
					System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
				} else {
					System.out.println("Thanks for visit our product");
				}

				//total
				total+=ps.amazonwarrentyy(total);
				total+=gps.getCostofproduct();
				System.out.println(" Total purchase value is"+total);
				
				b = false;
				break;
			case "2":
				int flipkartwarranty = 3;
			
				System.out.println("product:"+gaming.getNameofproduct());
				 gaming.display();
			
				//pi.flipkart(nameofproduct, 60000, "1.5M", 4.5, flipkartwarranty);
				System.out.println("Do you want to purchase our product (yes/no): ");
				String gc = sc.next();
				if (gc.equals("yes")) {
					System.out.println("Thank you for purchasing our product:60000");
					System.out.println("------------------------------------");
					gaming.setNoofwarranty(ProductSpecs.productwarranty( gaming.noofwarranty));
					System.out.println("Warranty :" + gaming.getNoofwarranty());
					
					System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
					System.out.println("||Our Other gaming setup  products||");
					System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");

				} else {
					System.out.println("Thanks for visit our product");
				}

				total+=ps.flipkartwarrentyy(total);
				System.out.println(" Total purchase value is"+total);
				b = false;
				break;
			case "3":
				int ajio = 4;
				System.out.println("product: "+theater.getCostofproduct());
				pi.Ajio(nameofproduct, 40000, "500k", 4, ajio);
				System.out.println("Do you want to purchase our product: ");
				String hmt = sc.next();
				if (hmt.equals("yes")) {
					System.out.println("------------------------------------");
					System.out.println("Thank you for purchasing our product:40000");
					System.out.println("Warranty: " + theater.getNoofwarranty());
					System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
					System.out.println("||Our Other gaming setup products||");
					System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");

				} else {
					System.out.println("Thanks for visit our product");
				}
				ps.ajiowarrenty(total);
				total+=ps.ajiowarrenty(total);
				System.out.println("Total purchase value is"+total);
				b = false;
				break;
			default:
				System.out.println("ENter valid data:");
				nameofproduct = sc.next();
				return;
			}
		}

	}
}
