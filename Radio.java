class Radio{

	static boolean isConnected = false;
	
	public static void turnOn(){
	System.out.println("start of turn on");
	if(isConnected == false){
		isConnected = true;
		System.out.println("Radio is turn On");
	
	}
	System.out.println("End of turn On");
	return;
	}
	
	public static void turnOff(){
	
	System.out.println("Start of turn Off");
	
	if(isConnected == true){
		isConnected = false;
		System.out.println("Radio is turn Off");
	}
		System.out.println("End of turn Off");
		return;
	
	}
}