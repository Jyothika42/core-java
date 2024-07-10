class Speaker{

	static boolean isConnected = false;
	
	public static boolean onOrOff(){
	System.out.println("start of onOrOff ");
	
	if(isConnected == false){
		isConnected = true;
		System.out.println("Speaker is turn on");
	}else if(isConnected == true){
		isConnected = false;
		System.out.println("Speaker is turn off");
	}
		
	System.out.println("End of onOrOff");
	return isConnected;
	}

}