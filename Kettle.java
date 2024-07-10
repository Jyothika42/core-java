class Kettle{

	static boolean isConnected = false;
	
	public static boolean onOrOff(){
	System.out.println("start of onOrOff ");
	if(isConnected == false){
		isConnected = true;
		System.out.println("Kettle is turn on");
	}else if(isConnected == true){
		isConnected = false;
		System.out.println("Kettle is turn off");
	}
		
	System.out.println("End of onOrOff");
	return isConnected;
	}

}