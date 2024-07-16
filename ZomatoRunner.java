class ZomatoRunner{

	public static void main(String[] tastyFood){
	System.out.println("Main started");
	
	String food = "Sugar Free Classic Cold Coffee";
	double price = Zomato.search(food,4);
	System.out.println("The price for " + food + "is" + price );
	
	System.out.println("Main Ended");
	}


}


