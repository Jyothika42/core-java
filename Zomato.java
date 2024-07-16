class Zomato{

	public static double search(String foodName){
	
	double foodPrice = 0.0;
	
	System.out.println("Search Food Name started");
	
	if(foodName == "Sugar Free Classic Cold Coffee") return foodPrice = 229.00;
	else{
	System.out.println(foodName + "Not found");
	}
	System.out.println("Search Food Name ended");
	return foodPrice;
	}
 
	public static double search(String foodName , int quantity){
	
	double foodPrice = 0.0;
	System.out.println("Search Food Name started");
	 
	if(foodName == "Sugar Free Classic Cold Coffee") return foodPrice = 229.00*quantity;
	
	else{
	System.out.println(foodName + "Not found");
	}
	System.out.println("Search Food Name ended");
	return foodPrice;
	}
	
}