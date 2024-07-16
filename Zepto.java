class Zepto{

	public static double search(String itemName){
	
	double itemPrice = 0.0;
	System.out.println("Search item started");
	
	if(itemName == "Chocolate") return itemPrice = 15.00;
	
	else{
	
	System.out.println(itemName + "Not found");
	}
	System.out.println("Search item ended");
	return itemPrice;
	
	}

	public static double search(String itemName , int quantity){
	 
	 double itemPrice = 0.0;
	 System.out.println("Search item started");
	 
	 if(itemName == "Chocolate") return itemPrice = 15.00*quantity;
	
	else{
	
	System.out.println(itemName + "Not found");
	}
	System.out.println("Search item ended");
	return itemPrice;
	
	
	}
}