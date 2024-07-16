class ZeptoRunner{

	public static void main(String[] food){
	
	System.out.println("Search started");
	String item = "Chocolate";
	double price = Zepto.search(item,8);
	System.out.println("the total amount of " + item + " is " +price);
	System.out.println("Search ended");
	
	
	}
	



}




