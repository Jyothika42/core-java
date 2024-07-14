class JioReachargePlansRunner{

	public static void main(String[] reacharge){
	System.out.println("Jio Reacharge Plans Runner started");
	String plan = "365 Days";
	double price = JioreachargePlans.getReachargPriceByName(plan);
	System.out.println( plan +  " reacharge amount is :" + price);
	System.out.println("Jio Reacharge Plans Runner ended");
	}


}