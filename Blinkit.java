class Blinkit{

	public static double search(String itemName){
	
	double itemPrice = 0.0;
	System.out.println("Search item started");
	
	if(itemName == "Mango Juice") return itemPrice = 100.00;
	
	else{
	
	System.out.println(itemName + "Not found");
	}
	System.out.println("Search item ended");
	return itemPrice;
	
	}

	public static double search(String itemName , int quantity){
	 
	 double itemPrice = 0.0;
	 System.out.println("Search item started");
	 
	 if(itemName == "Mango Juice") return itemPrice = 100.00*quantity;
	
	else{
	
	System.out.println(itemName + "Not found");
	}
	System.out.println("Search item ended");
	return itemPrice;
	
	
	}
}