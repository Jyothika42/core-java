class Bulb{
	
	
	public static void main(String bulb[]){
	fetchProductDetails();
	}
	
	public static void fetchProductDetails(){
	 String brandName = "Crompton";
     String lightType = "LED";
	 String wattage	= "50 Watts";
	 String bulbBase = "B22D";
	 String lightColour = "White";
	 String voltage = "230 Volts";
	 int numberOfItems	= 10;
	
	System.out.println("The Brand Name is "+ brandName);
	System.out.println("The Light Type is "+ lightType );
	System.out.println("The Wattage is "+ wattage);
	System.out.println("The Bulb Base is "+ bulbBase);
	System.out.println("The Light Colour is "+ lightColour);
	System.out.println("The Voltage is "+ voltage);
	System.out.println("The Number of Items  is "+ numberOfItems );
	return;
	}



}