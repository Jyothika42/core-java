class Charger{


	public static void main(String[] hpCharger){
	
	fetchProductDetails();
	}
	
	public static void fetchProductDetails(){
	
	System.out.println("Fetch Product Details started");
	 String brandName = "MI";
	 String connectivityTechnology = "USB";
	 String connectorType = "USB";
	 String compatibleDevices = "Cellular Phones";
	 String compatiblePhoneModels = "Mi Phones";
	 String includedComponents = "Charger, 100cm Type C Cable";
     String specialFeature =	"Fast Charging";
	 
	
	
	System.out.println("The Brand Name is "+brandName);
	System.out.println("The Connector Type is "+ connectorType  );
	System.out.println("The Compatible Devices "+compatibleDevices  );
	System.out.println("The Compatible Phone Models is"+ compatiblePhoneModels );
	System.out.println("The Included Components is "+includedComponents  );
	System.out.println("The Special Feature is "+specialFeature);
	System.out.println("Fetch Product Details ended");
	return;
	}
}