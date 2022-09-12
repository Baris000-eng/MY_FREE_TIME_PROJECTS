import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Restaurant {

	public Restaurant() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		while(true) {
			Double totalCheck = 0.0;
			Integer orderedPizzaAmount, orderedHamburgerAmount = 0;
			Random random = new Random();
			double money = random.nextDouble(0,101);
			Customer customer = new Customer(money);
			int pizzaStock = 500;
			int hamburgerStock = 500;
			int colaStock = 500;
			int iceTeaStock = 500;
			int fantaStock = 500;
			int spriteStock = 500;
			int ayranStock = 500;
			int peopleCapacity = 125;
			int restaurantTableCapacity = 30;
			int peopleInOneTable = 4;
			// TODO Auto-generated method stub
			System.out.println("*******Welcome to the Restaurant Management App ******");
			System.out.println("Total Number of People to Reserve: ");
			Scanner scan = new Scanner(System.in);
			int peopleNum = scan.nextInt();
			peopleCapacity = peopleCapacity - peopleNum;
			restaurantTableCapacity = restaurantTableCapacity - (peopleNum%peopleInOneTable + peopleNum/peopleInOneTable);
			System.out.println("****Restaurant Menu******\n"
					+ "Foods: \n"
					+ "1-) Pizza\n" 
					+ "2-) Hamburger \n"
					+ "Cold Beverages: \n"
					+ "1-) Coca Cola \n"
					+ "2-) Ice Tea \n"
					+ "3-) Fanta \n"
					+ "4-) Sprite \n"
					+ "5-) Ayran \n");
			
			String[]foodsArray = { "Pizza", "Hamburger"};
			Integer[]foodPricesArray = {50,60};
			List<String> foods = Arrays.asList(foodsArray);
			List<Integer> foodPrices = Arrays.asList(foodPricesArray);
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your food choice: ");
		    int choice = scanner.nextInt();
		    System.out.println("How many "+foods.get(choice)+"/"+foods.get(choice)+"s do you want ?");
		    int amount = scanner.nextInt();
		    try {
		    	switch(choice) {
		    	case 0:
		    		int amountAdded1 = amount * foodPrices.get(0);
		    		totalCheck += amountAdded1;
		    		pizzaStock-=1;
		    	case 1:
		    		int amountAdded2 = amount * foodPrices.get(1);
		    		totalCheck += amountAdded2;
		    		hamburgerStock-=1;
		    	}
		    } catch(ArithmeticException aex) {
		    	aex.printStackTrace();
		    	System.out.println("Invalid choice from the foods ! \n");
		    }
		    
		    String[]coldBeveragesArray = { "Coca Cola", "Ice Tea", "Sprite", "Fanta","Ayran"};
			Double[]coldBeveragePricesArray = {7.5,7.5,7.5,7.5,5.0};
			List<String> coldBeverages = Arrays.asList(coldBeveragesArray);
			List<Double> coldBeveragePrices = Arrays.asList(coldBeveragePricesArray);
			Scanner s = new Scanner(System.in);
			System.out.println("Enter your cold beverage choice: ");
		    int c = scanner.nextInt();
		    System.out.println("How many "+coldBeverages.get(c)+"/"+coldBeverages.get(c)+"s do you want ?");
		    int num = scanner.nextInt();
		    if(0<=choice && choice<4) {
		    	totalCheck+=coldBeveragePrices.get(0);
		    	if(choice == 0) {
		    		colaStock-=1;
		    	} else if(choice == 1) {
		    		iceTeaStock-=1;
		    	} else if(choice == 2) {
		    		spriteStock-=1;
		    	} else if(choice == 3) {
		    		fantaStock-=1;
		    	} else {
		    		ayranStock-=1;
		    	}
		    } else {
		    	try {
		    		if(choice > 0) {
			    		totalCheck+=coldBeveragePrices.get(coldBeverages.size()-1);
			    	} 
		    	} catch(ArithmeticException aex) {
		    		aex.printStackTrace();
		    		System.out.printf("Invalid choice from cold beverages");
		    	}
		    }
		    
		    
		    Supplier sup = new Supplier(10000,10000,10000);
		    if(ayranStock == 0) {
		        sup.setColdBeverageStock(sup.getColdBeverageStock() - 100);
		        ayranStock += 100;
		    } else if(colaStock == 0) {
		    	 sup.setColdBeverageStock(sup.getColdBeverageStock() - 100);
			     colaStock += 100;
		    } else if(iceTeaStock == 0) {
		    	 sup.setColdBeverageStock(sup.getColdBeverageStock() - 100);
			     iceTeaStock += 100;
		    } else if(spriteStock == 0) {
		    	sup.setColdBeverageStock(sup.getColdBeverageStock() - 100);
		    	spriteStock += 100;
		    } else if(fantaStock == 0) {
		    	sup.setColdBeverageStock(sup.getColdBeverageStock() - 100);
		    	fantaStock += 100;
		    } else if(hamburgerStock == 0) {
		    	sup.setHamburgerStock(sup.getHamburgerStock() - 100);
		    	hamburgerStock += 100;
		    } else if(pizzaStock == 0) {
		    	sup.setHamburgerStock(sup.getHamburgerStock() - 100);
		    	pizzaStock += 100;
		    }
			System.out.println("Do you want to get your bill ?");
			Scanner input = new Scanner(System.in);
			if(input.nextLine().toLowerCase().equalsIgnoreCase("y")) {
				System.out.println("Thank you for coming. Here is your bill. \n");
				System.out.println("Your total check is: " + totalCheck);
			} else {
				if(customer.getMoney() < totalCheck) {
					System.out.println("You should work in our restaurant for a week without money or \n"
							+ "You should pay the remaining money");
				} else {
					System.out.println("Enjoy your meal");
				}
			}
			if(choice < 0 || num < 0 || amount < 0 || c < 0) { //for imaginary cases
				break;
			} else if(restaurantTableCapacity == 0) {
				break;
			} else if(peopleCapacity == 0) {
				break;
			} else if(sup.getColdBeverageStock() == 0) {
		    	System.out.println("Supplier is unable to provide cold beverages ! \n");
		    	break;
		    } else if(sup.getHamburgerStock() == 0) {
		    	System.out.println("Supplier is unable to provide hamburgers ! \n");
		    	break;
		    } else if(sup.getPizzaStock() == 0) {
		    	System.out.println("Supplier is unable to provide pizzas ! \n");
		    	break;
		    } else if(sup.getColdBeverageStock() == 0 && sup.getHamburgerStock() == 0 
		    		&& sup.getPizzaStock() == 0){
		    	System.out.println("Supplier cannot provide anything ! \n");
		    	break;
		    }
		    
		}
			
	}
		
	    
	  
	    
		
		

}

	    
	  
	    
		
		

}


