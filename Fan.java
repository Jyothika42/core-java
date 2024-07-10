class Fan{

	static boolean isConnected = false;
	
	public static boolean onOrOff(){
	System.out.println("Start of onOrOff");
	if(isConnected == false){
		isConnected = true;
		System.out.println("Fan turn On");
		} else
		if(isConnected == true){
		isConnected = false;
		System.out.println("Fan turn off");
		}
	System.out.println("End of turn On");
	return isConnected;
	}
	
	
}