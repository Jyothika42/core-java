class WirelessMouse {
	
	public static void main(String wireless[]){
	fetchProductDetails();
	}
	
	static String brandName = "Portronics";
	static String colour = "Black";
	static String connectivityTechnology = "USB";
	static String specialFeature = "Wireless, Adjustable DPI, Compact, High Speed Scrolling, Ergonomic, Low Power Consumption,";
	static String movementDetectionTechnology = "Optical";
	int price = 560;
	
	public static void fetchProductDetails(){
	
	
	System.out.println("The Brand Name is "+brandName);
	System.out.println("The Colour is "+ colour );
	System.out.println("The Connectivity Technology  "+connectivityTechnology );
	System.out.println("The Special Feature is"+ specialFeature);
	System.out.println("The Movement Detection Technology is "+movementDetectionTechnology );
	return;
	}
}