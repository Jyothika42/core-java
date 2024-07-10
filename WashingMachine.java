class WashingMachine{
	
	static boolean isConnected = false;
	
	public static boolean onOrOff(){
	
	System.out.println("Start of onOrOff");
	
	if(isConnected == false){
		isConnected = true;
		System.out.println("Washing machine is turn On");
	}
		else if(isConnected == true){
		isConnected = false;
		System.out.println("Washing Machine turn Off");
		}
			System.out.println("End of onOrOff");
			return isConnected;
	
	}
	
	
}