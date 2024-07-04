class Pen{
	public static void main(String cellosignature[]){
	fetchProductDetails();
	}
	
	public static void fetchProductDetails(){
	 String brandName = "Cello";
	 String colour = "Blue";
	 String inkColour = "Blue";
     String ageRange = "kids,adult";
	 String material = "Metal";
	 int price = 10;
	
	System.out.println("The brandName is "+ brandName);
	System.out.println("The Colour is "+ colour);
	System.out.println("The Ink Colour  is "+inkColour );
	System.out.println("The Age Range is "+ageRange);
	System.out.println("The material "+ material);
	System.out.println("The price is "+ price);
	return;
	
	}

}