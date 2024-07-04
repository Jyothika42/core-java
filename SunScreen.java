class SunScreen {
	
	public static void main(String bodywise[] ){
	fetchProductDetails();
	}
	
	public static void fetchProductDetails(){
	String productDetails = "Protects against UVA/UVB rays & prevents sun tan";
	int sunProtectionFactor = 50;
	int weight = 13;
	int numberOfItems = 1;	
	int netQuality = 13;
	String skinType = "All";
	String activeIngredients ="Vitamin E,centella";

	String brandName = "Be Bodywise";
	
	System.out.println("The Product Details is "+ productDetails);
	System.out.println("The Sun Protection Factor is "+ sunProtectionFactor);
	System.out.println("The weight is "+  weight);
	System.out.println("The Number Of Itemsis "+ numberOfItems);
	System.out.println("The Net Quality is "+ netQuality);
	System.out.println("The Skin Type is "+ skinType);
	System.out.println("The Active Ingredients is "+  activeIngredients);
	return;	
		
	}
}