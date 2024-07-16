class SwiggyRunner{
	
  public static void main(String[] tastyFood){
	
  System.out.println("Main started");	
  String name = "Mushroom Biryani 2";
  double price = Swiggy.getFoodPiceByName(name,2);
  System.out.println("The price for " + name + " is " + price);
  System.out.println("Main Ended");
  
  }
  
}
