class Swiggy{

	public static double getFoodPiceByName(String foodName){
	
	double getPrice = 0.0;
	System.out.println("Get Food Pice By Name Started");
	if(foodName == "Shahi Veg Biryani & Kebab Combo") return getPrice = 325.45;
	
	if(foodName == "Mushroom Biryani 2") return getPrice = 365.00;
	
	if(foodName == "Aloo Pattice Chaat") return getPrice = 159.00;
	
	if(foodName == "Royal Paneer Curry Combo") return getPrice = 349.00; 

	if(foodName == "Royal Paneer Daawat")return getPrice = 649.00;
	
	if(foodName == "Veg Daawat for 1-2: Biryani +Kebabs +Beverage") return getPrice = 496.00;
	
	if(foodName == "Zaikedaar Paneer Biryani")return getPrice = 359.00;
	
	if(foodName == "Subz-e-Biryani") return getPrice = 325.00;
	
	if(foodName == "Paneer Subz Biryan") return getPrice = 359.00;
	
	if(foodName == "Hyderabadi Chicken Biryani")return getPrice = 310.00;
	
	if(foodName == "Chicken Anarkali Dry") return getPrice = 300.00;
	  
	if(foodName == "French Chicken Dry") return getPrice = 300.00;
	
	if(foodName == "Chicken Hyderabadi Masala") return getPrice = 290.00;
	
	if(foodName == "Tandoori Chicken") return getPrice = 290.00;
	
	if(foodName == "Plain Naan") return getPrice = 50.00;
	
	if(foodName == "Plain Kulcha") return getPrice = 25.00;
	
	if(foodName == "Rice And Biryani") return getPrice = 310.00;
	
	if(foodName == "Mutton Biryani") return getPrice = 370.00;
	
	if(foodName == "Boneless Special Chicken Biryani") return getPrice = 340.00;
	
	if(foodName == "Godavari Spl Biriyani") return getPrice = 360.00;
	
	else{
	System.out.println(foodName + "Not Found");
	}
	System.out.println("Get Food Pice By Name endend");
	return getPrice;
}
	
	

	public static double getFoodPiceByName(String foodName,int quantity){
	  	 
	double getPrice = 0.0;
	 
    System.out.println("Get Swiggy Menu started");
	
	
	 if(foodName == "Shahi Veg Biryani & Kebab Combo") return getPrice = 325.45*quantity;
	
	if(foodName == "Mushroom Biryani  2") return getPrice = 365.00*quantity;
	
	if(foodName == "Aloo Pattice Chaat") return getPrice = 159.00*quantity;
	
	if(foodName == "Royal Paneer Curry Combo") return getPrice = 349.00*quantity; 

	if(foodName == "Royal Paneer Daawat")return getPrice = 649.00*quantity;
	
	if(foodName == "Veg Daawat for 1-2: Biryani +Kebabs +Beverage") return getPrice = 496.00*quantity;
	
	if(foodName == "Zaikedaar Paneer Biryani")return getPrice = 359.00*quantity;
	
	if(foodName == "Subz-e-Biryani") return getPrice = 325.00*quantity;
	
	if(foodName == "Paneer Subz Biryan") return getPrice = 359.00*quantity;
	
	if(foodName == "Hyderabadi Chicken Biryani")return getPrice = 310.00*quantity;
	
	if(foodName == "Chicken Anarkali Dry") return getPrice = 300.00*quantity;
	  
	if(foodName == "French Chicken Dry") return getPrice = 300.00*quantity;
	
	if(foodName == "Chicken Hyderabadi Masala") return getPrice = 290.00*quantity;
	
	if(foodName == "Tandoori Chicken") return getPrice = 290.00*quantity;
	
	if(foodName == "Plain Naan") return getPrice = 50.00*quantity;
	
	if(foodName == "Plain Kulcha") return getPrice = 25.00*quantity;
	
	if(foodName == "Rice And Biryani") return getPrice = 310.00*quantity;
	
	if(foodName == "Mutton Biryani") return getPrice = 370.00*quantity;
	
	if(foodName == "Boneless Special Chicken Biryani") return getPrice = 340.00*quantity;
	
	if(foodName == "Godavari Spl Biriyani") return getPrice = 360.00*quantity;
	
	else{
	System.out.println(foodName + "Not Found");
	}
	System.out.println("Get Swiggy Menu ended");
	return getPrice;
	
  
  }
}
 
	
		
	

