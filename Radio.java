class Radio{

	static boolean isConnected = false;
	
	public static boolean onOrOff(){
	System.out.println("start of turn on");
	if(isConnected == false){
		isConnected = true;
		System.out.println("Radio is turn On");
	}
		else if(isConnected == true){
			isConnected = false;
			System.out.println("Radio is turn off");
		}
	
	System.out.println("End of turn On");
	return isConnected;
	}
	
	
}