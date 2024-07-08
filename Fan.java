class Fan{

	static boolean isConnected = false;
	
	public static void turnOn(){
	System.out.println("Start of turn On");
	if(isConnected == false){
		isConnected = true;
		System.out.println("Fan turn On");
		}
	System.out.println("End of turn On");
	return;
	}
	
	
	public static void turnOff(){
	
	System.out.println("Start of turn Off");
	
	if(isConnected == true){
		isConnected = false;
		System.out.println("Start of turn Off");
	}
	System.out.println("end of turn Off");
	return;
	}
	
	
}