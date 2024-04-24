package com.chainsys.encapsulation;

import java.util.Scanner;

public class ProductDetails {

	public static void main(String[] args) {

		ProductPricing bp = new ProductPricing();
		Scanner sc = new Scanner(System.in);
		ProductInfo pi = new ProductInfo();

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
						bp.setUsername(username);
						break;
					} else {
						System.out.println("Enter the valid data hello");
						username = sc.next();
					}
				}
				System.out.printf("Enter The Password :");
				String password = sc.next();
				while (true) {
					if (password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$")) {

						bp.setPassword(password);
						break;
					} else {
						System.out.println("Use_one uppercase-[A-Z]" + "\n" + "use_one lowercase-[a-z]" + "\n"
								+ "Special character-[!@#$%]");
						password = sc.next();

					}

				}
				break;
			}

		}

		while (true) {
			if (acc.equals("n") || acc.equals("N")) {
				System.out.println("SIGNUP PAGE");
				System.out.println("First Name:");
				String firstname = sc.next();
				while (true) {
					if (firstname.matches("^[a-zA-Z]+$")) {
						bp.setUsername(firstname);
						break;
					} else {
						System.out.println("Enter the valid data hello2");
						firstname = sc.next();
					}
				}

				System.out.println("Last Name:");
				String lastname = sc.next();
				System.out.println("Password:");
				String pwd = sc.next();
				while (true) {
					if (pwd.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$")) {
						bp.setPassword(pwd);
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
					bp.setPhonenumber(phonenumber);
				} else {
					System.out.println("Enter the Positive Interger:");
					phonenumber = sc.nextInt();
				}

			}

			break;

		}

		System.out.println("Your user ID:" + bp.getUsername());
	//	System.out.println("Phone Number  :" + bp.getPhonenumber());

		System.out.println(" The Products Are ");
		System.out.println("-------------------------------");
		System.out.println("-->1) Amazon" + "\n" + "-->2) flipkart" + "\n" + "-->3) Ajio");
		System.out.println("-------------------------------");
		System.out.println("Please choose the Number 1,2,3");
		System.out.println("-------------------------------");
		boolean b = true;
		while (b) {
			String nameofproduct = sc.next();
			switch (nameofproduct.toLowerCase()) {
			case "1":
				int amazonwarrenty = 5;
				bp.setNameofproduct(nameofproduct.toLowerCase());
				System.out.println("product: Amazon");
				pi.amazon(nameofproduct, 12000, "2M", 5, amazonwarrenty);
				System.out.println("Warrenty : " + productwarranty(amazonwarrenty));
				System.out.println("------------------------------------");
				System.out.println("Thank you for purchasing our product");
				System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
				System.out.println("|Our Other Amazon products|");
				System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
				amazonwarrentyy();
				b = false;
				break;
			case "2":
				int flipkartwarranty = 3;
				bp.setNameofproduct(nameofproduct);
				System.out.println("product: Flipkart");
				pi.flipkart(nameofproduct, 13000, "1.5M", 4.5, flipkartwarranty);
				System.out.println("Warranty :" + productwarranty(flipkartwarranty));
				System.out.println("------------------------------------");
				System.out.println("Thank you for purchasing our product");
				flipkartwarrentyy();
				b = false;
				break;
			case "3":
				int ajio = 4;
				bp.setNameofproduct(nameofproduct);
				System.out.println("product: Ajio");
				pi.Ajio(nameofproduct, 14000, "500k", 4, ajio);
				System.out.println("Warranty: " + productwarranty(ajio));
				System.out.println("------------------------------------");
				System.out.println("Thank you for purchasing our product");
				ajiowarrenty();
				b = false;
				break;
			default:
				System.out.println("ENter valid data:");
				nameofproduct = sc.next();
				return;
			}
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
		System.out.println("please choose the product(App,Amazon prime,Amazon smart home)");

		boolean b = true;
		while (b) {
			String product1 = product.next();

			switch (product1.toLowerCase()) {
			case "app":
				System.out.println("The cost is 400000");
				System.out.println("Date of release:Next month");
				System.out.println("pre Register: 20k");
				System.out.println("Special discount for Members");
				b = false;
				break;
			case "amazonprime":
				System.out.println("The cost is 600000");
				System.out.println("Date of release:Next month");
				System.out.println("pre Register: 10k");
				System.out.println("Special discount for Members");
				b = false;
				break;
			case "amazonsmarthome":
				System.out.println("The cost is 800000");
				System.out.println("Date of release:Not yet confirmed");
				System.out.println("pre Register:1k");
				System.out.println("Special discount for Members");
				b = false;
				break;
			case "exit":
				System.exit(0);
			default:
				System.out.println("ENter the valid data");

			}

		}

		return amazonwarrentyy();
	}

	public static int flipkartwarrentyy() {
		Scanner product = new Scanner(System.in);
		System.out.println("please choose the product (APP,Flipkartshow,flipkart smart home)");
		boolean b = true;
		while (b) {
			String product1 = product.next();
			switch (product1.toLowerCase()) {
			case "app":
				System.out.println("The cost is 300000");
				System.out.println("Date of release:Next month");
				System.out.println("pre Register: 21k");
				System.out.println("Special discount for Members");
				b = false;
				break;
			case "flipkartshow":
				System.out.println("The cost is 600000");
				System.out.println("Date of release:Next month");
				System.out.println("pre Register: 12k");
				System.out.println("Special discount for Members");
				b = false;
				break;
			case "flipkart smart home":
				System.out.println("The cost is 800000");
				System.out.println("Date of release:Not yet confirmed");
				System.out.println("pre Register:5k");
				System.out.println("Special discount for Members");
				b = false;
				break;
			default:
				System.out.println("ENter the valid data");
				product1 = product.next();

			}
		}

		return flipkartwarrentyy();

	}

	public static int ajiowarrenty() {
		Scanner product = new Scanner(System.in);
		System.out.println("please choose the product (AjioaPP,Jio Tv, Jio smart home)");
		boolean b = true;
		while (b) {
			String product1 = product.next();
			switch (product1.toLowerCase()) {
			case "ajioapp":
				System.out.println("The cost is 400000");
				System.out.println("Date of release:Next month");
				System.out.println("pre Register: 26k");
				System.out.println("Special discount for Members");
				b = false;
				break;
			case "jio tv":
				System.out.println("The cost is 500000");
				System.out.println("Date of release:Next month");
				System.out.println("pre Register: 13k");
				System.out.println("Special discount for Members");
				b = false;
				break;
			case "jio smart home":
				System.out.println("The cost is 600000");
				System.out.println("Date of release:Not yet confirmed");
				System.out.println("pre Register :5k");
				System.out.println("Special discount for Members");
				b = false;
				break;
			default:
				System.out.println("ENter the valid data");
				product1 = product.next();

			}
		}

		return ajiowarrenty();
	}

}
